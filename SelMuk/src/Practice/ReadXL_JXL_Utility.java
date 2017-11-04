package Practice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXL_JXL_Utility {
	Workbook wb;
	Sheet sh1;

	public ReadXL_JXL_Utility(String path){
	 
	
	File src=new File(path);
	 
	try {
	
	 wb=Workbook.getWorkbook(src);
	 
	sh1=    wb.getSheet(0);
	
	}
	
	catch (Exception e) {
		System.out.println(e.getMessage());
	} 
	}
	public String getDataJXL(int sheetNo,int row,int col)
	
	{
		String data=sh1.getCell(col,row).getContents();
		return data;
	}
	}
	
		 
