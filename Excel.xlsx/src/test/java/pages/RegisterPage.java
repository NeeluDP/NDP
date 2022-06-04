package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
	
	WebDriver driver=null;
	
	public RegisterPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this); //this ki jagah RegisterPage.class b likh sakte hai
	
	
	}
	By firstName=By.xpath("//input[@placeholder='First Name']");
	
	//@FindBy(xpath="//input[@placeholder='First Name'] ")
	//WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastName;
	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	WebElement add;
	
	@FindBy(xpath="//input[@ng-model='radiovalue']")
	List<WebElement> genders;
	
	public void enterFirstName(String value){
		//firstName.sendKeys(value);
		sendkeys(firstName,value);
	}
	
	public void enterLastName(String value){
		//lastName.sendKeys(value);
		sendkeys(lastName, value);
	}
	public void enterAddress(String value){
		//add.sendKeys(value);
		sendkeys(add, value);
	}
	public void selectGender(String value){
//		for (WebElement gender : genders) {
//			if (gender.getAttribute("value").equalsIgnoreCase(value)) {
//				gender.click();
//				break;
//			}
//			}
		
		selectRedioButton(genders, value);
	}
}
