package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyHandlingMultipleWindow {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 
		// Maximize browser
		driver.manage().window().maximize();
		 
		// Load app
		driver.get("http://seleniumpractise.blogspot.hu/2017/07/multiple-window-examples.html");
		WebElement ele=driver.findElement(By.xpath(".//*[@id='cookieChoiceDismiss']"));
		ele.click();
		driver.findElement(By.xpath(".//*[@href='http://www.google.com']")).click();
		 
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		 
		// This will return the number of windows opened by Webdriver and will return Set of St//rings
		Set<String>s1=driver.getWindowHandles();
		 
		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();
		 
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		 
		// Here we will compare if parent window is not equal to child window then we            will close
		 
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		driver.findElement(By.xpath(".//a[text()='Gmail']")).click();
		 
		//System.out.println(driver.switchTo().window(child_window).getTitle());
		 
		driver.close();
		}
		 
		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);
		////////////////////////////////
		
		
		driver.findElement(By.xpath(".//*[@href='http://www.facebook.com']")).click();
		 
		// It will return the parent window name as a String
		String parent2=driver.getWindowHandle();
		 
		// This will return the number of windows opened by Webdriver and will return Set of St//rings
		Set<String>s2=driver.getWindowHandles();
		 
		// Now we will iterate using Iterator
		Iterator<String> I2= s2.iterator();
		 
		while(I2.hasNext())
		{
		 
		   String child_window2=I2.next();
		 
		// Here we will compare if parent window is not equal to child window then we            will close
		 
		if(!parent2.equals(child_window2))
		{
		driver.switchTo().window(child_window2);
		
		 
		System.out.println(driver.switchTo().window(child_window2).getTitle());
		 
		driver.close();
		}
		 
		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent2);
		
		

	}

}
