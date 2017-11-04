package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyBootstrapLoginGlassdoor {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='get_sign_in']")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("963852741");
		driver.switchTo().parentFrame();
		

	}

}
