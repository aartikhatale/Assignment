package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleMapRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement map = driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-imb']/a[contains(.,'Maps')]"));
		a.contextClick(map).perform();
	}

}
