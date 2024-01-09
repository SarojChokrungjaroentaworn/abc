package utilities;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashboardPage;
import pages.LogInPage;

public class BaseClass {
	private static WebDriver driver;
	LogInPage lp = new LogInPage();
	DashboardPage dbp = new DashboardPage();

	@BeforeClass(alwaysRun = true)
	public static WebDriver getDriver() {
		if (driver == null) {
			switch (BaseClass.getProperty("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case "safari":
				if (System.getProperty("os.name").toLowerCase().contains("mac")) {
					throw new WebDriverException("Your OS doesn't support Safari");
				}
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;

			case "edge":
				if (System.getProperty("os.name").toLowerCase().contains("windows")) {
					throw new WebDriverException("Your OS doesn't support Edge");
				}
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}

			driver.get(BaseClass.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		return driver;
	}

	@BeforeMethod(alwaysRun = true)
	public void login() {
		lp.username.sendKeys(BaseClass.getProperty("orangeHRM_Username"));
		lp.password.sendKeys(BaseClass.getProperty("orangeHRM_Password"));
		lp.button.click();
	}

//	@AfterClass(alwaysRun = true)
//	public static void tearDown() {
//		if (driver != null) {
//			driver.close();
//			driver.quit();
//			driver = null;
//		}
//	}

//	@AfterMethod(alwaysRun = true)
//	public void logOut() {
//		
//		dbp.userNameMenu.click();	
//		BaseClass.clickOnMenuBar(dbp.userNameMenuOptions, BaseClass.getProperty("orangHRM_userMenuOption4"));
//
//	}

	public static void clickOnMenuBar(List<WebElement> menuLocator, String menuItem) {

		for (WebElement MainMenu : menuLocator) {
			if (MainMenu.getText().contains(menuItem)) {
				MainMenu.click();
				break;
			}
		}
	}
	public static void clickOnMenuBarByIndex(String input, String index) {
//		driver = new ChromeDriver();
		String xpath = input+"["+index+"]";
		driver.findElement(By.xpath(xpath)).click();
}
	private static Properties properties;

	static {
		try {
			// path to the file locaiton
			String filePath = "src/test/resources/PropertiesFiles/userData.properties";
			// open connection to the file
			FileInputStream fis = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(fis);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// this is the end of the static block

	public static String getProperty(String keyName) {
		return properties.getProperty(keyName);
	}

}
