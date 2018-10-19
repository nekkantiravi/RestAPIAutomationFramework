package com.Cucumberframework.WindowsHelper;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHelper {

	private WebDriver driver;

	public WindowHelper(WebDriver driver) {
		this.driver = driver;
	}

	// This method will switch to parent window
	public void switchToParentWindow() {
		driver.switchTo().defaultContent();

	}

	// This method will switch to child window based on Index
	public void switchToWindow(int index) {
		Set<String> windows = driver.getWindowHandles();

		int i = 1;
		for (String window : windows) {
			if (i == index) {
				driver.switchTo().window(window);
			} else {
				i++;
			}
		}
	}

	// This method will close all tabbed window and switch to parent window

	public void closeAllTabsAndSwitchToMainWondow(WebDriver driver) {
		Set<String> windows = driver.getWindowHandles();
		     Iterator<String> it = windows.iterator();
		     String childwindowid = it.next();
		     System.out.println("child:" +childwindowid);
		     driver.switchTo().window(childwindowid);
		     driver.close();
		     String parentwindowid =it.next();
		     System.out.println("child:" +parentwindowid);
		     driver.switchTo().window(parentwindowid);
	}
		/*String parentwindow = driver.getWindowHandle();
		for (String window : windows) {
			if (!window.equalsIgnoreCase(parentwindow))

				driver.close();
		}
		driver.switchTo().window(parentwindow);
	}*/

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}
}
