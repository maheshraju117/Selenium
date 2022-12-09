package login.copy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class notepad {
	@Test
	public void mahesh() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String path = "C:\\Users\\Syam\\eclipse-workspace\\selenium\\src\\test\\resources\\notepad.properties";
		FileInputStream file = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(file);
		String abc =prop.getProperty("url");
		String lo = prop.getProperty("userlogin");
		String pa = prop.getProperty("userpass");
		driver.get(abc);
		driver.findElement(By.name("username")).sendKeys(lo);		
		driver.findElement(By.name("password")).sendKeys(pa);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
