

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorSyntax {

	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("hello my name is regret");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("this is a fake password");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		driver.close();
	}
}
