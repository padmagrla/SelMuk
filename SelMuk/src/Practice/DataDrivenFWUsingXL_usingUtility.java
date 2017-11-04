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

public class DataDrivenFWUsingXL_usingUtility {
	WebDriver driver;
	Workbook wb;
	Sheet sh1;
	int numrow;
	String username;
	String password;
	 
	@BeforeTest
	public void Setup()
	 
	{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	}
	 
	@Test(dataProvider="testdata")
	public void TestFireFox(String uname,String password1) throws InterruptedException
	 
	{
	 
		//DataDrivenFWUsingXL_utility.DataDrivenFWUsingXL_utility1("C:\\Users\\paddu\\Desktop\\Auto\\testdata.xls",1);
		DataDrivenFWUsingXL_utility.DataDrivenFWUsingXL_utility1("C:\\Users\\paddu\\Desktop\\Auto\\testdata.xls", 1);
	}
	 
	@AfterTest
	public void QuitTC(){
	 
	// close browser after execution
	driver.quit();
	}

}
