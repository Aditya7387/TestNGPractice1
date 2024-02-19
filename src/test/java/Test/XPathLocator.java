package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class XPathLocator {
	@Test
	public void xpathlocator() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//Open WebPage
		driver.get("https://www.saucedemo.com/v1/");
		// Locate Username using Single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		// Locate Password using Multiple attribute
		driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");
		//Locate Login Button 
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		//Switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		//Added product 
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		
	}

}
