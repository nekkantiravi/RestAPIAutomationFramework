package com.Cucumberframework.Pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumberframework.SelectHelper.SelectDropDown;
import com.Cucumberframework.VerificationHelper.VerificationHelper;
import com.Cucumberframework.WaitHelper.Waithelper;

public class Internationalpage {
	private WebDriver driver;
	Waithelper waithelper;
	
	VerificationHelper verificationhelper = new VerificationHelper(driver);
	SelectDropDown select = new SelectDropDown(driver);
	
	@FindBy(xpath = "//*[@id=\'link-rail\']/div/div/div[1]/nav/ul/li[4]/a")
	public WebElement shippingToLink;
	
	@FindBy(xpath = "//h4[contains(text(),'SHOP & SHIP ALL OVER THE WORLD!')]")
	public WebElement contextPage;
	
	@FindBy(xpath = "//select[@id='shippingCountry' and @name='shippingCountry']")
	public WebElement shippingCountry;
	
	@FindBy(xpath = "//select[@id='currency' and @name='currency']']")
	public WebElement currency;
	
	@FindBy(xpath = "//*[@id=\'saveChanges\']")
	public WebElement saveChanges;
	
	@FindBy(xpath = "//*[@id=\'globalBodyFooterBannerContent\']/map/area[1]")
	public WebElement countryPage;
	
	public Internationalpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}

	public void clickonShippingLink() {
		shippingToLink.click();
	}
	public void contextPageDisplayed() {
		Assert.assertTrue(verificationhelper.isDisplayed(contextPage));
	}
	
	public void selectInternatioanlCountry() {
		
		select.selectUsingValue(shippingCountry, "AL");
	}
	
	public void selectInternatioanlCurrency() {
		select.selectUsingValue(currency, "BSD");
		
	}
	public void countryPageDisplayed() {
		countryPage.isDisplayed();
	}
	
	public void clickOnSaveContinueButton() {
		saveChanges.click();
	}
}
