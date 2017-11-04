package com.PageFact.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPFPage {
	WebDriver driver;
	
	public LoginPFPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="email") 
	@CacheLookup
	WebElement username; 
	 
	@FindBy(how=How.ID,using="pass")
	@CacheLookup
	WebElement password;
	 
	@FindBy(how=How.ID,using="u_o_n")
	@CacheLookup
	WebElement login_button;
	 
	public void login_wordpress(String uid,String pass)
	{
	username.sendKeys(uid);
	password.sendKeys(pass);
	login_button.click();
	}
	

}
