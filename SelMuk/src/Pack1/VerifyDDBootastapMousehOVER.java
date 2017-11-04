package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyDDBootastapMousehOVER {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		   Thread.sleep(2000);
		   WebElement PO=driver.findElement(By.xpath(".//*[@id='menu-posts']/a"));
		   
		   Actions builder=new Actions(driver);
			builder.moveToElement(PO).perform();
			//to find the common locator for list of elts in that hover
			
			
	 List<WebElement> list = driver.findElements(By.xpath(".//div[@class='wp-submenu-head'][text()='Posts']/following-sibling::ul/li/a"));
	 for (WebElement ele : list)
	 
	       {
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	          if (ele.getAttribute("innerHTML").contains("Categories")) {
	 
	             ele.click();
	 
	             break;
	 
	          }
	 
	      
	 
	 

	}
}
}


