package Pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadNumericExcelApachePOI {
	@Test
	public void test1() throws Throwable, IOException
	{
	
	 // return the path of local path of project
         String path=System.getProperty("C:\\Users\\paddu\\workspace\\SelMuk");		
		
         // load workbook
	 XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(path+"C:\\Users\\paddu\\Desktop\\testdata.xls")));
		
        // read numeric data 
	int data= (int)wb.getSheetAt(0).getRow(0).getCell(1).getNumericCellValue();
	
        // print on console
	System.out.println("Data from Excel is >>> "+data);
		
	}
	

}
