package Library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityScreenshot {
	public static void captureScreenshot(WebDriver driver)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File fs=ts.getScreenshotAs(OutputType.FILE);
			//if you wan to save in local drive save as below
			//File fd= new File("C:\\Users\\paddu\\Desktop\\DT\\Study\\Selenium\\Screenshot\\fb7.png");
			//The below wat is to save in local folder of eclipse
			File fd= new File("./Screenshot/fb8.jpg");
			
			FileUtils.copyFile(fs, fd);
			System.out.println(" captured");
		} catch (Exception e)
		{
			System.out.println("exception while taking screenshot");
		} 
		}
		

}
