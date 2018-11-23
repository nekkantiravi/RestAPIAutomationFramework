package com.Cucumberframework.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Cucumberframework.VerificationHelper.VerificationHelper;
import com.Cucumberframework.WaitHelper.Waithelper;
import com.Cucumberframework.WindowsHelper.WindowHelper;

public class WindowHandler {

	private WebDriver driver;
	VerificationHelper verificationhelper = new VerificationHelper(driver);
	WindowHelper windowhelper=new WindowHelper(driver);
	Waithelper waithelper=new Waithelper(driver);
	
	@FindBy(xpath="//a[contains(text(),'Good PopUp #3')]")
	WebElement ChildWindowlink;
	
	
	public WindowHandler(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnChildwindowLink()  {
		
		ChildWindowlink.click();
       

	}
	
	public void closeBrowserPopupWindow(){
		
		windowhelper.closeAllTabsAndSwitchToMainWondow(driver);
		
		
	}
	
	
}
