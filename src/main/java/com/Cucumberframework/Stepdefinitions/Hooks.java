package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Configurations.PropertyFileReader;
import com.Cucumberframework.Testbase.Testbase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	Testbase testbase = new Testbase();;
	PropertyFileReader reader = new PropertyFileReader();;

	@Before
	public void initializeTest() {

		testbase.selectBrowser(reader.getBrowser());
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.embed(Testbase.getScreenShot(), "image/png");
			
			

		}
		Testbase.driver.quit();
	}

}
