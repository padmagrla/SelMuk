package Pack1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUsingApachePOI {
	public static void main(String []args){
		  
		  try {
		  // Specify the path of file
		  File src=new File("C:\\Users\\paddu\\Desktop\\Auto\\testdata.xls");
		 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		   HSSFWorkbook wb=new HSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		      HSSFSheet sh1= wb.getSheetAt(0);
		 
		  // getRow() specify which row we want to read.
		 
		  // and getCell() specify which column to read.
		  // getStringCellValue() specify that we are reading String data.
		 
		 
		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		 /*int rowCount=sh1.getLastRowNum();
		  * System.out.println( "count is"+rowCount+1);
		      for(int i=0;i<rowCount;i++)
		      {
		    	  
		    	  String data0=sh1.getRow(i).getCell(0).getStringCellValue();
		    	  System.out.println("data from row"+i+" is "+data0);
		      }*/
		 
		  } catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		 
		  }
		  
		 }

}
