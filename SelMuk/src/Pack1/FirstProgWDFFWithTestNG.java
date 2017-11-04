package Pack1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstProgWDFFWithTestNG {
@Test
	public void TestFF() {
	Logger logger=Logger.getLogger("FirstProgWDFFWithTestNG");
      PropertyConfigurator.configure("Log4j.properties");


     // Open browser
     WebDriver driver = new FirefoxDriver();
     logger.info("Browser Opened");
		driver.get("http://www.facebook.com");
		Reporter.log("FB Appl opened");
		 
        System.out.println("Application title is ============="+driver.getTitle());

        driver.quit();

	}

}
