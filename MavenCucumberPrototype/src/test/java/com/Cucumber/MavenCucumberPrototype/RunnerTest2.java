package com.Cucumber.MavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//Cucucmber.options is deprecated it is changed to CucumberOptions
@CucumberOptions( 
		format={"pretty","html:target/html"},
		//format={"pretty","json:target/json/output.json"},
		features="src/test/resource",
				tags={"@WebDriver"}
		)

public class RunnerTest2 {

}
