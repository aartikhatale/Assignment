package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipcartMiphoneaddtoCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//span[text()='Electronics']"));
		a.moveToElement(menu).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Mi']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt='Redmi 9 Prime (MatteBlack, 64 GB)']")).click();
		Set<String> wind = driver.getWindowHandles();
		for (String win : wind) {
			driver.switchTo().window(win);
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(4000);
		WebDriverWait ww = new WebDriverWait(driver, 2);
		ww.until(ExpectedConditions.titleContains("Cart"));
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
