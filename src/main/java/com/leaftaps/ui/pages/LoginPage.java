package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	@FindBy(how = How.ID, using="username") private WebElement elementUsername;
	@FindBy(how=How.ID, using="password") private WebElement elementPassword;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") private WebElement elementLogin;
	
	
	public LoginPage(RemoteWebDriver inWardDriver) {
		this.driver = inWardDriver;
		PageFactory.initElements(driver, this);

	}
	
	public LoginPage typeUsername(String username) {
		//driver.findElement(By.id(property.getProperty("loginPage.username.id"))).sendKeys(username);
		elementUsername.sendKeys(username);
		return this;
	}
	
	public LoginPage typePassword(String password) {
		//driver.findElement(By.id(property.getProperty("loginPage.password.id"))).sendKeys(password);
		elementPassword.sendKeys(password);
		return this;
	}
	
	public WelcomePage ClickLoginButton() {
		//driver.findElement(By.className(property.getProperty("loginPage.Login.class"))).click();
		elementLogin.click();
		return new WelcomePage(driver);

	}


}
