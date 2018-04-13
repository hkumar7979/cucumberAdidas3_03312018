package com.cucumber.framework.configreader;

import com.cucumber.framework.configuration.browser.BrowserType;

public interface ConfigReader {
	
	public String getUserName();
	public String getPassword();
	public String getWebSite();
	public int getPageLoadTimeOut();
	public int getImplicitWait();
	public int getExplicitWait();
	public BrowserType getBrowser();
	public String getBrowserName();

}
