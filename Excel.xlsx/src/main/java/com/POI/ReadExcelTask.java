

package com.POI;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

public class ReadExcelTask {

	public DataFormatter df = new DataFormatter();
	WebDriver driver;
	int count=1;
	public String getCelldata(String filePath, String sheetName, int row,int col)throws Exception{
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		return df.formatCellValue(sh.getRow(count).getCell(col));
	}
	@Test
	public void checkCoursesOptions() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("file:///C:/Users/a2z/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	    driver.manage().window().maximize();
	    
		ArrayList<String> alExp = new ArrayList<String>();
		ArrayList<String> alAct = new ArrayList<String>();
	
		while(count<7) {
			
			String options=getCelldata("TestDataExcel1.xlsx","Dashboard", count, 0);
			alExp.add(options);
		
			count++;
		}
		List<WebElement> lists=driver.findElements(By.xpath("//li/a/span"));
		for (WebElement List1 : lists) {
			String options=List1.getText();
			alAct.add(options);
		}
		Assert.assertEquals(alAct, alExp);
}
}