package Pack1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFileUploadAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/paddu/Desktop/FU.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='1']")).click();
	     
		// This will invoke AutoIT script here give the path of the script 
		//and this will throw IO exception so u can use throw or try catch
		// In my case I am using throws
		 
		Runtime.getRuntime().exec("C:\\Users\\paddu\\Desktop\\Auto\\FU.exe");
}
}


