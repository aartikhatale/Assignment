import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonTopToBottom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
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
