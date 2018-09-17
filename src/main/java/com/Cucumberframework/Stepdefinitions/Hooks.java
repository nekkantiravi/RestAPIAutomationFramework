package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Configurations.Objectreader;
import com.Cucumberframework.Configurations.PropertyFileReader;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	Testbase testbase;
	PropertyFileReader reader;

	@Before
	public void initializeTest() {
		testbase = new Testbase();
	    reader=new PropertyFileReader();
		testbase.selectBrowser(reader.getBrowser());
	}

	@After
	public void endTest() {
		testbase.driver.quit();
	}

}
