package com.fb.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.fb.Pages.LoginFB;

public class VerifyLoginFB {

	@Test
	public void verifyValidLogin()
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		LoginFB log=new LoginFB(driver);
		log.typeUname("hi");
		log.typePwd("hello");
		
		
	}

}
