package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	WebDriver driver=null;
	
	public HomePage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Email id for Sign Up']")
	WebElement email;
	
	public void enterEmail(String value){
		sendkeys(email ,value);
		
	}

}
