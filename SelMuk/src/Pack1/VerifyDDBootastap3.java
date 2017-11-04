package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyDDBootastap3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath(".//*[@id='menu-posts']/a")).click();
	 List<WebElement> list = driver.findElements(By.xpath(".//div[@class='wp-submenu-head'][text()='Posts']/following-sibling::ul/li/a"));
	 for (WebElement ele : list)
	 
	       {
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	          if (ele.getAttribute("innerHTML").contains("Categories")) {
	 
	             ele.click();
	 
	             break;
	 
	          }
	 
	      
	 
	 driver.findElement(By.xpath(".//*[@id='menu-media']/a")).click();
	 List<WebElement> list1 = driver.findElements(By.xpath(".//div[@class='wp-submenu-head'][text()='Media']//following-sibling::ul/li/a"));
	 for (WebElement ele1 : list1)
	 
	       {
	          System.out.println("Values " + ele1.getAttribute("innerHTML"));
	 
	          if (ele1.getAttribute("innerHTML").contains("Add New")) {
	 
	             ele1.click();
	 
	             break;
	 
	          }
	 
	       }
		

	}
}
}


