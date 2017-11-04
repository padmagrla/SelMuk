package testNGClasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ testNGClasses.ItestListenerPractice.class })

public class ITListClassUsingITPractice {
	WebDriver driver;
	@Test
	public void verifyGoogleTitle()
	{
		 driver=new FirefoxDriver();
        driver.get("http://www.Google.com");
        driver.manage().window().maximize();
        System.out.println("title is  "+driver.getTitle());	
		
	}
	@Test
	public void verifyFailed()
	{
		
        System.out.println("Failed is  ");
        Assert.assertTrue(false);
        
		
	}

}
