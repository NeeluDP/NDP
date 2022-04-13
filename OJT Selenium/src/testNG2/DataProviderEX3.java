package testNG2;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;

public class DataProviderEX3 {
  @Test(dataProvider = "dpMethod")
  
  public void f(String a, String b){
	  
	  
	  System.out.println(a);
	 System.out.println(b);
	}
  

  @DataProvider
  public Object[][] dpMethod() throws Exception {
	  FileInputStream fis=new FileInputStream("testData1.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		int row=sheet.getRows();
		int col=sheet.getColumns();
		
		
		String Exdata[][]=new String[row][col];
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				
				Cell cc=sheet.getCell(j,i); //col,row
				String data= cc.getContents();
				Exdata[i][j]=data;
				
			}
			
			

			
            
            
    }
		return Exdata;
		
  }
  
}
