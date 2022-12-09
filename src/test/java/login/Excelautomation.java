package login;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Excelautomation {
	 public void exceL() throws Exception { 
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	
	String path = "C:\\Users\\Syam\\OneDrive\\Desktop\\excelauto.xlsx";
	FileInputStream file = new FileInputStream(path);
	Workbook wb= WorkbookFactory.create(file);
	Sheet s=wb.getSheet("Sheet1");
	String a =s.getRow(4).getCell(3).getStringCellValue();
	String b =s.getRow(5).getCell(3).getStringCellValue();
	
	
	
	driver.findElementByName("username").sendKeys(a);
	driver.findElementByName("password").sendKeys(b);
	driver.findElementByXPath("//*[@type='submit']").click();
	
	
	 }
}
