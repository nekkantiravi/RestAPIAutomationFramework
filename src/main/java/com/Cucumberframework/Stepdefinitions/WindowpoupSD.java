package com.Cucumberframework.Stepdefinitions;

import com.Cucumberframework.Pageobject.WindowHandler;
import com.Cucumberframework.Testbase.Testbase;
import com.Cucumberframework.WindowsHelper.WindowHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WindowpoupSD {
	
	WindowHandler whandler=new WindowHandler(Testbase.driver);
	
	@Given("^i click on childpoup window link$")
	public void i_click_on_childpoup_window_link(){
		whandler.clickOnChildwindowLink();
	}

	@Then("^child window should be opened$")
	public void child_window_should_be_opened()  {
	   
	}

	@Then("^i click on close button$")
	public void i_click_on_close_button() {
		whandler.closeBrowserPopupWindow();
	    
	}

	@Then("^i should navigate to parent window$")
	public void i_should_navigate_to_parent_window(){

	   
	}

}
