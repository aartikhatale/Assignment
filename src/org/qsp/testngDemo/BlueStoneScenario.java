package org.qsp.testngDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlueStoneScenario {
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
	public void test1() throws InterruptedException {
		Actions a = new Actions(driver);
		WebElement ring = driver.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
		a.moveToElement(ring).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']/parent::a[@id='pid_34916']"))
				.click();
		Set<String> window = driver.getWindowHandles();
		for (String wind : window) {
			driver.switchTo().window(wind);
		}
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText());

	}

	@AfterMethod
	public void af() {
		driver.quit();
	}

}
