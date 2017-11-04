package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Library.Utility;

public class SyncUsingUtility {
	@Test
	public void checkBuses()
	{
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("https://www.redbus.in/");
	 
	Utility.isElementPresnt(driver,".//*[@id='txtSource']", 20).sendKeys("Bangalore");
	 
	Utility.isElementPresnt(driver,".//*[@id='txtDestination']", 20).sendKeys("Chennai");

}
}
