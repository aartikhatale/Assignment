package org.qsp.testngDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qsp.Pom.FlipcartHome;
import org.testng.annotations.Test;

public class TestngDemo {
	@Test

	public void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		FlipcartHome fh = new FlipcartHome(driver);
		fh.closeButton();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		fh.moveTo(a);
		Thread.sleep(2000);
		fh.miClick();
		Thread.sleep(4000);
		fh.phoneClick();
		Set<String> wind = driver.getWindowHandles();
		for (String win : wind) {
			driver.switchTo().window(win);
		}
		fh.addtocartClick();
		Thread.sleep(4000);
		WebDriverWait ww = new WebDriverWait(driver, 2);
		ww.until(ExpectedConditions.titleContains("Cart"));
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
