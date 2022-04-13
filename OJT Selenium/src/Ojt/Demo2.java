package Ojt;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
	driver.navigate().to("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
  
	List<WebElement> pp= driver.findElements(By.partialLinkText("More"));
	System.out.println(pp.size());
	for (WebElement list : pp) {
		list.click();
	}
	Set<String> nn=driver.getWindowHandles();
	System.out.println("number of tabs open in browser>> "+nn.size());
	System.out.println(driver.getTitle());
	}
	
	
	
	//driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();
	
	//driver.findElement(By.linkText("Register a new membership")).click();
	//driver.findElement(By.partialLinkText("have")).click();
	
	
//	List<WebElement> d=driver.findElements(By.tagName("a"));
	//System.out.println(d.size());  // anchor tag counting
	
	
	
	//System.out.println(driver.findElement(By.tagName("a")).getText());
	//System.out.println(driver.findElements(By.tagName("a")).size());
	

	}


