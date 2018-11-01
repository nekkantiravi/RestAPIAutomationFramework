package com.Cucumberframework.WaitHelper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class Waithelper {

	private WebDriver driver;

	public Waithelper(WebDriver driver) {
		this.driver = driver;
	}

	public void setImplictWait(long timeout, TimeUnit unit) {
		// Dynamic implictwait --is always applied globally-is available for all the
		// elements on the page which driver is interacting.
		// (it will be applied internally on driver)
		// dynamic in nature
		// it can be changed anywhere and at any time in your code
		driver.manage().timeouts().implicitlyWait(timeout, unit);
	}

	// Explict wait:
	// 1.no explicit keyword or method
	// 2.Available with WebDriverWait with some ExpectedConditions
	// 3.specific to element
	// 4.dynamic in nature
	// 5. We should never use implicitlyWait and explict wait together because
	// selenium WD will wait for the element first because
	// of implictwait and then explictwait will be applied. Hence total
	// synchronization wait will be increased for each element.
	public void waitForElement(WebDriver driver, WebElement element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void waitForElementClickable(WebDriver driver, WebElement element, int timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public boolean waitForElementNotPresent(WebDriver driver, WebElement element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		boolean status = wait.until(ExpectedConditions.invisibilityOf(element));
		return status;

	}

	public void waitForFrameTOBeAvailableAndSwitchToIt(WebDriver driver, WebElement element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

	}

	public void getWait(WebDriver driver, int timeOutInSeconds, int pollingEveryInMilliSec) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		                   
		wait.pollingEvery(java.time.Duration.ofMillis(pollingEveryInMilliSec));
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver);
		
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
	   
		

	}

	public void testexplictWait(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void pageLoadTime(long timeout, TimeUnit unit) {

		driver.manage().timeouts().pageLoadTimeout(timeout, unit);

	}
}

// Notes for fluent wait
/*
 * public class FluentWait<T> extends java.lang.Object implements Wait<T> An
 * implementation of the Wait interface that may have its timeout and polling
 * interval configured on the fly. Each FluentWait instance defines the maximum
 * amount of time to wait for a condition, as well as the frequency with which
 * to check the condition. Furthermore, the user may configure the wait to
 * ignore specific types of exceptions whilst waiting, such as
 * NoSuchElementExceptions when searching for an element on the page.
 * 
 * Sample usage:
 * 
 * // Waiting 30 seconds for an element to be present on the page, checking for its presence once every 5 seconds.
 *  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) 
 *  .withTimeout(30, SECONDS) 
 *  .pollingEvery(5, SECONDS) 
 *  .ignoring(NoSuchElementException.class);
 * 
 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() { 
 * public WebElement apply(WebDriver driver) { 
 * return driver.findElement(By.id("foo"));
 * } 
 * });
 */
