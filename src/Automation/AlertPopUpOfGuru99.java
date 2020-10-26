package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpOfGuru99 {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/index.php");
		WebElement button = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		button.click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(al.getText());
		al.accept();
		driver.quit();

	}

}
