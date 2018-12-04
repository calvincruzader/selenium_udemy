import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		int count = driver.findElements(By.xpath("//input[@name='radioButton']")).size();
		
		for(int i = 0; i < count; i++) { 
			System.out.println(driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).getAttribute("value"));
		}
		
		driver.close();
	}
}
