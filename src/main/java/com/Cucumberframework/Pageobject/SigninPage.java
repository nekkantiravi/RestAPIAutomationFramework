package com.Cucumberframework.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumberframework.WaitHelper.Waithelper;

public class SigninPage {

	private WebDriver driver;
	Waithelper waithelper;

	@FindBy(xpath = "//*[@id=\'customer_login\']/div[1]/h2")
	public WebElement loginpage;

	@FindBy(xpath = "//*[@id=\'username\']")
	public WebElement username;

	@FindBy(xpath = "//*[@id=\'password\']")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\'customer_login\']/div[1]/form/p[3]/input[3]")
	public WebElement loginbutton;

	
	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waithelper = new Waithelper(driver);
		//waithelper.waitForElement(username, 60);
	}
	
	public void landingOnLoginPage() {
		loginpage.isDisplayed();
	}

	public void enterUserName(String username) {
		this.username.sendKeys(username);
	}

	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickSigninButton() {
		loginbutton.click();
	}
}
