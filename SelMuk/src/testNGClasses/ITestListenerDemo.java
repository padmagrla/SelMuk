package testNGClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import Library.UtilityScreenshotDynamicFilename;

public class ITestListenerDemo implements ITestListener{
	WebDriver driver;
	 @Test
	    public void loginFB(){
	       
	       driver=new FirefoxDriver();
	        driver.get("http://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("email")).sendKeys("mukesh@facebook.com");
	        driver.findElement(By.id("wronglocator")).sendKeys("dont-tell");
	        driver.findElement(By.id("loginbutton")).click();
	    }
	    
	    
	    
	    
	    @Override
	    public void onFinish(ITestContext arg0) {
	        // TODO Auto-generated method stub
	       
	    }
	 
	    @Override
	    public void onStart(ITestContext arg0) {
	        // TODO Auto-generated method stub
	       
	    }
	 
	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	    }
	 
	    @Override
	    public void onTestFailure(ITestResult arg0) {
	    
	    	UtilityScreenshotDynamicFilename.captureScreenshot(driver, "FBTest");
	    	System.out.println("Screen shot captured====="+arg0.toString());
	       
	    }
	 
	    @Override
	    public void onTestSkipped(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	       
	    }
	 
	    @Override
	    public void onTestStart(ITestResult arg0) {
	        // TODO Auto-generated method stub
	        System.out.println("TestCase started====" +arg0.toString());
	       
	    }
	 
	    @Override
	    public void onTestSuccess(ITestResult arg0) {
	        // TODO Auto-generated method stub
	       
	        System.out.println("Congrates Testcase has been passed===="+ arg0.toString());
	       
	    }

}
