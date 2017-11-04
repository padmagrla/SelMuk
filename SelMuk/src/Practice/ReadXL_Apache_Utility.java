package Practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL_Apache_Utility {
	HSSFWorkbook wb;
	HSSFSheet sh1;
	public ReadXL_Apache_Utility(String excelPath)
	{
		
		try {
			  // Specify the path of file
			  File src=new File(excelPath);
			 
			   // load file
			   FileInputStream fis=new FileInputStream(src);
			 
			  wb=new HSSFWorkbook(fis);
			   
			 sh1= wb.getSheetAt(0);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	} 
	}
	public String getData(int sheetNo,int row,int col)
	
	{
		String data=sh1.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
		 

}
