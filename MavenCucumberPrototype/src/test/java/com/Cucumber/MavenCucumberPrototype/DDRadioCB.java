package com.Cucumber.MavenCucumberPrototype;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DDRadioCB {
	WebDriver driver=null;
	
	@Given("^I am on zoositeRDDCB$")
	public void i_am_on_zoositeRDDCB() throws Throwable {
		driver=new FirefoxDriver();
		driver.navigate().to("http://thetestroom.com/webapp/");
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String link) throws Throwable {
	
	    
	}

	@Then("^I set the start date to \"([^\"]*)\"$")
	public void i_set_the_start_date_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I populate contact form$")
	public void i_populate_contact_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
