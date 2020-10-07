package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlusStonePlainGoldCoin50Gm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement ring = driver.findElement(By.xpath("//a[text()='Coins '] "));
		a.moveToElement(ring).perform();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//span[text()='Plain Gold Coins']/ancestor::div[@class='col-inner']/descendant::span[text()='50 gram']"))
				.click();
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.titleContains("50 gram 24 KT Gold Coin"));
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
