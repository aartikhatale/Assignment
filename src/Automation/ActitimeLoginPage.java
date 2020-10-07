package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.findElement(By.tagName("title")).getAttribute("textContent"));
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		driver.quit();
	}

}
