package testNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anno2 {
  @Test
  public void test1() {
	  System.out.println("test 11");
	  
  }
  @Test
  public void test2() {
	  System.out.println("test 11");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside beforeMethod 22");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside afterMethod 22");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside beforeClass 22");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("inside afterClass 22");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("inside beforeTest 22");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("inside afterTest 22");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("inside beforeSuite 22");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("inside afterSuite 22");
  }

}

