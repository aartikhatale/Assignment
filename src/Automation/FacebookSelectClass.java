package Automation;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select dy = new Select(day);
		dy.selectByVisibleText("15");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select mon = new Select(month);
		mon.selectByVisibleText("Dec");
		List<WebElement> months = mon.getOptions();
		Set<String> set = new TreeSet<String>();
		for (WebElement mont : months) {
			System.out.println(mont.getText());
			set.add(mont.getText());
		}
		System.out.println("===========================================================================");
		for (String st : set) {
			System.out.println(st);
		}
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.id("year"));
		Select yr = new Select(year);
		yr.selectByVisibleText("1994");
		Thread.sleep(1000);
		driver.quit();

	}

}
