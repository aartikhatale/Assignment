package org.qsp.testngDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadPropertiesFile {
	WebDriver driver;

	@Test
	public void readm() throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./Demo.properties");
		p.load(fis);
		String bname = p.getProperty("Browser");
		System.out.println(bname);
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Software\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		String url = p.getProperty("url");
		driver.get(url);

	}
}
