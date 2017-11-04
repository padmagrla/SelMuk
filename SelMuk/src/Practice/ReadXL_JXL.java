package Practice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXL_JXL {
	@Test
	public void TestReadData(){
	 
	
	File src=new File("C:\\Users\\paddu\\Desktop\\a.xls");
	 
	try {
	
	Workbook wb=Workbook.getWorkbook(src);
	 
	Sheet sh1=    wb.getSheet(0);
	 
	Cell  c1=sh1.getCell(0,0);
	
	String data1=c1.getContents();
	
	System.out.println(data1);
	 
	System.out.println("Sheet data is "+data1);
	String data00=sh1.getCell(0,0).getContents();
	String data01=sh1.getCell(0,1).getContents();
	String data10=sh1.getCell(1,0).getContents();
	System.out.println(data00+"  "+data01+"  "+data10);
	} catch (BiffException e) {
	 
	e.printStackTrace();
	 
	} 
	catch (IOException e)
	{            
	e.printStackTrace();
	}

}
}
