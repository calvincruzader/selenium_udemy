import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "/Users/calvincruzada/devl/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		// Lookee here! 
		driver.findElement(By.cssSelector("a[value='HYD']")).click();
		driver.findElement(By.xpath("(//a[@value='HYD'])[1]")).click();
		
		driver.close();
	}
}