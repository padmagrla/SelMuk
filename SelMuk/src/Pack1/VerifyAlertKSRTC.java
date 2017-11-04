package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyAlertKSRTC {
	@Test
    public void TestAL() throws InterruptedException{
 
        // Load Firefox browser
 
         WebDriver driver=new FirefoxDriver();
 
       // Open KSRTC website
 
        driver.get("http://www.ksrtc.in/oprs-web/");
 
        // Maximize the window
 
        driver.manage().window().maximize();
 
        // Click on Search Availability Service button
 
        driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
 
        // Switch to alert window and capture the text and print
 
        System.out.println(driver.switchTo().alert().getText());
 
        // Pause testcase for 5 second
 
          Thread.sleep(5000);
 
        // click on ok button
 
        driver.switchTo().alert().accept();
 
        // Close browser
 
        driver.quit();
	}

}
