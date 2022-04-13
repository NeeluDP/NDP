package testNG2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderEX {
  @Test(dataProvider = "dpMethod")
  
  public void f(Object ...b){
	  // public void f(Integer n, String s,Long l,boolean b,char c) {
	  // System.out.println();
	  
	  for (Object object : b) {
		 System.out.println(object);
	}
  }

  @DataProvider
  public Object[][] dpMethod() {
    return new Object[][] {
      new Object[] { 1, "jbk",5264396125L,true,'c'},
      new Object[] { 2, "2",123456226L,true,'c'},
      new Object[] {2 },
      new Object[] { 2, "2"},
      
      //new Object[] { 0, 0},
      //new Object[] { -1, 2},
      //new Object[] { 100, 200},
     //new Object[] { 124652792, 123456789},
     //new Object[] { -2, -2},
            
    };
  }
}
