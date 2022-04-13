package Ojt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
	driver.navigate().to("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	driver.findElement(By.xpath("//ul/li[3]/a")).click();
	
	List<WebElement> gg=driver.findElements(By.tagName("tr"));
	System.out.println(gg.size());
	
	for (WebElement ng : gg) {
		String ss=ng.getText();
		System.out.println(ss);
		
	}
	
//
//	driver.findElement(By.xpath("//button")).click();
//	WebElement ff=driver.findElement(By.xpath("//select"));
//	Select s1= new Select(ff);
//	List<WebElement> aa=s1.getOptions();
//	for (WebElement web : aa) {
//		System.out.println(web.getText());
		
	//}
//	
//	driver.findElement(By.xpath("//button")).click();
//	WebElement ff=driver.findElement(By.xpath("//select"));
//	Select s1= new Select(ff);
//	s1.selectByIndex(1);
//	s1.selectByValue("HP");
//	s1.selectByVisibleText("Delhi");
	//s1.getAllSelectedOptions();
//	
//	
	
	
	
//	driver.findElement(By.xpath("//button")).click();
//	String ff1=driver.findElement(By.xpath("//select")).getText();
//	
//	System.out.println(ff1);
	
	
//	
//	driver.findElement(By.xpath("//button")).click();
//	for (int i = 1; i <=5; i++) 
//	{
//		WebElement ee=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select/option["+i+"]"));
//		System.out.println(ee.getText());
//	}
	

	}

	}
