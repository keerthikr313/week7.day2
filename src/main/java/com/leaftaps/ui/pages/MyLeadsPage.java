package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod {
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead") private WebElement elementCreateLeadButton;

	public MyLeadsPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}
	
	public CreateLeadPage clickCreateLead() {
		//driver.findElement(By.linkText(property.getProperty("leadsPage.createLead.linktext"))).click();
		elementCreateLeadButton.click();
		return new CreateLeadPage(driver);
	}


}
