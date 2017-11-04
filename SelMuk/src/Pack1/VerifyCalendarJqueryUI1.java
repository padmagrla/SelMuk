package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyCalendarJqueryUI1 {
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver=new FirefoxDriver();
 
		driver.get("http://jqueryui.com/datepicker/#dropdown-month-year");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement ele1=driver.findElement(By.xpath(".//*[@id='cookieChoiceDismiss']"));
		//ele1.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
		WebElement monthDD=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//select[@class='ui-datepicker-month']"));
		
		Select month=new Select(monthDD);
		month.selectByVisibleText("Dec");
		Thread.sleep(3000);
		
					
		List<WebElement> allDates=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("31"))
			{
				ele.click();
				break;
			}
			
		}
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath(".//a[text()='Draggable']")).click();
		
	}
}

