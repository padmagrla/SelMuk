package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelApachePOI {
	XSSFWorkbook wb;
	XSSFSheet sh1;
	
	public ReadExcelApachePOI(String excelPath)
	{
	try {
		File src=new File(excelPath);
		 
		   FileInputStream fis=new FileInputStream(src);
		 
		  wb=new XSSFWorkbook(fis);
		   
		    sh1= wb.getSheetAt(0);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
	}
	public String getData(int sheetNo,int row,int col)
	
	{
		String data=sh1.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	 

}
