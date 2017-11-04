package Pack1;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPage {
	public static void main(String[] args) throws Exception {
	    Logger logger=Logger.getLogger("ScrollPage");
        
		 
	       // configure log4j properties file
	       PropertyConfigurator.configure("Log4j.properties");
		  
		 // load browser
		  WebDriver driver=new FirefoxDriver();
		 
		 
		 // maximize browser
		  driver.manage().window().maximize();
		 
		 
		  // Open Application
		 // driver.get("http://jqueryui.com");
		  driver.get("http://www.softwaretestinghelp.com/handle-alerts-popups-selenium-webdriver-selenium-tutorial-16/");
		  
		 
		  // Wait for 5 second
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(".//*[@id='om-lightbox-coupon-container']/a")).click();
		  logger.info("done");
		  
		 
		 // This  will scroll page 400 pixel vertical
		  ((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
		  logger.info("scrolled");
		  
		     
		 }

}
