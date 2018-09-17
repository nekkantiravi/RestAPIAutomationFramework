package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Configurations.ConfigReader;
import com.Cucumberframework.Configurations.PropertyFileReader;
import com.Cucumberframework.Pageobject.Myaccountpage;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.java.en.Then;

public class MyaccountSD {
ConfigReader reader=new PropertyFileReader();
Myaccountpage accountpage;
	
	
	@Then("^i should naivigate to Myaccount page$")
	public void i_should_naivigate_to_Myaccount_page() throws Throwable {
		accountpage=new Myaccountpage(Testbase.driver);
		accountpage.landingOnMyaccountPage();
	}

	
}
