package Automation;

import java.util.List;
import java.util.StringJoiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraFindElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
		for (WebElement list : menu) {
			String name = list.getText();
			System.err.println(name);
			a.moveToElement(list).build().perform();
			String main = name1(name);
			System.out.println(main);
			List<WebElement> sublist = driver.findElements(By.xpath("//a[contains(.,'" + main
					+ "')]/parent::div[@class='desktop-navLink']/descendant::div[@class='desktop-categoryContainer']/li/ul/li"));
			Thread.sleep(1000);
			for (WebElement submenu : sublist) {
				System.out.println(submenu.getText());

			}
		}
	}

	public static String name1(String s) {
		StringJoiner joiner = new StringJoiner("");
		String[] s1 = s.split(" ");
		String[] a = new String[s1.length];
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i].substring(1).toLowerCase();
			String s3 = s1[i].substring(0, 1).toUpperCase();
			String name1 = s3 + s2 + " ";
			a[i] = name1;
		}
		for (int i = 0; i < a.length; i++) {
			joiner.add(a[i]);
		}
		String main = joiner.toString().trim();
		return main;

	}

}
