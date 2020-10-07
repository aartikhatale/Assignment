package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneRingCountOfMetalPlatinumRings {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement metal = driver.findElement(By.xpath("//span[text()='Metal']"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.moveToElement(metal).perform();
		WebElement filter = driver.findElement(By.xpath("//span[text()=' Platinum ']/span[@class='items-count']"));
		String filt = filter.getText();
		System.out.println("Platinum ring count: " + filt.substring(1, filt.length() - 1));
		driver.quit();

	}

}
