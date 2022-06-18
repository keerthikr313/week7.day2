package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {
	
	@FindBy(how=How.ID, using="viewLead_companyName_sp") private WebElement elementViewLeadID;

	public ViewLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}
	
	public ViewLeadPage verifyLeadId() {
		//String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", " ");
		String LeadID = elementViewLeadID.getText().replaceAll("[^0-9]", "");
		System.out.println(LeadID);
		return this;
	}

}
