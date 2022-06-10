package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	public WelcomePage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		
	}
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText(property.getProperty("welcomePage.crmsfa.linktext"))).click();
		return new HomePage(driver);
	}

}
