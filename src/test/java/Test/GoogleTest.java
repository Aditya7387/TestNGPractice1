package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	@Test
	public void googletest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		////*[@id="APjFqb"]
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("TestNG Tutorials",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
