package com.POI;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadExcel {

	public static DataFormatter df = new DataFormatter();// to convert any cell into String format
	WebDriver driver;
	
	public static String getCelldata(String filePath, String sheetName, int row, int col)throws Exception  {
		
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		return df.formatCellValue(sh.getRow(row).getCell(col));
		
	}
	
	
	
	@Test
	public void loginTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		String uname= getCelldata("TestData.xlsx", "login", 1, 0);
		String pass= getCelldata("TestData.xlsx", "login", 1, 1);
		
		driver.findElement(By.id("email")).sendKeys(uname);
		
	
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();
	}
	
	@Test
	public void checkRegisterNewMember() throws Exception{
		
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
			String name=getCelldata("TestData.xlsx", "login", 1, 3);
			String mobile=getCelldata("TestData.xlsx", "login", 1, 2);
			String email=getCelldata("TestData.xlsx", "login", 1, 0);
			String pass=getCelldata("TestData.xlsx", "login", 1, 1);
			
			driver.findElement(By.xpath("//div[1]/input")).sendKeys(name);
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(mobile);
			driver.findElement(By.xpath("//div[3]/input")).sendKeys(email);
			driver.findElement(By.xpath("//div[4]/input")).sendKeys(pass);
			driver.findElement(By.xpath("//button")).click();;
			
		  
	}
	
	
	
	@Test
	public void readEx() throws Exception{
		FileInputStream fis = new FileInputStream("TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("login");
		int rows= sh.getLastRowNum();//3
		for(int i=0;i<=rows;i++) {
			int cols= sh.getRow(i).getLastCellNum();//1
			for(int j=0;j<cols;j++) {
				Cell c = sh.getRow(i).getCell(j);
				
				System.out.print(df.formatCellValue(c)+"  ");
			}
			System.out.println();
		}
		
	}
}
