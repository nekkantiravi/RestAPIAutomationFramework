package com.Cucumberframework.FrameHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {

	private WebDriver driver;

	public FrameHelper(WebDriver driver) {
		this.driver = driver;
	}

	public static void switcToFrameIndex(WebDriver driver, int frameIndex) {

		driver.switchTo().frame(frameIndex);
	}

	public static void switcToFramename(WebDriver driver, String framename) {

		driver.switchTo().frame(framename);
	}

	public static void switcToFrameelement(WebDriver driver, WebElement frameElement) {

		driver.switchTo().frame(frameElement);
	}

}
