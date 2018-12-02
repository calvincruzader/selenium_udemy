package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWebElementViaAncestor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");

		// for some reason, ^ won't work with class attributes 
		driver.findElement(By.xpath("//div[@jsname='RNNXgb']/div/div[1]/input[@name='q']")).sendKeys("find web element by ancestor");
		
		// find element by xpath sibling 
		driver.findElement(By.xpath("//div[@jsmodel='vWNDde']/div/div[3]/center/input[@value='Google Search'][1]/following-sibling::input[1]")).click();
		
		driver.navigate().back();
		
		// find element by its text
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
//		driver.close();
	}
}
