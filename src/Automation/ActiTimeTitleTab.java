package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTitleTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> title = driver.getWindowHandles();
		for (String tab : title) {
			driver.switchTo().window(tab);

		}
		System.out.println(driver.getTitle());

	}

}
