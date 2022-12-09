package login.copy;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadrivven {
	@Test
	public void data() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		String path = "C:\\Users\\Syam\\eclipse-workspace\\selenium\\src\\test\\resources\\excelauto.xlsx";
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		int count = wb.getSheet("Sheet1").getLastRowNum();
		
		for (int i = 2; i < count; i++) {
			String keyword = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			WebElement locator = driver.findElementById("twotabsearchtextbox");
			locator.clear();
			locator.sendKeys(keyword);
			locator.submit();	
			
		}
	
	}

}
