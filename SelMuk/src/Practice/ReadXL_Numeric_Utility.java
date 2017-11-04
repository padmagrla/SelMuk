package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL_Numeric_Utility {
	XSSFWorkbook wb;
	public ReadXL_Numeric_Utility(String pathProj,String pathXls) throws Exception, IOException
	{
		String path=System.getProperty(pathProj);		
		
	 wb=new XSSFWorkbook(new FileInputStream(new File(path+pathXls)));
	
	 }

	 public int getDataNumeric(int sheetNo,int row,int col) {
		 int data= (int)wb.getSheetAt(sheetNo).getRow(row).getCell(col).getNumericCellValue();
			return data;
	}
}
		
		
	
	
	
		
	


