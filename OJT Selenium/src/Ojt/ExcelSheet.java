package Ojt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelSheet {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("testData1.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		int row=sheet.getRows();
		int col=sheet.getColumns();
		System.out.println(row);
		System.out.println(col);
		
		
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				
				Cell cc=sheet.getCell(j,i); //col,row
				String data= cc.getContents();
				
				System.out.print(" | "+data+" | ");
				
			}
			System.out.println();
			
		}
	}

}
