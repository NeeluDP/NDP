package com.POI;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameEX {
	
	WebDriver driver;
	
	@Test
	public void verifyLoginTitle() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		//Thread.sleep(10000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(3000);
		WebElement frame =driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		Thread.sleep(3000);
		String main=driver.getWindowHandle();
		driver.switchTo().frame(frame);
		//driver.findElement(By.id("mobileNoInp")).sendKeys("1234567890");
		driver.findElement(By.id("newFbId")).click();
		
		Set<String> allWins= driver.getWindowHandles();
		for(String win :allWins){
			if(!win.equals(main))
				driver.switchTo().window(win);
		}
			
		driver.manage().window().maximize();
	
		
		
		driver.findElement(By.id("email")).sendKeys("neelugoverdhan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("loginbutton")).click();
		
		
		
}}