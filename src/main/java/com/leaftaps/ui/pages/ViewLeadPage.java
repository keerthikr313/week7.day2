package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.leaftaps.ui.base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {
	public ViewLeadPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
	}
	
	public ViewLeadPage verifyLeadId() {
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", " ");
		System.out.println(leadID);
		return this;
	}

}
