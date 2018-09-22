package com.Cucumberframework.Pageobject;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Cucumberframework.Bean.Accountinfo;
import com.Cucumberframework.Helper.Waithelper;
import com.Cucumberframework.JsonReader.Jasonreader;
import com.Cucumberframework.Resourcehelper.Resourcehelper;
import com.Cucumberframework.Testbase.Testbase;

public class Myaccountpage {

	private WebDriver driver;
	Waithelper waithelper;
	Jasonreader jasonreader;

	File file = new File(Resourcehelper.getResourcePath("/src/test/resources/Data/Genericdetails.json"));

	Accountinfo accountinfo = Jasonreader.convertJasonToJava(file, Accountinfo.class);

	public String enteredFirstName = accountinfo.getFirstName();
	public String enteredLastName = accountinfo.getLastName();
	//public String enteredAddress = accountinfo.getAddress();
	public String enteredCity = accountinfo.getCity();
	public String enteredZipCode = accountinfo.getZipCode();

	@FindBy(xpath = "//*[@id=\'page-36\']/div/div[1]/div/p[2]")
	public WebElement myaccountpage;

	@FindBy(xpath = "//*[@id=\'page-36\']/div/div[1]/nav/ul/li[4]/a")
	WebElement addressLink;

	@FindBy(xpath = "//*[@id=\'page-36\']/div/div[1]/div/div/div[2]/header/h3")
	WebElement addresspage;

	@FindBy(xpath = "//*[@id=\'page-36\']/div/div[1]/div/div/div[2]/header/a")
	WebElement editLink;

	@FindBy(xpath = "//*[@id=\'page-36\']/div/div[1]/div/form/h3")
	WebElement shippingPage;

	@FindBy(xpath = "//*[@id=\'shipping_first_name\']")
	WebElement firstname;

	@FindBy(xpath = "//*[@id=\'shipping_last_name\']")
	WebElement lastname;

	@FindBy(xpath = "//div[@class='select2-container country_to_state country_select']")
	WebElement selectCountry;

	@FindBy(xpath = "//input[@id='shipping_address_1']")
	WebElement address;

	@FindBy(xpath = "//input[@id='shipping_city']")
	WebElement city;

	@FindBy(xpath = "//div[@class='select2-container state_select']/a")
	WebElement state;
	

	@FindBy(xpath = "//input[@id='shipping_postcode']")
	WebElement zipCode;

	@FindBy(xpath = "//input[@name='save_address']")
	WebElement addressButton;

	public Myaccountpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waithelper = new Waithelper(driver);

	}

	public void landingOnMyaccountPage() {
		Assert.assertTrue(myaccountpage.isDisplayed());

	}

	public void clickOnAddressLink() {
		addressLink.click();
	}

	public void addressPageDisplayed() {
		addresspage.isDisplayed();
	}

	public void clickOnEditLink() {
		editLink.click();
	}

	public void shippingPageDisplayed() {
		shippingPage.isDisplayed();
	}

	public void enterFirstName() {
		this.firstname.sendKeys(enteredFirstName);
	}

	public void enterLastName() {
		this.lastname.sendKeys(enteredLastName);
	}

	public void selectCountry() {
		selectCountry.click();

	}

	public void enterAddress() {
		//this.address.sendKeys(enteredAddress);
		
	}

	public void enterCity() {
		this.city.sendKeys(enteredCity);
	}

	public void selectState() {
		state.click();
	}

	public void enterZipcode() {
		this.zipCode.sendKeys(enteredZipCode);
	}

	public void clickOnAddressButton() {
		addressButton.click();
	}
}
