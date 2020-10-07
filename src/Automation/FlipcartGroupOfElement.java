package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartGroupOfElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='_1OSP27']/span"));
		Thread.sleep(2000);
		for (WebElement list1 : menu) {
			String name = list1.getText();
			System.err.println(name);
			a.moveToElement(list1).build().perform();
			Thread.sleep(1000);
			List<WebElement> sub = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::div/descendant::div[@class='_35d-dw']/a"));
			for (WebElement submenu : sub) {
				System.out.println(submenu.getText());

			}
		}

	}

}
