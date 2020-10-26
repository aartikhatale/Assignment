package org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartHome {
	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	private WebElement close;
	@FindBy(xpath = "//span[text()='Electronics']")
	private WebElement menu;
	@FindBy(xpath = "//a[text()='Mi']")
	private WebElement miphone;
	@FindBy(xpath = "//img[@alt='Redmi 9 Prime (MatteBlack, 64 GB)']")
	private WebElement selectmi;
	@FindBy(xpath = "//button[text()='ADD TO CART']")
	private WebElement addtocart;

	public void closeButton() {
		close.click();
	}

	public void moveTo(Actions a) {
		a.moveToElement(menu).perform();
	}

	public void miClick() {
		miphone.click();
	}

	public void phoneClick() {
		selectmi.click();
	}

	public void addtocartClick() {
		addtocart.click();
	}

	public FlipcartHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
