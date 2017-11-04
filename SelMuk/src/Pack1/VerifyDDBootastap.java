package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyDDBootastap {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.hu/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='cookieChoiceDismiss']")).click();
		List<WebElement> li=driver.findElements(By.xpath(".//*[@id='male']"));
		int count=li.size();
		for(int i=0;i<count;i++)
		{
			WebElement radio=li.get(i);
			int x=radio.getLocation().getX();
			if(x!=0)
			{
				radio.click();
				break;
			}
			
		}
		
		  
	          }
	 
	       
		

	}


