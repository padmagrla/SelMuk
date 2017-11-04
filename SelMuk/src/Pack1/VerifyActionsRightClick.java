package Pack1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyActionsRightClick {
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new FirefoxDriver();
		 
		driver.get("https://in.yahoo.com/");
		 
		driver.manage().window().maximize();
		 
		Actions act=new Actions(driver);
		
		 
		act.contextClick(driver.findElement(By.xpath(".//a[contains(@href,'cricket')]"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 
		}
		
	
		}
		 
		 
		


