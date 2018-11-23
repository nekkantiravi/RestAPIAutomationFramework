package com.Cucumberframework.Bean;

import java.util.HashMap;

public class CrmConstants {
	private String firstname;
	private String lastname;
	private String email;
	private String confirmemail;
	private String username;
	private String password;
	private String confirmpassword;
	
	
	

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getConfirmemail() {
		return confirmemail;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}
	
	public static HashMap<String, String> getUserLoginInfo() {
		HashMap<String,String> usermap=new HashMap<String,String>();
		usermap.put("customer", "naveenk_test@123");
		return usermap;
		
	}

}