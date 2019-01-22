package com.Cucumberframework.ActionsHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {

    private WebDriver driver;

    public ActionsHelper(WebDriver driver) {
        this.driver = driver;

    }

    public void mouseHover(WebElement element) {

        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();

    }

    public void dragAndDrop(WebElement element) {
        Actions action = new Actions(driver);
        action.clickAndHold(element).moveToElement(element).release(element).build().perform();

    }
}
