package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	public CreateLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;		
	}
	
	public CreateLeadPage typeCompanyName(String companyName ) {
		driver.findElement(By.id(property.getProperty("createLeadPage.companyName.id"))).sendKeys(companyName);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String firstName) {
		driver.findElement(By.id(property.getProperty("createLeadPage.firstName.id"))).sendKeys(firstName);
		return this;
	}
	
	public CreateLeadPage typeLastName(String lastName) {
		driver.findElement(By.id(property.getProperty("createLeadPage.lastName.id"))).sendKeys(lastName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name(property.getProperty("createLeadPage.createLead.id"))).click();
		return new ViewLeadPage(driver);
	}


}
