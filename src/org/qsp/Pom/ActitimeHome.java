package org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHome {
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(id = "loginButton")
	private WebElement login;

	public ActitimeHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendText(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
	}

	public void login() {
		login.click();

	}

}
