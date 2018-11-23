package com.Cucumberframework.Testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:Featurefile/CRMSignIn.feature" }, glue = {
		"classpath:com.Cucumberframework.Stepdefinitions" }, plugin = { "pretty", "html:target/htmlFile",
				"json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml" },

		monochrome = true, //display the console output in a proper readeable format
		strict=true, //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def..file
        tags= {"~@Smoketest" , "~@Regression test"}
)

// ORed: tags: = {"@Smoketest , @Regression test"} -->excute all the tests tagged as @Smoke OR @Regression test
// Anded:tags: = {"@Smoketest" , "@Regression test"}-->excute all the tests tagged as @Smoke AND @Regression test

public class Testrunner {

}
