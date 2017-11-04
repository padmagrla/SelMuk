package Pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyAlertWithPredefinedcode {
	@Test
    public void TestAL() throws InterruptedException{
 
        // Load Firefox browser
 
         WebDriver driver=new FirefoxDriver();
 
      
 
        driver.get("http://www.ksrtc.in/oprs-web/");
 
 
 
        driver.manage().window().maximize();
 
 
        driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();
 
 
        driver.quit();
	}
	//include the following code in any class to handle alert automatically
	public static void handleAlert(WebDriver ldriver){
		 
        if(isAlertPresent(ldriver)){

        Alert alert = ldriver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();}

        }
        public static boolean isAlertPresent(WebDriver ldriver){
        	 
            try{

            ldriver.switchTo().alert();

            return true;

            }catch(NoAlertPresentException ex){

            return false;

            }

        }

}
