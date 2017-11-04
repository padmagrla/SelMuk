package Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class DataDrivenFWUsingXL_utility {
	WebDriver driver;
	static Workbook wb;
	static Sheet sh1;
	static int numrow;
	String username;
	String password;
	By usID;
	By psID;
	@DataProvider(name="testdata")
	public static Object[][] DataDrivenFWUsingXL_utility1(String path,int a)
	{ 
	
		 
		try {
		
		wb=Workbook.getWorkbook(new File(path));
		
		sh1= wb.getSheet(a);
		 
		numrow=  sh1.getRows();
		}
		catch (Exception e)
		 
		{
		e.printStackTrace();
		}
	
		Object [][] facebookdata=new Object[numrow][sh1.getColumns()];
	
		for(int i=0;i<numrow;i++){
		
		facebookdata[i][0]=sh1.getCell(0,i).getContents();
	
		facebookdata[i][1]=sh1.getCell(1,i).getContents();
		 
		}
		 
		// Return 2d array object so that test script can use the same
		return facebookdata;
		}


}
