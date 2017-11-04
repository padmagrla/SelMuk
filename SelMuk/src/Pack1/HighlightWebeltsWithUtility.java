package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighlightWebeltsWithUtility{
	public static void main(String []args){
		 
		 
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://www.facebook.com");
		 
		 
		// Inspect element
		WebElement username= driver.findElement(By.id("email")); 
		 
		// Call reuse method
		highLightElement(driver,username);
		username.sendKeys("hi");
		
		WebElement pwd= driver.findElement(By.id("pass")); 
				highLightElement(driver,pwd);
		pwd.sendKeys("pwd");
		
				WebElement login= driver.findElement(By.id("loginbutton")); 
				highLightElement(driver,login);
		login.click();
		 
		}
		 
		// Element highlighter code
		public static void highLightElement(WebDriver driver, WebElement element)
		{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		 
		try 
		{
		Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
		 
		System.out.println(e.getMessage());
		} 
		 
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 
}
}
