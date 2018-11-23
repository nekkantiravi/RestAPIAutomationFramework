	package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Pageobject.FreeCRM;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCrmSD {
	FreeCRM freecrm = new FreeCRM(Testbase.driver);
	

	@When("^i click on signup link$")
	public void i_click_on_signup_link() {
		freecrm.clickOnSignUpLink();
	}

	@Then("^i should navigate to registration  page$")
	public void i_should_navigate_to_registration_page() {
		freecrm.landingOnRegistrationPage();
	}

	@Then("^i select edition from dropdown$")
	public void i_select_edition_from_dropdown() {
		freecrm.selectEditionDropDown();
	}

	@Then("^i should enter firstname$")
	public void i_should_enter_firstname() {
		freecrm.cFirstName();
	}

	@Then("^i should enter lastname$")
	public void i_should_enter_lastname() {
		freecrm.cLastName();
	}

	@Then("^i should enter email$")
	public void i_should_enter_email() {
		freecrm.enterEmail();
	}

	@Then("^i should enter confirmemail$")
	public void i_should_enter_confirmemail() {
		freecrm.confirmEmail();
	}

	@Then("^i should enter username$")
	public void i_should_enter_username() {
		freecrm.enterUserName();
	}

	@Then("^i should enter password$")
	public void i_should_enter_password() {
		freecrm.enterPassword();
	}

	@Then("^i should enter confirm password$")
	public void i_should_enter_confirm_password() {
		freecrm.confirmPassword();
	}

	@Then("^i check the terms and conditions checkbox$")
	public void i_check_the_terms_and_conditions_checkbox() {
		freecrm.checkForAgreeTerms();
	}

	@Then("^i click on submit button$")
	public void i_click_on_submit_button() {
		freecrm.clickOnSubmitButton();
	}

	@Then("^i shoud navigate to profile details page$")
	public void i_shoud_navigate_to_profile_details_page() {
		//freecrm.profilePage();

	}

}
