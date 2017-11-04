package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstProgWDChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/paddu/OneDrive/chromedriver.exe");
		
		
		//Set the chrome path
		

		// Create object of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		// add parameter which will disable the extension
		options.addArguments("--disable-extensions");

		// Start the chrome session
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.xpath(".//*[@id='login-submit']")).click();
	//WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		//driver.get("http://www.google.com");

	}

}
