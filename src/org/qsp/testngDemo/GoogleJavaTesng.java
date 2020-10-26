package org.qsp.testngDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleJavaTesng {
	WebDriver driver;

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Before method");

	}

	@Test(invocationCount = 3)
	public void TC_01() {

		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		System.out.println("Test 1");

	}

	@Test(invocationCount = 2)
	public void TC_02() {

		driver.findElement(By.name("q")).sendKeys("TestNg", Keys.ENTER);
		System.out.println("Test 2");

	}

	@AfterMethod
	public void after() {
		driver.quit();
		System.out.println("After method");

	}

}
