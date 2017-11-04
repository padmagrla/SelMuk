package Pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class VerifyTooltip {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fe-11-14e470baf0bae389917399b9d6eb09e2-2381990b5501163c234dbde21a7124ad3b7337f9");
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).click();
		Actions actions=new Actions(driver);
		WebElement tooltip=driver.findElement(By.xpath("//div[contains(text(),'You can use letters, numbers, and periods.')]"));
		actions.moveToElement(tooltip).perform();
		String actual=tooltip.getText();
		System.out.println(actual);
		String exp="You can use letters, numbers, and periods.";
		//String exp="You can use letters";//wrong exp
		Assert.assertEquals(actual, exp);
		System.out.println("Message Verified");
		driver.close();
	}
	 

}
