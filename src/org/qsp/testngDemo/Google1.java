package org.qsp.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google1 {
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void beforeMethod(String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", ".\\Software\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

	}

	@Test
	public void TC_01() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Alia Bhat", Keys.ENTER);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
