import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php#");
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
				
		Thread.sleep(6000);
		
//		driver.switchTo().alert().accept();
//		Thread.sleep(6000);
//		a.accept(); 
//		
//		Thread.sleep(6000);
		driver.close();
	}
}