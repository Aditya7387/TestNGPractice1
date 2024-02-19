package Test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeWebElement;
public class PageLocator {
	@Test
	public void pagelocator() {
		//Launch ChromeBrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//Open WebPage
		driver.get("https://www.saucedemo.com/v1/");
		// For Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// For Password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//For Login Button class="btn_action"
		driver.findElement(By.className("btn_action")).click();
		//Switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		//Locate Product Sauce Labs Fleece Jacket
		
		//driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
		// driver.findElement(By.partialLinkText("Jacket")).click();
		
		//use findElements for webelement
		List <WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element Size :" +elementList.size());
		//Quit Driver
		driver.quit();
	}
}

//test check in 
