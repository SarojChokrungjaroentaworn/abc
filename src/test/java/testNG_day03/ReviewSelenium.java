package testNG_day03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReviewSelenium {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
    WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void test01() {
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Thailand");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@jsname='bVqjv']//span[contains(text(),\"Language\")]")).click();
	}
}
