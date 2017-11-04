package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class VerifyFileDownload {
	public static void main(String[] args) {
		  
		// Create a profile
		FirefoxProfile profile=new FirefoxProfile();
		 
		// Set preferences for file type first field from about:config search never ask 
		//2nd from mime types(ex .exe,.doc,.pdf)
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		  
		// Open browser with profile                   
		WebDriver driver=new FirefoxDriver(profile);
		  
		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		// Maximize window
		driver.manage().window().maximize();
		  
		// Open APP to download application
		driver.get("http://filehippo.com/download_avg-antivirus-free/");
		  
		// Click on download 
		driver.findElement(By.xpath(".//*[@id='program-header']/div[2]/div[2]/a[1]")).click();
		    
		 }
}
