package Framework;

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

public class DataDrivenFWUsingXLGlassdoor {
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
	driver.get("https://www.glassdoor.com/profile/login_input.htm?userOriginHook=HEADER_SIGNIN_LINK");
	}
	 
	@Test(dataProvider="testdata")
	public void TestFireFox(String uname,String password1) throws InterruptedException
	 
	{
	 

	driver.findElement(By.id("signInUsername")).sendKeys(uname);
	
	driver.findElement(By.id("signInPassword")).sendKeys(password1);
	driver.findElement(By.id("signInBtn")).click();
	Thread.sleep(5000);
	System.out.println(driver.getTitle());
	
	}
	 
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
	 
	try {
	 
	// load workbook
	wb=Workbook.getWorkbook(new File("C:\\Users\\paddu\\Desktop\\Auto\\testdataGlass.xls"));
	 
	// load sheet in my case I am referring to first sheet only
	sh1= wb.getSheet(0);
	 
	// get number of rows so that we can run loop based on this
	numrow=  sh1.getRows();
	}
	catch (Exception e)
	 
	{
	e.printStackTrace();
	}
	 
	// Create 2 D array and pass row and columns
	Object [][] Glassdata=new Object[numrow][sh1.getColumns()];
	 
	// This will run a loop and each iteration  it will fetch new row
	for(int i=0;i<numrow;i++){
	 
	// Fetch first row username
		Glassdata[i][0]=sh1.getCell(0,i).getContents();
	// Fetch first row password
		Glassdata[i][1]=sh1.getCell(1,i).getContents();
	 
	}
	 
	// Return 2d array object so that test script can use the same
	return Glassdata;
	}
	 
	@AfterTest
	public void QuitTC(){
	 
	// close browser after execution
	driver.quit();
	}

}
