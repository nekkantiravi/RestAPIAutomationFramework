package com.Cucumberframework.VerificationHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationHelper {

	private WebDriver driver;

	public VerificationHelper(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			e.getCause();
			return false;
		}

	}

	public boolean isNotDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			return false;
		} catch (Exception e) {
			e.getCause();
			return true;
		}

	}

}
