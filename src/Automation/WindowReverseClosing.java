package Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowReverseClosing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> wh = driver.getWindowHandles();
		List<String> al = new ArrayList<>(wh);
		for (int i = al.size() - 1; i >= 0; i--) {
			driver.switchTo().window(al.get(i));
			driver.close();

		}

	}

}
