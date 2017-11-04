package com.PageFact.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.BrowserSessionFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageFact.Pages.LoginPFPage;

public class LoginPFTestCase {
	@Test
	public void checkValidUser()
	{
		
		WebDriver driver=BrowserFactory.startBrowser("firefox", "https://www.facebook.com/");
		LoginPFPage login_page=PageFactory.initElements(driver, LoginPFPage.class);
		login_page.login_wordpress("asas", "asasas");
	}

}
