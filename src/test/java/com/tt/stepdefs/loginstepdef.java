package com.tt.stepdefs;

import org.openqa.selenium.WebDriver;

import com.tt.common.baseclass;
import com.tt.pageobjects.loginpageobject;

import cucumber.api.java.en.*;

public class loginstepdef extends baseclass {
	loginpageobject lp;

	
	@Given("^the user is in home page$")
	public void the_user_is_in_home_page() {
		getbrowser();
		
	}
	
	@When("^the user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enter_and(String username, String password) throws Throwable {
		lp=new loginpageobject(driver);
		lp.enterusername("username");
	    lp.enterpassword("password");
	}
	
	@And("^the user press submit button$")
	public void  the_user_press_submit_button() {
		lp.getsubmit();
	}
	@Then("^the user successfully logged in$")
	public void the_user_successfully_logged_in() throws Throwable {
	    
	}



}
