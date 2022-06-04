package com.POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class UserExcel {
	
	static Sheet sh=null;
	static Row r=null;
	static Cell c=null;
	
	@Test
	public void writeEX() throws Exception{
		FileInputStream fis =new FileInputStream("TestData2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		if(wb.getSheet("Sheet1")==null)
			sh=wb.createSheet("Sheet1");
		else
			sh=wb.getSheet("Sheet1");
		
		if(sh.getRow(1)==null)
			r=sh.createRow(1);
		
		else
			r=sh.getRow(1);
		
		if(r.getCell(3)==null)
		c=r.createCell(3);
		
		else
			c=r.getCell(3);
		
		c.setCellValue("//tr[2]/td[2]");
			
		FileOutputStream fos =new FileOutputStream("TestData2.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
	}
	
	public static void writeData(String filePath, String sheetName, int row, int col,String data) throws Exception{
		
		FileInputStream fis =new FileInputStream(filePath);
		Workbook wb=  WorkbookFactory.create(fis);
		
		if(wb.getSheet(sheetName)==null)
			sh=wb.createSheet(sheetName);
		
		else
			sh=wb.getSheet(sheetName);
		
		if(sh.getRow(row)==null)
			r=sh.createRow(row);
		
		else
			r=sh.getRow(row);
		
		if(r.getCell(col)==null)
			c=r.createCell(col);
		else
			c=r.getCell(col);
		
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(filePath);
		wb.write(fos);
		wb.close();
		fos.close();
	}
	


}
