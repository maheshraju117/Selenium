package practiseeee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excelauto {
@Test
	public void excel() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String path = "C:\\Users\\Syam\\OneDrive\\Desktop\\excelauto.xlsx";
		FileInputStream f = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(f);
		Sheet s = wb.getSheet("Sheet2");
		int row = s.getLastRowNum();
		for (int i = 1; i <=row; i++) {
			String google = s.getRow(i).getCell(0).getStringCellValue();
			driver.findElementByXPath("//input[@id='twotabsearchtextbox']").clear();
			driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys(google);
			driver.findElementByXPath("//input[@id='nav-search-submit-button']").click();
		}
	}
@Test
public void ohrm() throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeDriver  driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String path1 = "C:\\Users\\Syam\\OneDrive\\Desktop\\excelauto.xlsx";
	FileInputStream f1 = new FileInputStream(path1);
	Workbook wb1 = WorkbookFactory.create(f1);
	Sheet s1 = wb1.getSheet("Sheet1");
	int row1 = s1.getLastRowNum();
	for (int i = 1; i <=row1; i++) {
		
		String user = s1.getRow(i).getCell(0).getStringCellValue();
		for (int j = 1; j <=row1; j++) {
			String pass = s1.getRow(j).getCell(1).getStringCellValue();
			driver.findElementByXPath("//input[@placeholder='Username']").sendKeys(user);
			driver.findElementByXPath("//input[@placeholder='Password']").sendKeys(pass);
			driver.findElementByXPath("//button[@type='submit']").click();
			WebElement text = driver.findElementByXPath("//*[text()='Paul CollingsGera']");
			String name = text.getText();
			if(name.equalsIgnoreCase("Paul CollingsGera")) {
			driver.findElementByXPath("//p[@class='oxd-userdropdown-name']").click();
			driver.findElementByXPath("//a[normalize-space()='Logout']").click();
			}
		
			}	
		}
	}
   }

