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
import java.util.Date;
import java.util.List;

import Object.ExcelFile;
import Object.Product;
import Utils.BuildCategory;
import Utils.BuildTag;
import Utils.Constants;
import Utils.MLBTeamName;
import Utils.NFLTeamName;
import Utils.NHLTeamName;


public class ConvertRawDataServices {

	public List<Product> convertRawData (List<ExcelFile> excelFile){
		List<Product> products = new ArrayList<Product>();
		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());

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
			if(isNFLTeam(excelFile.get(i).getTitle())) {
				category = BuildCategory.NFLCategory(excelFile.get(i).getTitle());
				product.setCategory(category);
			} else if(isNHLTeam(excelFile.get(i).getTitle())) {
				category = BuildCategory.NHLCategory(excelFile.get(i).getTitle());
				product.setCategory(category);
			} else if(isMLBTeam(excelFile.get(i).getTitle())) {
				category = BuildCategory.MLBCategory(excelFile.get(i).getTitle());
				product.setCategory(category);
			}
			
			//Title
			String title = excelFile.get(i).getTitle();
			title = remoteUnUsedParameterInTiltle(title);
			product.setTitle(title);
			
			//ImageLink
			checkSameImageLink(excelFile.get(i));
			String imageLink = dowloadImage(excelFile.get(i), cloneSKU);
			product.setImageLink(imageLink);
			
			//Tag
			String tag = "";
			if(isNFLTeam(excelFile.get(i).getTitle())) {
				tag = BuildTag.NFLTag(excelFile.get(i).getTitle());
				product.setTag(tag);
			} else if(isNHLTeam(excelFile.get(i).getTitle())) {
				tag = BuildTag.NHLTag(excelFile.get(i).getTitle());
				product.setTag(tag);
			} else if(isMLBTeam(excelFile.get(i).getTitle())) {
				tag = BuildTag.MLBTag(excelFile.get(i).getTitle());
				product.setTag(tag);
			}
			
			products.add(product);
		}
		
		return products;
	}
	
	
	private String dowloadImage(ExcelFile excelFile, String sku) {		
		String imageLinks = "\"";
		try {
			for(int i=0; i<Constants.IMAGE_COLLUMN_MAX; i++) {
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
	
	private boolean isNFLTeam(String title) {
		
		boolean result = false;
		
		if(title.toLowerCase().contains(NFLTeamName.PARENT_CATEGORY.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.ArizonaCardinals_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.AtlantaFalcons_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.BuffaloBills_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.BaltimoreRavens_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.ChicagoBears_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.CincinnatiBengals_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.ClevelandBrowns_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.CarolinaPanthers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.DenverBroncos_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.DallasCowboysls_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.DetroitLions_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.GreenBayPackers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.HoustonTexans_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.IndianapolisColts_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.JacksonvilleJaguars_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.KansasCityChiefs_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.LosAngelesChargers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.LosAngelesRams_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.LasVegasRaiders_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.MiamiDolphins_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.MinnesotaVikings_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.NewEnglandPatriots_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.NewOrleansSaints_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.NewYorkGiants_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.NewYorkJets_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.PhiladelphiaEagles_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.PittsburghSteelers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.SanFrancisco49ers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.SeattleSeahawks_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.TampaBayBuccaneers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.TennesseeTitans_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NFLTeamName.Washington_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		
		return result;
	}
	
	private boolean isNHLTeam(String title) {
		
		boolean result = false;
		
		if (title.toLowerCase().contains(NHLTeamName.Arizona_Coyotes_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(NHLTeamName.Anaheim_Ducks_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Boston_Bruins_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Buffalo_Sabres_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Colorado_Avalanche_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Chicago_BlackHawks_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Columbus_Blue_Jackets_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Calgary_Flames_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Carolina_Hurricanes_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Detroit_Red_Wings_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Dallas_Stars_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Edmonton_Oilers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Florida_Panthers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Los_Angeles_Kings_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Montreal_Canadiens_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Minnesota_Wild_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.New_Jersey_Devils_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Nashville_Predators_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.NYI_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.NYR_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Ottawa_Senators_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Philadelphia_Flyers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Pittsburgh_Penguins_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.San_Jose_Sharks_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Seattle_Kraken_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.St_Louis_Blues_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Tampa_Bay_Lightning_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Toronto_Maple_Leafs_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Vancouver_Canucks_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Vegas_Golden_Knights_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Washington_Capitals_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		else if (title.toLowerCase().contains(NHLTeamName.Winnipeg_Jets_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		
		return result;
	}

	private boolean isMLBTeam(String title) {
		
		boolean result = false;
		
		if(title.toLowerCase().contains(MLBTeamName.PARENT_CATEGORY.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Atlanta_Braves_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Arizona_Diamondbacks_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Baltimore_Orioles_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Boston_Red_Sox_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Chicago_Cubs_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Cleveland_Guardians_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Cleveland_Indians_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Cincinnati_Reds_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Colorado_Rockies_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Chicago_White_Sox_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Detroit_Tigers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Houston_Astros_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Kansas_City_Royals_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Los_Angeles_Angels_of_Anaheim_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Los_Angeles_Angels_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Los_Angeles_Dodgers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Milwaukee_Brewers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Miami_Marlins_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Minnesota_Twins_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.New_York_Mets_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.NewYork_Yankees_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Oakland_Athletics_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Pittsburgh_Pirates_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.Philadelphia_Phillies_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().contains(MLBTeamName.San_Diego_Padres_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.San_Francisco_Giants_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.St_Louis_Cardinals_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Seattle_Mariners_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Toronto_Blue_Jays_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Tampa_Bay_Rays_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Texas_Rangers_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Washington_Nationals_FULL_NAME.toLowerCase())) {
			result = true;
			return result;
		}
		return result;
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
