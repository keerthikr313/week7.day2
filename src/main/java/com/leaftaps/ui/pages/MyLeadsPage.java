package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod {
	public MyLeadsPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(property.getProperty("leadsPage.createLead.linktext"))).click();
		return new CreateLeadPage(driver);
	}


}
