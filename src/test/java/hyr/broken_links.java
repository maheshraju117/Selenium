package hyr;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class broken_links {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links =driver.findElementsByTagName("a");
		int invalid = 0;
		int valid=0;
		for(WebElement link:links) {
			String actuallink = link.getAttribute("href");
			if(actuallink==null || actuallink.isEmpty()) {
				System.out.println(actuallink+"  is not a link");
			}
			URL ul = new URL(actuallink);
			HttpURLConnection huc = (HttpURLConnection) ul.openConnection();
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println(actuallink+" is a brokenlink");
				invalid++;
			}
			else {
				System.out.println(actuallink+ " is a valid link");
				valid++;
			}
			System.out.println("no.of valid links are "+valid);
			System.out.println("no.of invalid links are "+invalid);
		}
		
	}
}
