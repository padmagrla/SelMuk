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

public class VerifyActionsMouseHover2 {
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://seleniumpractise.blogspot.hu/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	//to dismiss cookie choice
				WebElement ele=driver.findElement(By.xpath(".//*[@id='cookieChoiceDismiss']"));
				ele.click();
		
		 
	//the below three lines is tomouse hover on webelt(Automation tools)
				WebElement ele1=driver.findElement(By.xpath(".//button[text()='Automation Tools']"));
		 Actions builder=new Actions(driver);
		builder.moveToElement(ele1).perform();
		//to find the common locator for list of elts in that hover
		List<WebElement> li=driver.findElements(By.xpath(".//div[@class='dropdown-content']//a"));
		int total=li.size();
		for(int i=0;i<total;i++)
		{
			WebElement e1=li.get(i);
			String test=e1.getAttribute("innerHTML");
			System.out.println(test);
			if(test.equalsIgnoreCase("Appium"))
			{
				e1.click();
			}
			
			
		}
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		 
		// Here we will wait until element is not visible, if element is visible then it will return web element
		// or else it will throw exception
		//WebElement element = wait
				//.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		//WebElement element = wait
				//.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator)
	
		}
		 
		 
		}


