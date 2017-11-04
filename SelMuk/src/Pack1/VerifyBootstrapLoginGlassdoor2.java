package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyBootstrapLoginGlassdoor2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://www.glassdoor.com/index.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='signInUsername']")).sendKeys("padma");*/
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='SubscriberForm-First Name-AJ70OnauO22ZFIoxcdXJi1']")).sendKeys("padma");
		driver.findElement(By.xpath(".//*[@id='SubscriberForm-Email-AJ70OnauO22ZFIoxcdXJi1']")).sendKeys("pg@gmailcom");
		driver.findElement(By.xpath(".//*[@id='sendx-submit-AJ70OnauO22ZFIoxcdXJi1']")).click();
		
		Thread.sleep(3000);
		
		

	}

}
