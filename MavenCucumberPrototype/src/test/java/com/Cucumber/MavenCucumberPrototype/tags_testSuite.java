package com.Cucumber.MavenCucumberPrototype;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tags_testSuite {
	@Given("^I have opened \"([^\"]*)\" window$")
	public void i_have_opened_window(String window) throws Throwable {
		System.out.println("Opened a window for "+ window);
	    
	}

	@When("^I click on some link$")
	public void i_click_on_some_link() throws Throwable {
		System.out.println("Click on Link");
	}

	@Then("^A new window opens$")
	public void a_new_window_opens() throws Throwable {
		System.out.println("Window should be open");
	}

}
