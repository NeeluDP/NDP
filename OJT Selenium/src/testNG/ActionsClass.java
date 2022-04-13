package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/add_user.html");

		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[1]/label"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("/html/body/div/div[2]/p"))).perform();
	//right click hota hai
		
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		WebElement uname= driver.findElement(By.id("username"));
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys(uname, "v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.doubleClick(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[3]/label"))).perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
	
	//css.selectore
		//css=<html tag>#<attributr value>
		//id#"email,  class.conform
	
	}

}
