package Pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyHandlingMultipleWindowTabByTab {

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
		ArrayList<String> tabs=new ArrayList<>(s1);
		 driver.switchTo().window(tabs.get(1));// 1 means child window1
		 System.out.println("title is"+driver.getTitle());
		 driver.close();
		 
		 driver.switchTo().window(tabs.get(0));//0 means parent window
		 System.out.println("title is"+driver.getTitle());
		 driver.close();
		}
		 
		}


