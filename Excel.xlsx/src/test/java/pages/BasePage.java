package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver ) {
		this.driver= driver;
	}
	
	public void sendkeys(WebElement elem,String value){
		
		//Thread.sleep(3000);
		
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(null);  //2
//		driver.findElement(null);  //2
//		driver.findElement(null);  //2
//		driver.findElement(null);  //2
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(elem));
		elem.clear();
		elem.sendKeys(value);
		}
	public void sendkeys(By by,String value){
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(value);
	}
	
	public void click(WebElement elem){
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		elem.click();
		}
	
	public void selectRedioButton(List<WebElement> elems,String value){
		for (WebElement elem : elems) {
			if (elem.getAttribute("value").equalsIgnoreCase(value)) {
				elem.click();
				break;
			}
			
		}
		
	}

}
