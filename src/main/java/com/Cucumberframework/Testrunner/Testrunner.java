package com.Cucumberframework.Testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:Featurefile/International.feature" }, glue = {
		"classpath:com.Cucumberframework.Stepdefinitions" }, plugin = { "pretty", "html:target/htmlFile" })

public class Testrunner {

}
