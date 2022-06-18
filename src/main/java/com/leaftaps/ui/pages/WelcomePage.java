package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA") private WebElement elementCRMSFA;
 
	public WelcomePage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}
	public HomePage clickCRMSFA() {
		//driver.findElement(By.linkText(property.getProperty("welcomePage.crmsfa.linktext"))).click();
		elementCRMSFA.click();
		return new HomePage(driver);
	}

}
