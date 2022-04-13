package AdvanceSelenium;


	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeOptions;
	import org.openqa.selenium.ie.InternetExplorerOptions;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class GridEx {

		RemoteWebDriver driver=null;
		String nodeUrl="http://localhost:4444/wd/hub";
		
		@Parameters("port")
		@BeforeClass
		public void setup(String port)throws Exception {
			if(port.equals("4455")) {
				ChromeOptions options= new ChromeOptions();
				options.setCapability("browser", "Chrome");
				options.setCapability("platform", "WINDOWS");	
				driver= new RemoteWebDriver(new URL(nodeUrl),options);
			}
			if(port.equals("4456")) {
				
				InternetExplorerOptions options = new InternetExplorerOptions();
				options.setCapability("browser", "edge");
				options.setCapability("useAutomationExtension", false);
				driver= new RemoteWebDriver(new URL(nodeUrl),options);
			}
			driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
			driver.manage().window().maximize();
		}
		
		@Test
		public void test01() {
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button")).click();
			Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		}
	}



