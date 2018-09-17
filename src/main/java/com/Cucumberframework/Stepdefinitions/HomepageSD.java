package com.Cucumberframework.Stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.Cucumberframework.Configurations.ConfigReader;
import com.Cucumberframework.Configurations.PropertyFileReader;
import com.Cucumberframework.Pageobject.Homepage;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomepageSD {
	ConfigReader reader = new PropertyFileReader();
	Homepage homepage;

	@Given("^i am on the hompage$")
	public void i_am_on_the_hompage() throws Throwable {

		Testbase.driver.get(reader.getUrl());

	}

	@When("^i click on Myaccount link$")
	public void i_click_on_Myaccount_lin() throws Throwable {
		homepage = new Homepage(Testbase.driver);
		homepage.clickOnMyaccountLink();

	}
}
