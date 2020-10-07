package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeXpathCopyPaste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement admin = driver.findElement(By.xpath("//b[text()='admin']"));
		WebElement manager = driver.findElement(By.xpath("//b[text()='manager']"));
		driver.findElement(By.id("username")).sendKeys(admin.getText());
		driver.findElement(By.name("pwd")).sendKeys(manager.getText());
		driver.findElement(By.id("loginButton")).click();

	}

}
