package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Actions a = new Actions(driver);
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//div[@id='draggable']"));
		a.dragAndDropBy(drop, 100, 0).perform();
	}

}
