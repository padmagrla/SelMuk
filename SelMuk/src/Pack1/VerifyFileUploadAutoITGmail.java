package Pack1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyFileUploadAutoITGmail {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.glassdoor.com/index.htm");
		
		driver.findElement(By.xpath(".//a[@href='/profile/uploadResume_input.htm?resumeOriginHook=HOMEPAGE_HERO_CTA']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='FileSelectBtn']")).click();
		
		
		driver.manage().window().maximize();
		
	     
		// This will invoke AutoIT script here give the path of the script 
		//and this will throw IO exception so u can use throw or try catch
		// In my case I am using throws
		 
		Runtime.getRuntime().exec("C:\\Users\\paddu\\Desktop\\Auto\\FUGlass.exe");
}
}


