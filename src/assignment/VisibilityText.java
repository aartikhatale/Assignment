package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/aarti/Desktop/VisibilityOfTextbox.html");
		WebElement text = driver.findElement(By.xpath("//input[@id='iamtextbox']"));
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.visibilityOf(text));
		text.sendKeys("My name is Aarti");
		System.out.println(text.isDisplayed());
		System.out.println(text.isEnabled());
		driver.quit();

	}

}
