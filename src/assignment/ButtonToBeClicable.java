package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonToBeClicable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/aarti/Desktop/ButtonClick.html");
		WebElement text = driver.findElement(By.id("otherBtn"));
		WebElement text1 = driver.findElement(By.id("sBtn"));
		System.out.println(text.isDisplayed());
		System.out.println(text.isEnabled());
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.elementToBeClickable(text));
		text.click();
		text1.click();

		driver.quit();

	}

}
