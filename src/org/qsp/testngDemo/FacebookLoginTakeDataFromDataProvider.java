package org.qsp.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLoginTakeDataFromDataProvider {
	@Test(dataProviderClass = org.qsp.testngDemo.DataProvideForFacebookLogin.class, dataProvider = "demo")
	public void m1(String name, String pass) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.name("pass")).sendKeys(pass, Keys.ENTER);
	}
}
