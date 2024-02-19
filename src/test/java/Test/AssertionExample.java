package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {


@Test
public void testgoogle() throws InterruptedException {
	System.out.println("Here We test Google");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
	////*[@id="APjFqb"]
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("TestNG Tutorials",Keys.ENTER);
	System.out.println(driver.getTitle());
	
	 Reporter.log("The website used was Demo for this test", true);
        String expectedTitle = "Google.com";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle,"Title is Mismatched");
	Thread.sleep(5000);
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
	SoftAssert softassert=new SoftAssert();
	//Title Assert
		String expectedTitle ="ebay.com";
		String actualTitle = driver.getTitle();
		softassert.assertEquals(actualTitle, expectedTitle,"Title is Mismatched");
		
	//URL Assert
		String expectedUrl ="www.ebay.com";
		String actualUrl=driver.getCurrentUrl();
		softassert.assertNotEquals(actualUrl, expectedUrl,"URL is Mismatched");
		
	//Text Assert
		String expectedText = "www.ebay.com";
		WebElement actualText=  driver.findElement(By.xpath("//*[@id=\\\"gh-ac\\\"]"));
		softassert.assertEquals(actualText, expectedText,"Text is Mismatched");
		
	driver.quit();
	softassert.assertAll();
	
}

}
