package Ojt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.navigate().to("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	//System.out.println(driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	
	
	
	String tagname=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getTagName();
	System.out.println(tagname);
	System.out.println(driver.findElement(By.tagName(tagname)).getText());
	
	

	//driver.findElement(By.partialLinkText("More")).click();
//	System.out.println(driver.getTitle());
//	driver.navigate().back();
//	System.out.println(driver.getTitle());
//	driver.navigate().forward();
//	System.out.println(driver.getTitle());
//	driver.navigate().forward();
//	driver.close();
	//driver.quit();
	
	}

}
