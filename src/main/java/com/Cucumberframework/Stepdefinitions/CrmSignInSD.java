package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Pageobject.CrmSignIn;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CrmSignInSD {

	CrmSignIn crm=new CrmSignIn(Testbase.driver);
	
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
