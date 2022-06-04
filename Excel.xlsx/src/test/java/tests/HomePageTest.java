package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class HomePageTest {

WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Index.html");
	}
	
	public void homePageTest(){
		
		HomePage homePage =new HomePage(driver);
		homePage.enterEmail("neelu@gmail.com");
	}
}
