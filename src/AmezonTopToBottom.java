import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmezonTopToBottom {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File save = new File("./ScreenShot/amezon.png");
		Files.copy(screenshot, save);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		//
		// js.executeScript("window.scrollBy(200,0)");
		// js.executeScript("window.scrollBy(-200,0)");
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		// Thread.sleep(2000);
		// js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		// Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Back to top']"));
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}
}
