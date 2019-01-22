package com.Cucumberframework.Bean;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Accountinfo {
	private String firstName;
	private String lastName;
	private String city;
	private String zipCode;
	@JsonIgnore
	private String Address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
