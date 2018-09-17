package com.Cucumberframework.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumberframework.Helper.Waithelper;

public class Homepage {

	public WebDriver driver;
	Waithelper waithelper;

	@FindBy(xpath = "//*[@id=\'n2-ss-6\']/div[1]/div/div/div[1]/div[1]/img")
	public WebElement homepage;

	@FindBy(xpath = "//*[@id=\'menu-item-50\']/a")
	public WebElement myacccountlink;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waithelper = new Waithelper(driver);
		waithelper.waitForElement(homepage, 60);
	}
	
	public void landingHomepage() {
		homepage.isDisplayed();
	}
	
	public void clickOnMyaccountLink() {
		myacccountlink.click();
	}

}
