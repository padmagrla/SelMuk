package Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Library.Utility;
import Library.UtilityScreenshot;
import Library.UtilityScreenshotDynamicFilename;
import Library.UtilityScreenshotDynamicFilename2;

public class ExtentReportVerifyTitle {
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	 
	 
	@Test
	public void verifyBlogTitle()
	{
	report=new ExtentReports("C:\\Users\\paddu\\Desktop\\DT\\Study\\Selenium\\Reports\\LearnAutomation.html");
	 
	logger=report.startTest("VerifyBlogTitle");
	 
	driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	logger.log(LogStatus.INFO, "Browser started ");
	 
	driver.get("https://www.facebook.com/");
	 
	logger.log(LogStatus.INFO, "Application is up and running");
	 
	String title=driver.getTitle();
	 
	Assert.assertTrue(title.contains("Sgoogg")); 
	 
	logger.log(LogStatus.PASS, "Title verified");
	}
	 
	 
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	 
	
	String screenshot_path=UtilityScreenshotDynamicFilename2.captureScreenshot(driver, result.getName());
	String image= logger.addScreenCapture(screenshot_path);
	logger.log(LogStatus.FAIL, "Title verification", image);
	 
	 
	}
	 
	report.endTest(logger);
	report.flush();
	 
	driver.get("C:\\Users\\paddu\\Desktop\\DT\\Study\\Selenium\\Reports\\LearnAutomation.html");
	}
	 

}
