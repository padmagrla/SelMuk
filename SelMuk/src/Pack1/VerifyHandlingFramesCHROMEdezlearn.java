package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyHandlingFramesCHROMEdezlearn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/paddu/OneDrive/chromedriver.exe");
		
	ChromeOptions options = new ChromeOptions();

		// add parameter which will disable the extension
		options.addArguments("--disable-extensions");

		WebDriver driver = new ChromeDriver(options);
		///WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.dezlearn.com/testingpage/");
		driver.manage().window().maximize();
		driver.switchTo().frame("contact-iframe");
		driver.findElement(By.className("mob-icon-menu")).click();
		driver.switchTo().parentFrame();
		
		//moving to other frame
		driver.switchTo().frame("do-it-iframe");
		driver.findElement(By.xpath(".//input[@class='search-field']")).sendKeys("hi");
		driver.switchTo().parentFrame();
		
		
		

	}

}
