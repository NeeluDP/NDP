package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterTest {
WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	
@Test
public void registerTest(){
	
	
	RegisterPage registerPage=new RegisterPage(driver);
	
	registerPage.enterFirstName("Ansh");
	registerPage.enterLastName("Goverdhan");
	registerPage.enterAddress("chandrapur");
	registerPage.selectGender("Male");
	
}
@Test
public void registerTest_01(){
	
	
	RegisterPage registerPage=new RegisterPage(driver);
	
	registerPage.enterFirstName("Addhvika");
	registerPage.enterLastName("kudve");
	registerPage.enterAddress("chandrapur");
	registerPage.selectGender("FeMale");
	
}



}
