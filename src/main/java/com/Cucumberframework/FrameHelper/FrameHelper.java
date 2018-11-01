package com.Cucumberframework.FrameHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {

	private WebDriver driver;

	public FrameHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void switcToFrameIndex(int frameIndex) {

		driver.switchTo().frame(frameIndex);
	}

	public void switcToFramename(String framename) {

		driver.switchTo().frame(framename);
	}

	public void switcToFrameelement(WebElement frameElement) {

		driver.switchTo().frame(frameElement);
	}

}
