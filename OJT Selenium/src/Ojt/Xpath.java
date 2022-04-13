package Ojt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver =new ChromeDriver();
		
   driver.navigate().to("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");	
	driver.findElement(By.xpath("//input[@class='form-control'][@id='email']")).sendKeys("kiran@gmail.com");	
	driver.findElement(By.xpath("//input[@placeholder='password' or @id='password']")).sendKeys("123456");
	
	String text=driver.findElement(By.xpath("//*[text()='Sign in to start your session']")).getText();
	System.out.println(text);
	//driver.findElement(By.xpath("//*[contains(@type,'it')]")).click();
	driver.findElement(By.xpath("//*[starts-with(@class,'btn')]")).click();
	
	}

}
