package com.Cucumberframework.SelectHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	private WebDriver driver;

	public SelectDropDown(WebDriver driver) {
		this.driver = driver;
	}

	public void selectUsingValues(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectByIndexes(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectByVisibleTexts(WebElement element, String visibletext) {

		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}
}
