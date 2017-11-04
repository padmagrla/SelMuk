package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyDDBootastap2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.manage().window().maximize();
		  driver.findElement(By.xpath(".//*[@id=':0']")).click();
		    
	       // adding 2 seconds wait to avoid Sync issue
	 
	       Thread.sleep(2000);
	 
	       // Dropdown items are coming in <a> tag so below xpath will get all
	 
	       // elements and findElements will return list of WebElements
	 
	       List<WebElement> list = driver.findElements(By.xpath(".//*[@id='BirthMonth']//div/div"));
	 
	       // We are using enhanced for loop to get the elements
	 
	       for (WebElement ele : list)
	 
	       {
	 
	          // for every elements it will print the name using innerHTML
	 
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	 
	 
	          // Here we will verify if link (item) is equal to Java Script
	 
	          if (ele.getAttribute("innerHTML").contains("December")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 
	 
	 
	             // break the loop or come out of loop
	 
	             break;
	 
	          }
	 
	       }
		

	}

}
