package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	public HomePage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		
	}
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText(property.getProperty("homePage.leads.linktext"))).click();
		return new MyLeadsPage(driver);
	}

}
