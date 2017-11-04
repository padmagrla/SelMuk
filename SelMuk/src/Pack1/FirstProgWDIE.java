package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstProgWDIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:/Users/paddu/OneDrive/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		
		driver.get("https://leanspoon.com/");

	}

}
