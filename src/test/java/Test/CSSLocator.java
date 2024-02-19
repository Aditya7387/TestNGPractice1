package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CSSLocator {
	@Test
	public void csslocator() {
		//Launch ChromeBrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Open WebPage
		driver.get("https://www.saucedemo.com/v1/");
		//Locate Username --tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//Locate Password --tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		//Locate Login button using tag.value of Class 
		driver.findElement(By.cssSelector("input.btn_action")).click();
		//Switch to Product Page
		String CurrentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(CurrentWindowHandle);
		//Locate Add to Cart by css class selector
		driver.findElement(By.cssSelector(".btn_primary")).click();
		
		//Quit driver
		}

}
