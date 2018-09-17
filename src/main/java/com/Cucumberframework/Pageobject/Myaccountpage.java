package com.Cucumberframework.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumberframework.Helper.Waithelper;

public class Myaccountpage {

	private WebDriver driver;
	Waithelper waithelper;
	
	@FindBy(xpath = "//*[@id=\'page-36\']/div/div[1]/div/p[2]")
	public WebElement myaccountpage;

	public Myaccountpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waithelper = new Waithelper(driver);
		//waithelper.waitForElement(myaccountpage, 60);

	}
	
	public void landingOnMyaccountPage() {
		myaccountpage.isDisplayed();
	}

}
