package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> elements = driver
				.findElements(By.xpath("//div[@class='aajZCb']/descendant::ul[@class='erkvQe']/li"));
		Thread.sleep(2000);
		for (WebElement googleElement : elements) {
			System.out.println(googleElement.getText());

		}

		elements.get(2).click();

	}

}
