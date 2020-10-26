package org.qsp.testngDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlueStoneTestng {
	WebDriver driver;

	@BeforeClass
	public void bc() {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}

	@BeforeMethod
	public void bf() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
	}

	@Test
	public void m1() throws InterruptedException {
		Actions a = new Actions(driver);
		List<WebElement> mainMenu = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		for (WebElement main : mainMenu) {
			System.out.println(main.getText());
			Thread.sleep(2000);
			a.moveToElement(main).perform();
		}
	}

	@AfterMethod
	public void af() {
		driver.quit();
	}

}
