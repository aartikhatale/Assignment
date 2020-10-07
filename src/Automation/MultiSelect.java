package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/aarti/Desktop/2nd.html");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement multi = driver.findElement(By.id("b"));
		Select s = new Select(multi);
		if (s.isMultiple()) {
			List<WebElement> opt = s.getOptions();
			s.selectByValue(opt.get(0).getText());
			Thread.sleep(1000);
			s.selectByValue(opt.get(2).getText());
			Thread.sleep(1000);
			s.selectByValue(opt.get(4).getText());
		}
		List<WebElement> os = s.getAllSelectedOptions();
		for (WebElement oso : os) {
			System.out.println(oso.getText());
		}
		System.out.println(s.getFirstSelectedOption().getText());
		s.deselectByIndex(0);
		s.deselectAll();
	}
}
