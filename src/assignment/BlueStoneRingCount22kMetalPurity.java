package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneRingCount22kMetalPurity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("rings", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='More Filters']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement gold = driver.findElement(By.xpath(
				"//section[@id='Gold Purity-form']/descendant::span[text()=' 22k ']/span[@class='items-count']"));
		String gold1 = gold.getText();
		System.out.println("Gold purity 22k count: " + gold1.substring(1, gold1.length() - 1));
		driver.quit();

	}

}
