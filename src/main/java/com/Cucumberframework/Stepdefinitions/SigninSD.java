package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Configurations.ConfigReader;
import com.Cucumberframework.Configurations.PropertyFileReader;
import com.Cucumberframework.Pageobject.SigninPage;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.java.en.Then;

public class SigninSD {
	ConfigReader reader = new PropertyFileReader();
	SigninPage signinPage = new SigninPage(Testbase.driver);;

	@Then("^i should navigate to login page$")
	public void i_should_navigate_to_login_page() throws Throwable {

		signinPage.landingOnLoginPage();
	}

	@Then("^i enter user name$")
	public void i_enter_user_name() throws Throwable {

		signinPage.enterUserName(reader.getEmailId());
	}

	@Then("^i enter password$")
	public void i_enter_password() throws Throwable {

		signinPage.enterPassword(reader.getPassword());
	}

	@Then("^i click on Login button$")
	public void i_click_on_Login_button() throws Throwable {

		signinPage.clickSigninButton();
	}

}
