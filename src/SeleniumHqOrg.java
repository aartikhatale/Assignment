import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHqOrg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@id='gsc-i-id1']"));
		search.sendKeys("java", Keys.ENTER);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		search.sendKeys("testNg", Keys.ENTER);
		driver.quit();
	}

}
