package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDropToTarget {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Actions a = new Actions(driver);
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(drag, drop).perform();
		System.out.println(driver.findElement(By.xpath("//p[contains(.,'Dropped!')]")).getText());

	}

}
