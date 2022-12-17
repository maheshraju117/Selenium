package hyr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		// how many rows in atable
		int rows =driver.findElementsByXPath("//table[@class='tsc_table_s13']/tbody/tr").size();
		
		// how many columns in atable
		int columns = driver.findElementsByXPath("//table[@class='tsc_table_s13']/thead/tr/th").size();
		
		// specific cell in atable
		//String taiwan = driver.findElementByXPath("//table[@class='tsc_table_s13']//tr[2]/td[2]").getText();
		
		//System.out.println(rows);
		//System.out.println(columns);
		//System.out.println(taiwan);
		
		
		for (int r = 1; r <= rows; r++) {
			
			for (int c = 1; c <=columns; c++) {
				String tata = driver.findElementByXPath("//table[@class='tsc_table_s13']//tr["+r+"]/td["+c+"]").getText();
				System.out.println(tata);
			}
			
		}
		
		
		
		
		
	}

}
