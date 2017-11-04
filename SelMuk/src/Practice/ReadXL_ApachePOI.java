package Practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL_ApachePOI {
	public static void main(String []args){
		  
		  try {
		  // Specify the path of file
		  File src=new File("C:\\Users\\paddu\\Desktop\\a.xls");
		 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		  HSSFWorkbook wb=new HSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		     HSSFSheet sh1= wb.getSheetAt(0);
		 
		 
		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		 
		  } catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		 
		  }
		  
		 }

}
