package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Configurations.ConfigReader;
import com.Cucumberframework.Configurations.PropertyFileReader;
import com.Cucumberframework.Pageobject.Internationalpage;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InternationalSD {
	ConfigReader reader = new PropertyFileReader();
	Internationalpage ip = new Internationalpage(Testbase.driver);

	@When("^i click on shipping to link$")
	public void i_click_on_shipping_to_link() throws Throwable {
		ip.clickonShippingLink();
	}

	@Then("^i should navigate to context chooser page$")
	public void i_should_navigate_to_context_chooser_page() throws Throwable {
		//ip.contextPageDisplayed();
	}

	@Then("^i select shipping country$")
	public void i_select_shipping_country() throws Throwable {
		ip.selectInternatioanlCountry();
	}

	@Then("^i select currency$")
	public void i_select_currency() throws Throwable {
		ip.selectInternatioanlCurrency();
	}

	@Then("^i click on save button$")
	public void i_click_on_save_button() throws Throwable {
		ip.clickOnSaveContinueButton();
	}

	@Then("^i should navigate to the corresponding country page$")
	public void i_should_navigate_to_the_corresponding_country_page() throws Throwable {
		ip.countryPageDisplayed();
	}

}
