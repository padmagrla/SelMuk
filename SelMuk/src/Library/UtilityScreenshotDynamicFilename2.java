package Library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityScreenshotDynamicFilename2 {
	// this class mailnly we are using to generate extent report 
	//for this we need path of scrrenshot thats why we are returning "dest"
	public static String captureScreenshot(WebDriver driver,String ScreenshotName)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File fs=ts.getScreenshotAs(OutputType.FILE);
			//TO SAVE IN LOCAL DRIVE
			String dest="C:\\Users\\paddu\\Desktop\\DT\\Study\\Selenium\\Screenshot\\"+ScreenshotName+".jpg";
			File fd= new File(dest);
			//TO SAVE IN ECLIPSE LOCAL FOLDER
			//File fd= new File("./Screenshot/"+ScreenshotName+".jpg");
			FileUtils.copyFile(fs, fd);
			System.out.println(" captured");
			return dest; 
		} catch (Exception e)
		{
			System.out.println("exception while taking screenshot   "+e.getMessage());
			return e.getMessage();
		}
		
		}

}
