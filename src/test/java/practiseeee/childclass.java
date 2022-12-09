package practiseeee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childclass {

	public String man(String key) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Syam\\git\\selenium\\test\\selenium\\src\\test\\resources\\file.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String abc = prop.getProperty("url");
		return abc;
		
	}
}
