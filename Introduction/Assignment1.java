import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment1 {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement checkBoxOption1 = driver.findElement(By.cssSelector("#checkBoxOption1"));
		
		System.out.println(checkBoxOption1.isSelected());
		checkBoxOption1.click();
		System.out.println(checkBoxOption1.isSelected());	
		
		System.out.println(driver.findElements((By.xpath("//input[@type='checkbox']"))).size());
		
		driver.close();
		
	}
	
}