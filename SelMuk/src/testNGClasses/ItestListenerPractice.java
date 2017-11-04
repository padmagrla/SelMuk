package testNGClasses;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//Click on class name-Add unimplented methods this gives all the methods
//Replace the arg0 with result to avoid confusion
//http://testng.org/doc/documentation-main.html#testng-listeners  official site

import Library.UtilityScreenshotDynamicFilename;

public class ItestListenerPractice implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test cases on Finished Resulted are  " +result.getName());
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Test cases on Started Resulted are  " +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test cases onTestFailedButWithinSuccessPercentage are  " +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test cases onTestFailure are  " +result.getName());
	
		//UtilityScreenshotDynamicFilename.captureScreenshot(driver, result.getName());
    	System.out.println("Screen shot captured=====");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test cases onTestSkipped are  " +result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test cases onTestStart are " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test cases onTestSuccess are  " +result.getName());
		
	}

}
