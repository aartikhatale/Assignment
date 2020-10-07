package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebooklogInCustomWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Forgotten password?")).click();
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {

				return driver.findElement(By.xpath("//input[@name='did_submit']")).isEnabled();
			}
		});
		driver.findElement(By.xpath("//input[@aria-label='Mobile number']")).sendKeys("9527176783");
		driver.quit();

	}

}
