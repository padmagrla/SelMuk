package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DataDrivenFW {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test(dataProvider="testdata")
	public void TestFireFox(String uname,String password) throws InterruptedException{
	 
	// Open browsre
	driver=new FirefoxDriver();
	 
	 
	// Maximize browser
	driver.manage().window().maximize();
	 
	 
	// Load application
	driver.get("http://www.facebook.com");
	 
	 
	// clear email field
	 
	driver.findElement(By.id("email")).clear();
	 
	 
	// Enter usename
	driver.findElement(By.id("email")).sendKeys(uname);
	 
	 
	 
	// Clear password field
	driver.findElement(By.id("pass")).clear();
	 
	 
	 
	// Enter password
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.xpath(".//input[@value='Log In']")).click();
	Thread.sleep(5000);
	System.out.println(driver.getTitle());
	
	Assert.assertEquals(driver.getTitle().contains("fb"),"user not able to login with valid credentials");
	System.out.println("page title verified user login succesfully");
	
	
	}
	 
	// this is DataProvider which actually feed data to our test cases here I have taken 2 D //array with 2 rows and 2 column it means. It will run our test case two times because we //have taken 2 rows. While first iteration this will pass username and password to test //case and in second iteration perform the same for second rows
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
	 
	 
	// Create object array with 2 rows and 2 column- first parameter is row and second is //column
	Object [][] facebookdata=new Object[2][2];
	 
	 
	 
	// Enter data to row 0 column 0
	facebookdata[0][0]="padmatadela@gmail.com";
	 
	 
	 
	// Enter data to row 0 column 1
	facebookdata[0][1]="psyntel123$";
	 
	 
	 
	// Enter data to row 1 column 0
	facebookdata[1][0]="Selenium2@gmail.com";
	 
	// Enter data to row 1 column 0
	facebookdata[1][1]="Password2";
	 
	// return arrayobject to testscript
	return facebookdata;
	}
	public void TearDown()
	{
		driver.quit();
		
	}

}
