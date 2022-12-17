package hyr;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class handling_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElementByXPath("//a[text()='OrangeHRM, Inc']").click();
		Set<String>whandles = driver.getWindowHandles();
		List<String>handles = new ArrayList<String>(whandles);
		String parent = handles.get(0);
		String child = handles.get(1);
		System.out.println(parent);
		System.out.println(child);
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		if(driver.getTitle().equals("OrangeHRM")) {
			driver.close();
		}
	}
}
