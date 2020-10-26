import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.findElement(By.tagName("title")).getAttribute("textContent"));
		Thread.sleep(2000);
		String path = ".\\Data\\Book.xlsx";
		File fis = new File(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int row = sh.getPhysicalNumberOfRows();
		short col = sh.getRow(0).getLastCellNum();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.print(cl + "  ");
			}
			System.out.println();
		}
		Cell us = sh.getRow(1).getCell(0);
		Cell ps = sh.getRow(1).getCell(1);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(us.toString());
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(ps.toString());
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		driver.quit();

	}

}
