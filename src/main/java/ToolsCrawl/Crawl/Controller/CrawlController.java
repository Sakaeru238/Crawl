package ToolsCrawl.Crawl.Controller;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Object.ExcelFile;
import Object.Product;
import Services.ConvertRawDataServices;
import Services.ReadExcelServices;
import Services.WriteExcelServices;

public class CrawlController {
	

	
	public static void main( String[] args )
    {
		ReadExcelServices excelServices = new ReadExcelServices();
		ConvertRawDataServices convertRawDataServices = new ConvertRawDataServices();
		WriteExcelServices writeExcelServices = new WriteExcelServices();
		
		List<ExcelFile>  rawData = excelServices.readExcelFile();
		List<Product> product = convertRawDataServices.convertRawData(rawData);
		writeExcelServices.writeCrawDataFile(product);
		
		
    }

}
