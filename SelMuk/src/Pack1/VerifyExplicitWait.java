package Pack1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://seleniumpractise.blogspot.hu/2016/08/how-to-use-explicit-wait-in-selenium.html");
	//to dismiss cookie choice
				WebElement ele=driver.findElement(By.xpath(".//*[@id='cookieChoiceDismiss']"));
				ele.click();
		
		 
	//the below three lines is to mouse hover on web elt(Automation tools)
				driver.findElement(By.xpath(".//*[@id='post-body-7708391096228750161']/button")).click();
				WebElement ele1=driver.findElement(By.xpath(".//*[@id='demo']"));
				if(ele1.isDisplayed())
						{
					System.out.println("yes");
						}
				else
				{
			System.out.println("no");
				}
		 
		}
		 
		 
		}


