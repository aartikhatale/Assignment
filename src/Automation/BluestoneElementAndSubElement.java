package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneElementAndSubElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		List<WebElement> mainMenu = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		for (WebElement main : mainMenu) {
			System.out.println(main.getText());
			Thread.sleep(2000);
			a.moveToElement(main).perform();
		}

	}

}
