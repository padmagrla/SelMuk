package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgWDFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		 
        System.out.println("Application title is ============="+driver.getTitle());

        driver.quit();

	}

}
