package Pack1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotBaseClass {
	public static void captureScreenshot(WebDriver driver,String ScreenshotName)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File fs=ts.getScreenshotAs(OutputType.FILE);
			//TO SAVE IN LOCAL DRIVE
			File fd= new File("C:\\Users\\paddu\\Desktop\\DT\\Study\\Selenium\\Screenshot\\"+ScreenshotName+".jpg");
			//TO SAVE IN ECLIPSE LOCAL FOLDER
			//File fd= new File("./Screenshot/"+ScreenshotName+".jpg");
			FileUtils.copyFile(fs, fd);
			System.out.println(" captured");
		} catch (Exception e)
		{
			System.out.println("exception while taking screenshot");
		} 
		}

}
