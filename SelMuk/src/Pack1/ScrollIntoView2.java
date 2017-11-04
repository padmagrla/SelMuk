package Pack1;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollIntoView2 {
	public static void main(String[] args) throws InterruptedException {
		Logger logger=Logger.getLogger("ScrollIntoView");
        PropertyConfigurator.configure("Log4j.properties");
				WebDriver driver=new FirefoxDriver();
		 		driver.manage().window().maximize();
		 		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		 		JavascriptExecutor je = (JavascriptExecutor) driver;
		 		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_4_container']/p[8]"));
	
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		element.click();
		 		System.out.println(element.getText());
		logger.info("got text");
		 
		}
}
