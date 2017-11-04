package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyHandlingMultipleWindowForLoop {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 
		
		driver.manage().window().maximize();
		 
	
		driver.get("http://seleniumpractise.blogspot.hu/2017/07/multiple-window-examples.html");
		WebElement ele=driver.findElement(By.xpath(".//*[@id='cookieChoiceDismiss']"));
		ele.click();
		driver.findElement(By.xpath(".//*[@href='http://www.google.com']")).click();
		 
		
		String parent=driver.getWindowHandle();
		System.out.println("parent id is"+parent);
		 
		
		Set<String>s1=driver.getWindowHandles();
		int count=s1.size();
		System.out.println("count is"+count);
	
		Iterator<String> I1= s1.iterator();
		 
		for(String child_window:s1)
		{
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		driver.findElement(By.xpath(".//a[text()='Gmail']")).click();
		 driver.close();
		}
		 
		}
	
		driver.switchTo().window(parent);
	
		
		
		
		

	}

}
