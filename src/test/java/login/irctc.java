package login;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class irctc {
	@Test
	public void ticket() {	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		String actual = driver.getTitle();
		String expected = "Google";
		WebElement gmail = driver.findElementByLinkText("Gmail");
		//assertEquals(actual,expected,"this is expected and result statement");
		//assertTrue(gmail.isDisplayed());
		assertFalse(gmail.isDisplayed());

	}
}
