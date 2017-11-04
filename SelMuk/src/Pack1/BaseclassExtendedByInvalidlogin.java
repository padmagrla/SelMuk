package Pack1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BaseclassExtendedByInvalidlogin extends BaseClass {
	@Test(description="This TC will perform valid login")
	public void loginToApplication() throws Throwable
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin1");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin1");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
	}
	
	
	@Test(description="This TC will perform invalid login")
	public void loginToApplication1()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("admin1");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin2");
		
		driver.findElement(By.id("btnLogin")).click();
	}

}
