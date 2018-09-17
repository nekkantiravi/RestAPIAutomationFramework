package com.Cucumberframework.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waithelper {

	private WebDriver driver;
	
	public Waithelper(WebDriver driver) {
		this.driver=driver;
	}
	
	public void waitForElement(WebElement element,long timeOutInSeconds ) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
