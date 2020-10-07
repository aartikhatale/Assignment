package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HtmlCode3rdHtml {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/aarti/Desktop/3rd.html");
		WebElement a = driver.findElement(By.xpath("//input[@name='textA']"));
		a.sendKeys("Name");
		WebDriverWait ww = new WebDriverWait(driver, 15);
		ww.until(ExpectedConditions.textToBePresentInElementValue(a, "Name"));
		driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Aarti");

	}

}
