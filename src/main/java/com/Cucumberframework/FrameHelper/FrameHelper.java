package com.Cucumberframework.FrameHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {

	private WebDriver driver;

	public FrameHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void switcToFrame(int frameIndex) {

		driver.switchTo().frame(frameIndex);
	}

	public void switcToFrame(String frameIndex) {

		driver.switchTo().frame(frameIndex);
	}

	public void switcToFrame(WebElement frameElement) {

		driver.switchTo().frame(frameElement);
	}

}
