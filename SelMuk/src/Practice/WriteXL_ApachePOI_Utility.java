package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXL_ApachePOI_Utility {
	public static void main(String []args){
		 
		  try {
		 
		 
		 
		  File src=new File("C:\\Users\\paddu\\Desktop\\Auto\\testdata.xls");
		 
		  FileInputStream fis=new FileInputStream(src);
		 
		  HSSFWorkbook wb=new HSSFWorkbook(fis);
		 
		   HSSFSheet sh1= wb.getSheetAt(0);
		 
		 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
		 System.out.println(sh1.getRow(0).getCell(2).getStringCellValue());//to see pass
		 
		 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
		 
		 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		 
		// here createCell will create column
		 
		// and setCellvalue will set the value
		 
		 sh1.getRow(0).createCell(2).setCellValue("sai");
		 
		 sh1.getRow(1).createCell(2).setCellValue("ram");
		 
		 sh1.getRow(2).createCell(2).setCellValue("jai");
		 System.out.println(sh1.getRow(0).getCell(2).getStringCellValue());
		 System.out.println(sh1.getRow(1).getCell(2).getStringCellValue());
		 System.out.println(sh1.getRow(2).getCell(2).getStringCellValue());
		 
		 
		// here we need to specify where you want to save file
		 
		 FileOutputStream fout=new FileOutputStream(src);
		 
		 
		// finally write content 
		 
		 wb.write(fout);
		 
		// close the file
		 
		 fout.close();
		 
		  } catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		 
		  }
		 
		 }
		 

}
