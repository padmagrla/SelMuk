package Pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Library.UtilityScreenshotDynamicFilename;


public class ScreenshotWithUtilityDynamic {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("padma");
		UtilityScreenshotDynamicFilename.captureScreenshot(driver,"fb1");
		//using the above line we can access the Screnshot code from Utility class of Library code folde
		
		
		
		
		driver.quit();

	}

}
