package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanLadderFindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement sale = driver.findElement(By.xpath("//span[contains(.,'Sale')]"));
		List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for (WebElement menu : menues) {
			String name = menu.getText();
			System.err.println(name);
			a.moveToElement(menu).build().perform();
			Thread.sleep(1000);
			List<WebElement> submenues = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			Thread.sleep(1000);
			for (WebElement submenu : menues) {
				System.out.println(submenu.getText());

			}

		}
	}

}
