package insider.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import insider.utils.ConfigsReader;
import insider.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void setUp() throws InterruptedException {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

		String browser = ConfigsReader.getProperty("browser");
		// System.out.println(browser);

		switch (browser.toLowerCase()) {
		case "chrome":
			// System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			WebDriverManager.chromedriver();
			driver = new ChromeDriver();
			break;

		case "firefox":
			// System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}
	
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String website = ConfigsReader.getProperty("url");
		driver.get(website);

		PageInitializer.initialize();
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
