package Services;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Object.ExcelFile;
import Utils.Constants;

public class ReadExcelServices {
	
	public List<ExcelFile> readExcelFile(){
		List<ExcelFile> excelFiles = new ArrayList<>();
		try {
			FileInputStream inputStream = new FileInputStream(new File(Constants.WINDOW_INPUT_FILE_PATH));
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet rawDataSheet = workbook.getSheetAt(0);
			excelFiles = readRawDataFile(rawDataSheet);		
		} catch (Exception e) {
			System.out.print(e.getMessage().toString());
			System.out.print("Error When Read Raw Data File");
		}		
		return excelFiles;
	}
	
	
	private List<ExcelFile> readRawDataFile(Sheet sheet) {
		List<ExcelFile> datas = new ArrayList<ExcelFile>();
		
		Iterator<Row> iterator = sheet.iterator();
		iterator.next();
		while (iterator.hasNext()) {
			ExcelFile data = new ExcelFile();
			Row row = iterator.next();
			DataFormatter dataFormatter = new DataFormatter();
			boolean isEmpty = true;
			if (row != null) {
				for (Cell cell : row) {
					if (dataFormatter.formatCellValue(cell).trim().length() > 0) {
						isEmpty = false;
						break;
					} else {
						System.out.println("Empty row");
					}
				}
			}

			if (row != null && !isEmpty) {
				data = ConvertRowToData(row);
				datas.add(data);
			}
		}
		
		return datas;
	}
	
	
	private ExcelFile ConvertRowToData(Row row) {
		
		ExcelFile rowData = new ExcelFile();
		
		// Title
		if (String.valueOf(row.getCell(0)) == null || String.valueOf(row.getCell(0)).isEmpty()
				|| String.valueOf(row.getCell(0)).equals("null")) {
			rowData.setTitle(Constants.EMPTY_STRING);
		} else {
			rowData.setTitle(row.getCell(0).toString());
		}
		
		// Type
		if (String.valueOf(row.getCell(1)) == null || String.valueOf(row.getCell(1)).isEmpty()
				|| String.valueOf(row.getCell(1)).equals("null")) {
			rowData.setType(Constants.EMPTY_STRING);
		} else {
			rowData.setType(row.getCell(1).toString());
		}
		// Image
		List<String> images = new ArrayList<String>();
		for(int i=2; i<(Constants.IMAGE_COLLUMN_MAX+2); i++) {
			String imageLink = new String();
			if (String.valueOf(row.getCell(i)) == null || String.valueOf(row.getCell(i)).isEmpty()
					|| String.valueOf(row.getCell(0)).equals("null")) {
				imageLink = Constants.EMPTY_STRING;
			} else {
				imageLink = row.getCell(i).toString();
				imageLink = imageLink.replace(Constants.SPACE, "");
			}
			images.add(imageLink);
		}
		rowData.setImageUrls(images);
		
		return rowData;		
	}

}
