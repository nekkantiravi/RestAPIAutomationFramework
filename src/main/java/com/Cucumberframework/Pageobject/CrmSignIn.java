package com.Cucumberframework.Pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Cucumberframework.Bean.Constants;
import com.Cucumberframework.Bean.CrmConstants;
import com.Cucumberframework.Testbase.Testbase;
import com.Cucumberframework.WaitHelper.Waithelper;

public class CrmSignIn {

	public WebDriver driver;
	public String credentials;
	public String[] credentialsinfo;
	Waithelper waithelper;

	@FindBy(how = How.NAME, using = "username")
	WebElement textbox_UserName;

	@FindBy(how = How.NAME, using = "username")
	WebElement textox_password;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']") // and @class='btn btn-small'
	WebElement login_Button;

	public CrmSignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		waithelper = new Waithelper(driver);
	}

	public void enterUserNameandPassword() {

		credentials = CrmConstants.getUserLoginInfo().get("customer");

		credentialsinfo = credentials.split("_");

		textbox_UserName.sendKeys(credentialsinfo[0]);
		textox_password.sendKeys(credentialsinfo[1]);

	}

	public void crmLoginButton() {
		waithelper.elementToBeClickable(login_Button, Constants.getExplictwait());
          
		login_Button.sendKeys(Keys.ENTER);

	}
}
