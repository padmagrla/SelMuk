package testNGClasses;

import org.testng.annotations.Test;

public class GroupingOfTcs {
	@Test(groups={"smoke"})
	public void login()
	{
		System.out.println(" smoke login");
	}
	
	@Test(groups={"functional"})
	public void register()
	{
		System.out.println(" funct register");
	}
	
	@Test(groups={"regression"})
	public void logout()
	{
		System.out.println(" reg logout");
	}

}
