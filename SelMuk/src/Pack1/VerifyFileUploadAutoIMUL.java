package Pack1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFileUploadAutoIMUL {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/paddu/Desktop/Auto/FU.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='1']")).click();
	    
		Runtime.getRuntime().exec("C:\\Users\\paddu\\Desktop\\Auto\\FUMUL.exe"+" "+"C:\\Users\\paddu\\Desktop\\klara.txt");
		 
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		 
		Thread.sleep(2000);
		 
		Runtime.getRuntime().exec("C:\\Users\\paddu\\Desktop\\Auto\\FUMUL.exe"+" "+"C:\\Users\\paddu\\Desktop\\movies.txt");
		}
}



