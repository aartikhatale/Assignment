package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelectMay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select mon = new Select(month);

		List<WebElement> months = mon.getOptions();
		for (WebElement mont : months) {
			System.out.println(mont.getText());
			if (mont.getText().equalsIgnoreCase("may")) {
				mon.selectByVisibleText("May");
			}
		}

	}

}
