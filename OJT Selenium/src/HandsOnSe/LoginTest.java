package HandsOnSe;



	import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class LoginTest {
		
		static WebDriver driver=null;
		@BeforeClass
		public static void logincheck(){
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button")).click();
			//driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
			driver.manage().window().maximize();
		}
			
			
			

				
			@Test
			public void DashboardTitle(){	
				
				String actMsg= driver.findElement(By.xpath("//h1")).getText();
				String exMsg= "Dashboard Courses Offered";
				System.out.println(exMsg);
				Assert.assertEquals(actMsg, exMsg);
		}
			@Test(priority=1)
			public void dashboardSubCourses(){
				driver.findElement(By.xpath("//li[2]/a/span")).getText();///
				
			ArrayList<String> alExp=new ArrayList<>();
			ArrayList<String> actList=new ArrayList<>();
			alExp.add("Automation Testing");
			alExp.add("Software Development");
			alExp.add("Data Science");
			alExp.add("Web Development");
			
			List<WebElement> listOfSubCourses=driver.findElements(By.xpath("//h3//following::p"));
			System.out.println(listOfSubCourses);
			
			for (WebElement courses : listOfSubCourses) {
				String courseName=courses.getText();
				actList.add(courseName);
				System.out.println(courseName);
				}
			Assert.assertEquals(actList, alExp);
			}
			@Test
			public void dashboardCourses(){
			driver.findElement(By.xpath("//li[2]/a/span")).getText();///
			ArrayList<String> alExp=new ArrayList<>();
			alExp.add("Selenium");
			alExp.add("Java / J2EE");
			alExp.add("Python");
			alExp.add("Php");
			ArrayList<String> alAct=new ArrayList<>();
			List<WebElement> listOfSubCourses=driver.findElements(By.xpath("//p//preceding::h3"));
			//System.out.println(listOfSubCourses);
			
			for (WebElement courses : listOfSubCourses) {
				String courseName=courses.getText();
				alAct.add(courseName);
				System.out.println(courseName);
				}
			Assert.assertEquals(alAct, alExp);
			}
			@Test(priority=2)
			public void checkHyperLink(){
				ArrayList<String> alAct1=new ArrayList<>();
				String act5=driver.findElement(By.xpath("//li[2]/a")).getText();
			    String act6=driver.findElement(By.xpath("//li[3]/a")).getText();
			    String act7=driver.findElement(By.xpath("//li[4]/a")).getText();
			    String act8=driver.findElement(By.xpath("//li[5]/a/span")).getText();
			    String act9=driver.findElement(By.xpath("//li[6]/a")).getText();
			    String act10=driver.findElement(By.xpath("//li[7]/a")).getText();
			    
			    alAct1.add(act5);
			    alAct1.add(act6);
			    alAct1.add(act7);
			    alAct1.add(act8);
			    alAct1.add(act9);
			    alAct1.add(act10);
			    
			    ArrayList<String> alExp=new ArrayList<String>();
			    alExp.add("Dashboard");
			    alExp.add("Users");
			    alExp.add("Operators");
			    alExp.add("Useful Links");
			    alExp.add("Downloads");
			    alExp.add("Logout");
			    Assert.assertEquals(alAct1,alExp);
				}
			@Test(priority=3)
			public void Dash_moreInfoLink(){
				
				List<WebElement> pp= driver.findElements(By.partialLinkText("More"));
				System.out.println(pp.size());
				for (WebElement list : pp) {
					list.click();
				}
				Set<String> nn=driver.getWindowHandles();
				System.out.println("number of tabs open in browser>> "+nn.size());
				System.out.println(driver.getTitle());
					
			}
			@Test(priority=4)
			public void userClick(){
				driver.findElement(By.xpath("//li[3]/a/span")).click();
				String act=driver.findElement(By.xpath("//h1")).getText();
				String exp="Users";
				System.out.println(act);
				Assert.assertEquals(act, exp);
				
			}
			@Test(priority=6)
			public void Delete_alert(){
				driver.findElement(By.xpath("//ul/li[3]/a")).click();
				driver.findElement(By.xpath("//tr[3]/td[8]/a/span")).click();
				String alert=driver.switchTo().alert().getText();
				System.out.println(alert);
				driver.switchTo().alert().accept();  //dismiss();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				Assert.assertEquals(alert, "Are you sure you want to delete this user");
				
			}
			@Test(priority=5)
			public void userList(){
				
				driver.findElement(By.xpath("//ul/li[3]/a")).click();
				String act=driver.findElement(By.xpath("//h1")).getText();
				String exp="Users";
				List<WebElement> gg=driver.findElements(By.tagName("tr"));
				System.out.println(gg.size());
				
				for (WebElement ng : gg) {
					String ss=ng.getText();
					System.out.println(ss);
			}
				Assert.assertEquals(act, exp);
			}
		@Test(priority=7)
		public void addUser(){
			
			ArrayList<Object> al=new ArrayList<>();
					
			driver.findElement(By.xpath("//ul/li[3]/a")).click();
			boolean act12=driver.findElement(By.xpath("//h1")).isDisplayed();
			driver.findElement(By.xpath("//a/button")).click();
			boolean act14=driver.findElement(By.xpath("//div/a/span")).isDisplayed();//cancel button
			boolean act15=driver.findElement(By.xpath("//button")).isDisplayed();
			
			driver.findElement(By.id("username")).sendKeys("Neelu");
			driver.findElement(By.id("mobile")).sendKeys("7485692477");
			driver.findElement(By.id("email")).sendKeys("neelugoverdhan@gmail.com");
			driver.findElement(By.id("course")).sendKeys("Java");
			driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
			Select ss=new Select(driver.findElement(By.xpath("//select")));
			ss.selectByValue("Maharashtra");
			driver.findElement(By.id("password")).sendKeys("2222");
			driver.findElement(By.xpath("//form/div[3]/div/input")).sendKeys("77777777");
			driver.findElement(By.xpath("//button")).click();
			String us = driver.switchTo().alert().getText();
			
			System.out.println(us);
			
			driver.switchTo().alert().accept();
			al.add(act12);
			al.add(act14);
			al.add(act15);
			al.add(us);
			
			ArrayList<Object> alexp=new ArrayList<>();
			
			alexp.add(true);
		   alexp.add(true);
			alexp.add(true);
			alexp.add("User Added Successfully. You can not see added user.");
			Assert.assertEquals(al, alexp);	
				}
		@Test(priority=8)
		public void operatorClick(){
			
			driver.findElement(By.xpath("//li[4]/a/span")).click();
			String act=driver.findElement(By.xpath("//h1")).getText();
			String exp="Operators";
			Assert.assertEquals(act, exp);
				}
		@Test(priority=9)
		public void operatorList(){
			
			driver.findElement(By.xpath("//li[4]/a/span")).click();
			String act=driver.findElement(By.xpath("//h1")).getText();
			String exp="Operators";
			
			List<WebElement> gg=driver.findElements(By.tagName("table"));
			System.out.println(gg.size());
			
			for (WebElement ng : gg) {
				String ss=ng.getText();
				System.out.println(ss);
			}
			Assert.assertEquals(act, exp);
		}
		@Test(priority=10)
		public void usefullLinks(){
			
			driver.findElement(By.xpath("//li[5]/a/span")).click();
			String act=driver.findElement(By.xpath("//h1")).getText();
			String exp="Useful Links";
			
			List<WebElement> gg=driver.findElements(By.tagName("table"));
			System.out.println(gg.size());
			
			for (WebElement ng : gg) {
				String ss=ng.getText();
				System.out.println(ss);
			}
			Assert.assertEquals(act, exp);	
		}
		@Test
		public void download_BoxTitle(){
			
			driver.findElement(By.xpath("//li[6]/a/span")).click();
			String act=driver.findElement(By.xpath("//div/div/div[1]/h3")).getText();
			String exp="Downloads List";
			Assert.assertEquals(act, exp);	
		}
		@Test(priority=11)
		public void Downloads_Official_Webside(){
			
			driver.findElement(By.xpath("//li[6]/a/span")).click();
			driver.findElement(By.xpath("//tr[2]/td[8]/a/span")).click();
			String act=driver.findElement(By.xpath("//h1")).getText();
			String exp="Downloads";
			Assert.assertEquals(act, exp);
			
		}
		@Test(priority=12)
		public void check_LogOut_successfully(){
			driver.findElement(By.xpath("//div/ul/li/a")).click();
			String actMsg=driver.findElement(By.xpath("//p[2]")).getText();
			String exMsg = "Logout successfully";   //
			//driver.close();
			Assert.assertEquals(actMsg, exMsg);
			
		}
		@Test(priority=13)
		  public void checkFooterText() {
			 
			  String actFooter=driver.findElement(By.xpath("//strong")).getText();
			  String expFooter= "Copyright © 2005-2019 JavaByKiran.";
			  System.out.println(actFooter);
		      Assert.assertEquals(actFooter, expFooter);
		  }
		@Test(priority=14)
		public void dashboard_Sidebar_header(){
			String act=driver.findElement(By.xpath("//section/ul/li[1]")).getText();
			String exp="MAIN NAVIGATION";
			System.out.println(act);
			Assert.assertEquals(act, exp);
			
		}
		  
			
			@AfterClass
			public void logout() {
			System.out.println("Close Current Window");
			//driver.close();
				
	}
	}
//	
////		
//	
//	String act1=driver.findElement(By.xpath("//div[1]/div/div[1]/h3")).getText();
//	String act2=driver.findElement(By.xpath("//div[2]/div/div[1]/h3")).getText();
//	String act3=driver.findElement(By.xpath("//div[3]/div/div[1]/h3")).getText();
//	String act4=driver.findElement(By.xpath("//div[4]/div/div[1]/h3")).getText();
//	
//	alAct.add(act1);
//	alAct.add(act2);
//	alAct.add(act3);
//	alAct.add(act4);
//	System.out.println(alExp);
//	Assert.assertEquals(alAct, alExp);
//	}
////
//
//
