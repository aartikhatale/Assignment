package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneRingPriceBelow10000Rs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement price = driver
				.findElement(By.xpath("//div[@class='top-filter-blocks']/descendant::span[text()='Price']"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.moveToElement(price).perform();
		WebElement felt = driver
				.findElement(By.xpath("//span[@data-displayname='below rs 10000']/span[@class='items-count']"));
		String count = felt.getText();
		System.out.println(" Below 10000 Rs count: " + count.substring(1, count.length() - 1));
		driver.quit();
	}

}
