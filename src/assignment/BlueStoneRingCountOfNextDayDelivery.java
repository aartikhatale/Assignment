package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneRingCountOfNextDayDelivery {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement delivery = driver
				.findElement(By.xpath("//div[@class='top-filter-blocks']/descendant::span[text()='Delivery Time']"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.moveToElement(delivery).perform();
		WebElement filter = driver.findElement(By.xpath(
				"//div[@class='top-filter-blocks']/descendant::span[text()=' Next Day Delivery ']/span[@class='items-count']"));
		String nextday = filter.getText();
		System.out.println("Next day delivery count: " + nextday.substring(1, nextday.length() - 1));
		driver.quit();

	}

}
