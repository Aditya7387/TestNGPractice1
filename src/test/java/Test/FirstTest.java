package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	@Test
	public void FirstTestCase() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Page Title :" +title);
		String url = driver.getCurrentUrl();
		System.out.println("Page URL :" +url);
		driver.quit();
	}
}
