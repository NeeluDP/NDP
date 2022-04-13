package HandsOnSe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	
	static WebDriver driver=null;
	@BeforeClass
	public static void logincheck(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
	}
		
		@BeforeTest
	public void loginstatus(){
	System.out.println("Login Page Open Sucessfully");
	}
	
	@Test(priority=-1)
	public void title(){
		String ss=driver.findElement(By.xpath("//a[@href='#']")).getText();
		System.out.println(ss);
	}
		
	@Test(priority=-2)
	public void title2(){
		String ss=driver.findElement(By.xpath("//div[1]/a/b")).getText();
		Assert.assertEquals(ss,"Java By Kiran");
	}
		
	@Test(priority=-3)
	public void registertitle(){
	String ss=driver.findElement(By.partialLinkText("Register")).getText();
	Assert.assertEquals(ss,"Register a new membership");
		
	}

	@Test(priority=-4)
	public void loginboxmsg(){
	String lc=driver.findElement(By.xpath("//p[@class='login-box-msg']")).getText();
		Assert.assertEquals(lc,"Sign in to start your session");
	}
	
	@Test(priority=-5)
	public void emailsection(){
		String es=driver.findElement(By.xpath("//input[@id='email']")).getText();
		System.out.println(es);
	}
	@Test(priority=-6)
	public void buttontxt() throws Exception{
	String btn=	driver.findElement(By.xpath("//button")).getText();
	System.out.println(btn);
	//Thread.sleep(5000);
}
	@Test(priority=-7)
	public void logoCheck(){
		String actMsg=driver.findElement(By.xpath("//img")).getText();
		String exMsg = "";   //
		//driver.close();
		Assert.assertEquals(actMsg, exMsg);
	
	}
	@Test
	public void registerMember(){
		
		driver.findElement(By.xpath("//div[2]/a")).click();
		String title=driver.getTitle();
		System.out.println("Java By Kiran"+title);
	}
	
}
