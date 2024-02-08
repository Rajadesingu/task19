package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviTask {

	public static void main(String[] args ) {
		
		WebDriver driver = new ChromeDriver();
		
		//load URL
		driver.get("https://www.guvi.in/register");
		
		//maximize window
		driver.manage().window().maximize();
		
		//adding waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// All possible locators
		
		// By className
		driver.findElement(By.className("form-control")).sendKeys("jack");
		
		// By id
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		
		// By tagName
		driver.findElement(By.tagName("input")).sendKeys("7502807058");
		
		// By cssSelector
		driver.findElement(By.cssSelector("input[id='mobileNumber']")).sendKeys("7502807058");
		
		// By xpath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@123");

		
	}
	
}
