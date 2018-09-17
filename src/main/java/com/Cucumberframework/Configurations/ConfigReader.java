package com.Cucumberframework.Configurations;

import com.Cucumberframework.enums.Browsers;
import com.Cucumberframework.enums.OS;

public interface ConfigReader {

	public String getEmailId();

	public String getPassword();

	public String getUrl();

	public int getPageLoadTimeOut();

	public String getBrowser();

	public OS getOS();

}
