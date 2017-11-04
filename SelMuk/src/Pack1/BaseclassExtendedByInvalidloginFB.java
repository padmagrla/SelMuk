package Pack1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BaseclassExtendedByInvalidloginFB extends BaseClassFB {
	@Test(description="This TC will perform valid login")
	public void loginToApplication() throws Throwable
	{
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("padmatadela@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("psyntel123$");
		
		driver.findElement(By.id("u_0_2")).click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
	}
	
	
	@Test(description="This TC will perform invalid login")
	public void loginToApplication1()
	{
driver.findElement(By.id("email")).sendKeys("padma@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("psynte");
		
		driver.findElement(By.id("u_0_2")).click();
	}

}
