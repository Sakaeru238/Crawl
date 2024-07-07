package Services;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import Object.ExcelFile;
import Object.Product;
import Utils.BuildCategory;
import Utils.BuildTag;
import Utils.CheckSportBrand;
import Utils.Constants;
import Utils.MLBTeamName;
import Utils.NFLTeamName;
import Utils.NHLTeamName;


public class ConvertRawDataServices {

	public List<Product> convertRawData (List<ExcelFile> excelFile){
		List<Product> products = new ArrayList<Product>();
		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());

		try {
			for(int i=0; i<excelFile.size(); i++) {
				Product product = new Product();
				
				DecimalFormat formatter = new DecimalFormat("00");
				String aFormatted = formatter.format(i);
				String cloneSKU = Constants.CLONE_SKU + Constants.UNDER_SCORE + date.toString() + Constants.UNDER_SCORE + aFormatted;
				product.setSku(cloneSKU);
				
				//Type
				product.setType(excelFile.get(i).getType());
				
				//Category
				String category = "";
				System.out.println(excelFile.get(i).getTitle());
				if(CheckSportBrand.isNFLTeam(excelFile.get(i).getTitle())) {
					category = BuildCategory.NFLCategory(excelFile.get(i).getTitle());
					product.setCategory(category);
				} else if(CheckSportBrand.isNHLTeam(excelFile.get(i).getTitle())) {
					category = BuildCategory.NHLCategory(excelFile.get(i).getTitle());
					product.setCategory(category);
				} else if(CheckSportBrand.isMLBTeam(excelFile.get(i).getTitle())) {
					category = BuildCategory.MLBCategory(excelFile.get(i).getTitle());
					product.setCategory(category);
				} else if (CheckSportBrand.isAFLTeam(excelFile.get(i).getTitle())) {
					category = BuildCategory.AFLCategory(excelFile.get(i).getTitle());
					product.setCategory(category);
				} else if (CheckSportBrand.isNRLTeam(excelFile.get(i).getTitle())) {
					category = BuildCategory.NRLCategory(excelFile.get(i).getTitle());
					product.setCategory(category);
				} else if (CheckSportBrand.isNLLTeam(excelFile.get(i).getTitle())) {
					category = BuildCategory.NLLCategory(excelFile.get(i).getTitle());
					product.setCategory(category);
				} else {
					category = Constants.DEFAULT_STRING;
					product.setCategory(category);
				}
				
				//Title
				String title = excelFile.get(i).getTitle();
				title = remoteUnUsedParameterInTiltle(title);
				product.setTitle(title);
				
				//ImageLink
				checkSameImageLink(excelFile.get(i));
				excelFile.get(i).getImageUrls().removeAll(Arrays.asList("", null));
				String imageLink = dowloadImage(excelFile.get(i), cloneSKU);
				product.setImageLink(imageLink);
				
				//Tag
				String tag = "";
				if(CheckSportBrand.isNFLTeam(excelFile.get(i).getTitle())) {
					tag = BuildTag.NFLTag(excelFile.get(i).getTitle());
					product.setTag(tag);
				} else if(CheckSportBrand.isNHLTeam(excelFile.get(i).getTitle())) {
					tag = BuildTag.NHLTag(excelFile.get(i).getTitle());
					product.setTag(tag);
				} else if(CheckSportBrand.isMLBTeam(excelFile.get(i).getTitle())) {
					tag = BuildTag.MLBTag(excelFile.get(i).getTitle());
					product.setTag(tag);
				}
				
				//Price
				if (String.valueOf(excelFile.get(i).getPrice()) == null || String.valueOf(excelFile.get(i).getPrice()).isEmpty()
	    				|| String.valueOf(excelFile.get(i).getPrice()).equals("null")) {
					product.setPrice(Constants.EMPTY_STRING);
	    		} else {
	    			product.setPrice(excelFile.get(i).getPrice());
	    		}
				
				products.add(product);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.toString());
			System.out.println("Error thread down anh");
		}
		
		
		
		return products;
	}
	
	
	private String dowloadImage(ExcelFile excelFile, String sku) {		
		String imageLinks = "\"";
		try {
			for(int i=0; i<excelFile.getImageUrls().size(); i++) {
				if(excelFile.getImageUrls().get(i) != null || !excelFile.getImageUrls().get(i).isEmpty()) {
					
					URL url = new URL(excelFile.getImageUrls().get(i));
					BufferedInputStream bis = new BufferedInputStream(url.openStream());
					
					DecimalFormat formatter = new DecimalFormat("00");
					String aFormatted = formatter.format(i);
					String imagePath = Constants.IMAGE_OUTPUT_FILE_PATH + sku + Constants.UNDER_SCORE + "Image" + Constants.UNDER_SCORE + aFormatted + Constants.IMAGE_EXTENSION;
					
					FileOutputStream fis = new FileOutputStream(imagePath);
			        byte[] buffer = new byte[1024];
			        int count=0;
			        while((count = bis.read(buffer,0,1024)) != -1)
			        {
			            fis.write(buffer, 0, count);
			        }
			        					
					//BufferedInputStream in = new BufferedInputStream(new URL(excelFile.getImageUrls().get(i)).openStream());
										
					//Files.copy(in, Paths.get(imagePath));
					String link = Constants.TYPE_DEFAULT_IMAGE_STRING + sku  + Constants.UNDER_SCORE + "Image" + Constants.UNDER_SCORE + aFormatted + Constants.IMAGE_EXTENSION;
					if(i == 0) {
						imageLinks = imageLinks + link;
					} else {
						imageLinks = imageLinks + Constants.COMAS + link;
					}
					
					fis.close();
			        bis.close();
			        
					//in.close();
				}				
			}	    
		} catch (IOException e) {
		    // handle IOException
			System.out.println(e.toString());
			System.out.println("Error Khi down anhr : " + excelFile.getTitle());
		}
		imageLinks = imageLinks + "\"";
		return imageLinks;
	}
	
	private void checkSameImageLink(ExcelFile excelFile) {
		for (int x = 0; x < excelFile.getImageUrls().size(); x++) {
			for (int y = x + 1; y < excelFile.getImageUrls().size(); y++) {
				// if (x == y) break;
				if (excelFile.getImageUrls().get(x).equals(excelFile.getImageUrls().get(y))) {
					excelFile.getImageUrls().set(y, "");
					break;
				}
			}
		}	
	}
	
	private String remoteUnUsedParameterInTiltle(String title) {
		if(title.contains(Constants.UNUSED_STRING_NEW)) {
			title = title.replace(Constants.UNUSED_STRING_NEW, "");
		}
		if(title.contains(NHLTeamName.PARENT_CATEGORY)) {
			title = title.replace(NHLTeamName.PARENT_CATEGORY, "");
		}
		if(title.contains(NFLTeamName.PARENT_CATEGORY)) {
			title = title.replace(NFLTeamName.PARENT_CATEGORY, "");
		}
		if(title.contains(MLBTeamName.PARENT_CATEGORY)) {
			title = title.replace(MLBTeamName.PARENT_CATEGORY, "");
		}
		title = title.trim();
		return title;
	}
}
