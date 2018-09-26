package com.Cucumberframework.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Cucumberframework.WaitHelper.Waithelper;

public class Internationalpage {
	private WebDriver driver;
	Waithelper waithelper;
	Select select;
	
	
	@FindBy(xpath = "//*[@id=\'link-rail\']/div/div/div[1]/nav/ul/li[4]/a")
	public WebElement shippingToLink;
	
	@FindBy(xpath = "//*[@id=\'iShipHeadingH1\']")
	public WebElement contextPage;
	
	@FindBy(xpath = "//*[@id=\'shippingCountry\']")
	public WebElement shippingCountry;
	
	@FindBy(xpath = "//*[@id=\'currency\']")
	public WebElement currency;
	
	@FindBy(xpath = "//*[@id=\'saveChanges\']")
	public WebElement saveChanges;
	
	@FindBy(xpath = "//*[@id=\'globalBodyFooterBannerContent\']/map/area[1]")
	public WebElement countryPage;
	
	public Internationalpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waithelper = new Waithelper(driver);

	}

	public void clickonShippingLink() {
		shippingToLink.click();
	}
	public void contextPageDisplayed() {
		contextPage.isDisplayed();
	}
	
	public void selectInternatioanlCountry(int index) {
		select = new Select(this.shippingCountry);
		select.selectByIndex(index);
	}
	
	public void selectInternatioanlCurrency(int index) {
		select = new Select(this.currency);
		select.selectByIndex(index);
	}
	public void countryPageDisplayed() {
		countryPage.isDisplayed();
	}
	
	public void clickOnSaveContinueButton() {
		saveChanges.click();
	}
}
