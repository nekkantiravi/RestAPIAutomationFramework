package com.Cucumberframework.Testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static WebDriver driver;

	public WebDriver selectBrowser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;

	}

}


/*
 * if (System.getProperty("os.name").contains(OS.Window.name().toLowerCase())) {
 * if (browser.equalsIgnoreCase("CHROME")) {
 * 
 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
 * + "/src/test/resources/Drivers/chromedriver.exe"); driver = new
 * ChromeDriver(); try { URL serverurl = new URL("http://localhost:9515"); }
 * catch (MalformedURLException e) { e.printStackTrace(); } } else if
 * (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
 * System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
 * ""); } }
 * 
 * return driver;
 */
