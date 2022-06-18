package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	
	@FindBy(how=How.ID, using="createLeadForm_companyName") private WebElement elementCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName") private WebElement elementFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName") private WebElement elementLastName;
	@FindBy(how=How.NAME, using="submitButton") private WebElement elementSubmitButton;
	
	public CreateLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;				
		PageFactory.initElements(driver, this);

	}
	
	public CreateLeadPage typeCompanyName(String companyName ) {
		//driver.findElement(By.id(property.getProperty("createLeadPage.companyName.id"))).sendKeys(companyName);
		elementCompanyName.sendKeys(companyName);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String firstName) {
		//driver.findElement(By.id(property.getProperty("createLeadPage.firstName.id"))).sendKeys(firstName);
		elementFirstName.sendKeys(firstName);
		return this;
	}
	
	public CreateLeadPage typeLastName(String lastName) {
		//driver.findElement(By.id(property.getProperty("createLeadPage.lastName.id"))).sendKeys(lastName);
		elementLastName.sendKeys(lastName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		//driver.findElement(By.name(property.getProperty("createLeadPage.createLead.id"))).click();
		elementSubmitButton.click();
		return new ViewLeadPage(driver);
	}


}
