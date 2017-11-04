package testNGClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependecyofOneTestOnOtherTest {
	@Test
	public void login()
	{
		System.out.println("  login");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods={"login"})
	public void register()
	{
		System.out.println("  register");
	}
	
	@Test(dependsOnMethods={"login","register"})
	public void logout()
	{
		System.out.println("  logout");
	}

}
