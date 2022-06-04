package com.POI;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logings {
	WebDriver driver;
	int count =1;
	@Test
	public void test01() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Register")).click();
		while(count<4){
		String name =ReadExcel.getCelldata("TestData.xlsx", "register", count, 0);
		String mobile =ReadExcel.getCelldata("TestData.xlsx", "register", count, 1);
		String email =ReadExcel.getCelldata("TestData.xlsx", "register", count, 2);
		String password =ReadExcel.getCelldata("TestData.xlsx", "register", count, 3);
	
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("mobile")).sendKeys(mobile);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
		
		Alert al=driver.switchTo().alert();
		al.accept();
		driver.navigate().refresh();
		count++;
}
	}
	
	@Test
	public void test02() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		while(count<6){
		String email =ReadExcel.getCelldata("TestData.xlsx", "login2", count, 0);
		String password =ReadExcel.getCelldata("TestData.xlsx", "login2", count, 1);
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
		
		if(driver.getTitle().equals("JavaByKiran | Dashboard")){
			
			WriteExcel.writeData("TestData.xlsx", "login2", count, 2, "PASS");
			
			driver.findElement(By.linkText("LOGOUT")).click();
			
			}
		else
		{
			WriteExcel.writeData("TestData.xlsx", "login2", count, 2, "FAIL");
		  driver.navigate().refresh();
		
	}
		count++;
}}
}