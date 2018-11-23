package com.Cucumberframework.AlertsHelper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertsHelper {

	private WebDriver driver;

	public AlertsHelper(WebDriver driver) {
		this.driver = driver;
	}

	public Alert getAlert() {

		return driver.switchTo().alert();

	}

	public void acceptAlert() {
		getAlert().accept();

		/*
		 * Alert alert=driver.switchTo().alert(); 
		 * alert.accept();
		 */
	}

	public void dismisAlert() {
		getAlert().dismiss();
	}

	public String getAlertText() {
		String text = getAlert().getText();
		return text;
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			e.getCause();
			return false;
		}

	}

	public void acceptAlertIfPresent() {
		if (isAlertPresent()) {
			acceptAlert();
		}

	}

	public void dismissAlertIfPresent() {
		if (isAlertPresent()) {
			dismisAlert();
		}
	}

}
