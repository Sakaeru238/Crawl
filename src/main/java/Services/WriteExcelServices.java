package Services;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.opencsv.CSVWriter;

import Object.Product;
import Utils.Constants;

public class WriteExcelServices {
	
	public void writeCrawDataFile(List<Product> products) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		System.out.println(formatter.format(date));
		
		String filepath = Constants.WINDOW_OUTPUT_FILE_PATH;
		
		try {
			
			String fileName = filepath + Constants.RAW_DATA_FILE_NAME + "_" + formatter.format(date) + Constants.FILE_EXTENSION;
			
			File file = new File(fileName);
			
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile, ',', CSVWriter.NO_QUOTE_CHARACTER, '\0',
					CSVWriter.DEFAULT_LINE_END);
			
			// adding header to csv
			String[] header = createCsvHeader();
			writer.writeNext(header);
			
			for(Product product : products) {
				String[] data = { product.getSku(), product.getType(), product.getCategory(), product.getTitle(), product.getTag(),  product.getImageLink() };
				System.out.println(product.getSku());
				writer.writeNext(data);
			}
			
			// closing writer connection
			writer.close();
			
			
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println("Error Khi Tao File Craw Data");
		}
		
		
	}
	
	private String[] createCsvHeader() {
		String[] csvHeader = new String[54];

		csvHeader[0] = Constants.HEADER_SKU;
		csvHeader[1] = Constants.HEADER_Type;
		csvHeader[2] = Constants.HEADER_CATEGORY;
		csvHeader[3] = Constants.HEADER_TITLE;
		csvHeader[4] = Constants.HEADER_TAG;
		csvHeader[5] = Constants.HEADER_IMAGE_LINK;
		return csvHeader;
	}

}
