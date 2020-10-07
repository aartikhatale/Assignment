package Automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String ph = driver.getWindowHandle();
		Set<String> wh = driver.getWindowHandles();
		wh.remove(ph);
		for (String wind : wh) {
			System.out.println(wind);
			driver.switchTo().window(wind);
			driver.close();

		}
	}

}
