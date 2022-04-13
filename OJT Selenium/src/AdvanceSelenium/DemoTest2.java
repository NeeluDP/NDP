package AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
WebDriver driver;
	
	
	@Test(groups="login")
	public void verfyLoginTitle(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	@Test(groups="login", dependsOnMethods="verfyLoginTitle")
	public void login(){
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		//Assert.assertTrue(true);
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

	@Test(dependsOnGroups="login")
	public void dash(){
		
		WebElement header= driver.findElement(By.tagName("abc")); 
		
		Assert.assertTrue(header.isDisplayed());//if any function fails
	}
	

	//@Test(dependsOnMethods="dash", enabled=false)//when we enabled  in that time that case will ignore(mean it not ready to excution 
	public void user(){
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
	}
	

}



