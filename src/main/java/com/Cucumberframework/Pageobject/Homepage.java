package com.Cucumberframework.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumberframework.VerificationHelper.VerificationHelper;
import com.Cucumberframework.WaitHelper.Waithelper;

import junit.framework.Assert;

public class Homepage {

	public WebDriver driver;
	Waithelper waithelper;
	VerificationHelper verificationhelper = new VerificationHelper(driver);
	@FindBy(xpath = "//*[@id=\'link-rail\']/div/div/div[1]/nav/ul/li[1]/a")
	public WebElement homepage;

	@FindBy(xpath = "//*[@id=\'menu-item-50\']/a")
	public WebElement myacccountlink;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void landingHomepage() {
		verificationhelper.isDisplayed(homepage);
		
	}
	
	public void clickOnMyaccountLink() {
		myacccountlink.click();
	}

}
