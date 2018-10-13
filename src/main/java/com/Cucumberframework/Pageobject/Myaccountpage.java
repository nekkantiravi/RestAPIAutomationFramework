package com.Cucumberframework.Pageobject;

import java.io.File;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Cucumberframework.Bean.Accountinfo;
import com.Cucumberframework.JsonReader.Jasonreader;
import com.Cucumberframework.Resourcehelper.Resourcehelper;
import com.Cucumberframework.SelectHelper.SelectDropDown;
import com.Cucumberframework.VerificationHelper.VerificationHelper;
import com.Cucumberframework.WaitHelper.Waithelper;

public class Myaccountpage {

	private WebDriver driver;
	Waithelper waithelper = new Waithelper(driver);
	VerificationHelper verificationhelper = new VerificationHelper(driver);
    SelectDropDown select=new SelectDropDown(driver);
	File file = new File(Resourcehelper.getResourcePath("/src/test/resources/Data/Genericdetails.json"));

	Accountinfo accountinfo = Jasonreader.convertJasonToJava(file, Accountinfo.class);

	public String enteredFirstName = accountinfo.getFirstName();
	public String enteredLastName = accountinfo.getLastName();
	// public String enteredAddress = accountinfo.getAddress();
	public String enteredCity = accountinfo.getCity();
	public String enteredZipCode = accountinfo.getZipCode();

	@FindBy(xpath = "//*[@id=\'page-36\']/div/div[1]/div/p[2]")
	WebElement myaccountpage;

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

	@FindBy(xpath = "//div[@class='select2-container state_select']/a/span[1]")
	WebElement state;

	@FindBy(xpath = "//input[@id='shipping_postcode']")
	WebElement zipCode;

	@FindBy(xpath = "//input[@name='save_address']")
	WebElement addressButton;

	public Myaccountpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void landingOnMyaccountPage() {

		Assert.assertTrue(verificationhelper.isDisplayed(myaccountpage));

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
		// this.address.sendKeys(enteredAddress);

	}

	public void enterCity() {
		this.city.sendKeys(enteredCity);
	}

	public void selectState() {
		select.selectByIndex(state, 1);
	}

	public void enterZipcode() {
		this.zipCode.sendKeys(enteredZipCode);
	}

	public void clickOnAddressButton() {
		addressButton.click();
	}

}

/*
 * public static void main(String[] args) { ObjectMapper mapper=new
 * ObjectMapper();
 * 
 * try { Accountinfo info=mapper.readValue(new
 * File((Resourcehelper.getResourcePath(
 * "/src/test/resources/Data/Genericdetails.json"))), Accountinfo.class);
 * System.out.println(info.getFirstName()+" " +info.getLastName()+ " " +
 * info.getZipCode()); } catch (JsonParseException e) { e.printStackTrace(); }
 * catch (JsonMappingException e) { e.printStackTrace(); } catch (IOException e)
 * { e.printStackTrace(); } }
 */