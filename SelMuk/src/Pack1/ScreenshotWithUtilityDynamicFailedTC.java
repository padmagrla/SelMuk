package Pack1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.UtilityScreenshotDynamicFilename;


public class ScreenshotWithUtilityDynamicFailedTC {

	WebDriver driver;
	 
	@Test
	public void captureScreenshot() throws Exception
	{
	 
	// Initiate Firefox browser
	driver=new FirefoxDriver();
	 
	// Maximize the browser
	driver.manage().window().maximize();
	 
	// Pass application url
	driver.get("http://www.facebook.com");
	 
	// Here we are forcefully passing wrong id so that it will fail our testcase
	driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");
	 
	 
	}
	 
	// It will execute after every test execution 
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	 
	// Here will compare if test is failing then only it will enter into if condition
	if(ITestResult.FAILURE==result.getStatus())
	{
		UtilityScreenshotDynamicFilename.captureScreenshot(driver,"hi");
	}
	driver.quit();

}
}
