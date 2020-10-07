package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassportSevaPortalLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/welcomeLink#");
		Thread.sleep(2000);
		driver.get(
				"https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
	}

}
