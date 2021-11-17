package com.tt.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= "Features",
		glue= "com.tt.stepdefs"
		
		
		)








public class testrunnerNG extends AbstractTestNGCucumberTests{

}
