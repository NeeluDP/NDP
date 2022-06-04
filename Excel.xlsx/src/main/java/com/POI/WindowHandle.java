package com.POI;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	
	WebDriver driver;
	
	@Test
	public void test01() throws Exception{
		
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	
	//there is only onw window in the browser
	List<WebElement> links=driver.findElements(By.partialLinkText("info"));
	
	String mainWin=driver.getWindowHandle();
	
	for (WebElement link : links) {
		
		link.click();
		Thread.sleep(1000);
	}
	//there are five windows in the browser
	Set<String> allWins=driver.getWindowHandles();
	
	for (String win : allWins) 
	{
		System.out.println("id of a window is :" +win);
		if(!win.equals(mainWin))
		{
			driver.switchTo().window(win);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
		}
		else {
			System.out.println("user is already on parent window");
		}
		
	}
	
	
	}
	
	

}
