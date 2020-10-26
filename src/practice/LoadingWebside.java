package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadingWebside {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> a = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(a);
		for (int i = l.size() - 1; i >= 0; i--) {
			driver.switchTo().window(l.get(i));
			driver.close();

		}

	}

}
