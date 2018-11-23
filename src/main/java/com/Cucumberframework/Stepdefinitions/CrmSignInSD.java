package com.Cucumberframework.Stepdefinitions;

import org.junit.Assert;

import com.Cucumberframework.Pageobject.CrmSignIn;
import com.Cucumberframework.Testbase.Testbase;
import com.Cucumberframework.WaitHelper.Waithelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrmSignInSD extends Testbase {
	
	

	CrmSignIn crm=new CrmSignIn(driver);
	
	
	@Given("^i enter username and password$")
	public void i_enter_username_and_password(){
	    crm.enterUserNameandPassword();
	}
	
	@Given("^i click on login button$")
	public void i_click_on_login_button() {
	
	   crm.crmLoginButton();
	}


	@Then("^i should naviage to main page$")
	public void i_should_naviage_to_main_page()  {
	    System.out.println("got the page");
	   
	}

}
