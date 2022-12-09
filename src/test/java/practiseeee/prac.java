package practiseeee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac {
	@Test
	

	public void man() throws Exception {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver  driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
			
			String error = driver.findElementByXPath("//*[text()='Invalid credentials']").getText();
			if(error.equals("Invalid credentials")) {
				System.out.println("your statement is correct");
				
			}

			else{
				driver.findElementByXPath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p").click();
				
				driver.findElementByXPath("//*[text()='Logout']").click();
				System.out.println("test passed");
				}
			}	
		}
	
}
}
