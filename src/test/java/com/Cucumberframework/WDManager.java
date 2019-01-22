package com.Cucumberframework;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WDManager {

    WebDriver driver;

    @BeforeMethod

    public void beforeTest() {
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        WebDriverManager.phantomjs().setup();

        //WebDriverManager.edgedriver().setup();
        //driver=new EdgeDriver();
        //WebDriverManager.iedriver().setup();
        //driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Test

    public void sampleTest() {

        driver.get("https://www.cryoport.com/");

        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        driver.getCurrentUrl();
    }


    @AfterMethod

    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}