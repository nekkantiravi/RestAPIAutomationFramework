package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Bean.Accountinfo;
import com.Cucumberframework.Configurations.ConfigReader;
import com.Cucumberframework.Configurations.PropertyFileReader;
import com.Cucumberframework.Pageobject.Myaccountpage;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyaccountSD {
	ConfigReader reader = new PropertyFileReader();
	Myaccountpage accountpage = new Myaccountpage(Testbase.driver);
	Accountinfo accountinfo = new Accountinfo();

	@Then("^i should naivigate to Myaccount page$")
	public void i_should_naivigate_to_Myaccount_page() throws Throwable {

		accountpage.landingOnMyaccountPage();
	}

	@When("^i click on Address link on the left navigation$")
	public void i_click_on_Address_link_on_the_left_navigation() throws Throwable {

		accountpage.clickOnAddressLink();
	}

	@Then("^i should navigate to Adddress page$")
	public void i_should_navigate_to_Adddress_page() throws Throwable {

		accountpage.addressPageDisplayed();
	}

	@Then("^i click on shipping address edit link$")
	public void i_click_on_shipping_address_edit_link() throws Throwable {

		accountpage.clickOnEditLink();
	}

	@Then("^i should navigate to shipping address$")
	public void i_should_navigate_to_shipping_address() throws Throwable {

		accountpage.shippingPageDisplayed();
	}

	@Then("^i enter first name$")
	public void i_enter_first_name() throws Throwable {
		accountpage.enterFirstName();
	}

	@Then("^i enter last name$")
	public void i_enter_name() throws Throwable {
		accountpage.enterLastName();
	}

	@Then("^i select country$")
	public void i_select_country() throws Throwable {
		accountpage.selectCountry();
	}

	@Then("^i enter address$")
	public void i_enter_address() throws Throwable {
		//accountpage.enterAddress();
	}

	@Then("^i enter city$")
	public void i_enter_city() throws Throwable {
		accountpage.enterCity();
	}

	@Then("^i select state$")
	public void i_select_state() throws Throwable {
      accountpage.selectState();
	}

	@Then("^i select zipcode$")
	public void i_select_zipcode() throws Throwable {
		accountpage.enterZipcode();
	}

	@Then("^i click on save address button$")
	public void i_click_on_save_address_button() throws Throwable {
		accountpage.clickOnAddressButton();
	}

}
