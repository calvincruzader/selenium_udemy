import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.expedia.com");
		
		WebElement depDropdownSelect = driver.findElement(By.id("package-advanced-preferred-class-hp-package"));
		new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(depDropdownSelect));
		
		Select s = new Select(depDropdownSelect);		

		s.selectByIndex(2);
		s.selectByValue("b");
		s.selectByVisibleText("First class");
		
		System.out.println(driver.findElement(By.xpath("//option[@value='f']")).isSelected());
		
		driver.close();
		
	}
}
