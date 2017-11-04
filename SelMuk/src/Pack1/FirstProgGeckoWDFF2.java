package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgGeckoWDFF2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/paddu/OneDrive/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		 
        System.out.println("Application title is ============="+driver.getTitle());

        driver.quit();

	}

}
