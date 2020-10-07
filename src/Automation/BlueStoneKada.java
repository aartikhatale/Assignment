package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneKada {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement ring = driver.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
		a.moveToElement(ring).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='pid_41483']/img[@class='hc img-responsive center-block']")).click();
		Set<String> window = driver.getWindowHandles();
		for (String wind : window) {
			driver.switchTo().window(wind);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='logo-icon']")).click();
		Thread.sleep(2000);
		WebElement jwelary = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		a.moveToElement(jwelary).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-inner']/descendant::span[text()='Kadas']")).click();
		Thread.sleep(2000);

	}

}
