package Pack1;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		Logger logger=Logger.getLogger("ScrollIntoView");
        
	       // configure log4j properties file
	       PropertyConfigurator.configure("Log4j.properties");
		 
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		
		 
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		 
		 
		 
		// Create instance of Javascript executor
		//Thread.sleep(3000);
		 
		JavascriptExecutor je = (JavascriptExecutor) driver;
		 
		 
		 
		//Identify the WebElement which will appear after scrolling down
		 
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_1_container']/p[6]"));
	
		// now execute query which actually will scroll until that element is not appeared on page.
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		 
		// Extract the text and verify
		 
		System.out.println(element.getText());
		logger.info("got text");
		 
		}
}
