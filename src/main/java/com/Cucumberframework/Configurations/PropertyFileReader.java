package com.Cucumberframework.Configurations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.Cucumberframework.Resourcehelper.Resourcehelper;
import com.Cucumberframework.enums.OS;

public class PropertyFileReader implements ConfigReader {

	private FileInputStream file;
	public Properties OR;

	public PropertyFileReader() {

		try {
			String filepath = Resourcehelper.getResourcePath("/src/test/resources/Configfile/config.properties");
			file = new FileInputStream(filepath);
			OR = new Properties();
            
			OR.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getEmailId() {
		return OR.getProperty("username");
	}

	public String getPassword() {
		return OR.getProperty("Password");
	}

	public String getUrl() {
		return OR.getProperty("Url");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(OR.getProperty("pageloadtime"));
	}

	public String getBrowser() {
		return OR.getProperty("Browser");
	}

	public OS getOS() {
		return OS.valueOf(OR.getProperty("OS"));
	
	}

	/*public String firstName() {
		return OR.getProperty("firstname");
	}

	public String lastName() {
		return OR.getProperty("lastname");
	}

	public String address() {
		return OR.getProperty("address");
	}

	public String city() {
		return OR.getProperty("city");
	}

	public String zipCode() {
		return OR.getProperty("zipcode");
	}*/

}
