package testNGClasses;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mx4j.log.Logger;

public class CrossBrowserTest {
	//Logger logger=Logger.getLogger("CrossBrowserTest");
	
	@Test
	 
	// Here this parameters we will take from testng.xml
	@Parameters("Browser")
	public  void test1(String browser) {
		 
	 
	if(browser.equalsIgnoreCase("FF")){
	 
	WebDriver driver=new FirefoxDriver();
	//Reporter.log("Browser Opened");
	 
	driver.manage().window().maximize();
	//Reporter.log("Window maximized");
	
	 
	driver.get("http://www.facebook.com");
	Reporter.log("FB Application Started");
	 
	driver.quit();
	 
	}
	else if(browser.equalsIgnoreCase("chrome")){
	 
		System.setProperty("webdriver.chrome.driver", "C:/Users/paddu/OneDrive/chromedriver.exe");
	 
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("https://www.youtube.com/");
	Reporter.log("Chrome Application Started");
	 
	driver.quit();
	}
	}

}
