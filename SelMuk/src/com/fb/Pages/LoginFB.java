package com.fb.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFB {
	WebDriver driver;
	
	By uname=By.id("email");
	By pwd=By.xpath("pass");
	By logB=By.name("u_o_n");
	
	public LoginFB(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginFields()
	{
		driver.findElement(uname);
		driver.findElement(pwd);
		driver.findElement(logB);
	}
	public void typeUname(String uid)
	{
		driver.findElement(uname).sendKeys(uid);
	}
	public void typePwd(String pass)
	{
		driver.findElement(pwd).sendKeys(pass);
	}
	public void clickLogin()
	{
		driver.findElement(logB).click();
	}
	

}