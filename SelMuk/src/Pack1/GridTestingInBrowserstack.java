package Pack1;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTestingInBrowserstack {
	public static final String USERNAME = "padma32";
	  public static final String AUTOMATE_KEY = "H9oxHmWsn1M6SbV7Q2cE";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    /*DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "IE");
	    caps.setCapability("browser_version", "7.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "XP");
	    caps.setCapability("browserstack.debug", "true");*/
		  DesiredCapabilities caps=DesiredCapabilities.firefox();
		  caps.setPlatform(Platform.MAC);
		  caps.setCapability("browserstack.debug", "true");

	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

	  }

}
