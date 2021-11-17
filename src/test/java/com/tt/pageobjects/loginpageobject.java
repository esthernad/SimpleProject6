package com.tt.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageobject extends pagebase {
	
	public loginpageobject(WebDriver driver) {
		super(driver);
	}
		

		@FindBy(xpath="//input[@name='userName']")
	
		WebElement editusername;
		public void enterusername(String username) {
			editusername.sendKeys("username");
			
		}
		
		@FindBy(xpath="//input[@name='password']")
		
		WebElement editpassword;
		public void enterpassword(String password) {
			editpassword.sendKeys("password");
			
		}
		
		@FindBy(xpath="//input[@name='submit']")
		
		WebElement clicksubmit;
		public void getsubmit() {
			clicksubmit.click();;
		}
		
		
	}


