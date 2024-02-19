package Test;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	@Test
	public void testgoogle() {
		System.out.println("Here We test Google");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		////*[@id="APjFqb"]
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("TestNG Tutorials",Keys.ENTER);
		System.out.println(driver.getTitle());
		
		 
		
		driver.quit();
	}
	
	@Test
	public void EbayTest() throws InterruptedException {
		System.out.println("Here We test Ebay");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		////*[@id="gh-ac"]
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Laptops",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}


