package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	@FindBy(how=How.LINK_TEXT, using="Leads") private WebElement elementLeadButton;

	public HomePage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}
	
	public MyLeadsPage clickLeads() {
		//driver.findElement(By.linkText(property.getProperty("homePage.leads.linktext"))).click();
		elementLeadButton.click();
		return new MyLeadsPage(driver);
	}

}
