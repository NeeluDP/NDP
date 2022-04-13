package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=-1)
  public void b() {
	  System.out.println("b");
	  
	  }
  @Test
  public void c() {
	  System.out.println("c");
	  
	  }
  @Test(priority=3)
  public void a() {
	  System.out.println("a");
	  
	  }
  @Test(priority=4)
  public void A() {
	  System.out.println("A");
	  
	  }
  @Test(priority=5)
  public void D() {
	  System.out.println("D");
	  
	  }
  
  
  
  
}
