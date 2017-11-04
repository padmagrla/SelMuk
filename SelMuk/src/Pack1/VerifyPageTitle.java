package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class VerifyPageTitle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="some thing";
		Assert.assertTrue(expected.contains("gm"));
		
	}

}
