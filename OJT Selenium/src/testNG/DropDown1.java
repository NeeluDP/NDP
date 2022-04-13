package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium%20software/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span")).click();
		String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		String exResult="User delete successfully.";
		
		driver.switchTo().alert().accept();  //dismiss();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();


	}

}
