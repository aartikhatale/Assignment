package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneFindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='active']/a[contains(.,'Diamond')]")).click();
		Actions a = new Actions(driver);
		WebElement ring = driver.findElement(By.xpath("//a[@title='Rings']/parent::li[@class='menuparent repb']"));
		a.moveToElement(ring).build().perform();
		Thread.sleep(10000);

	}

}
