package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import actions.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader ip;

	@BeforeSuite
	public void loadconfig() {

		try {
			prop = new Properties();

			System.out.println("The path 1 is:-" + System.getProperty("user.dir"));
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "configuration\\config.properties");
			System.out.println("path2" + System.getProperty("user.dir"));
			prop.load(ip);

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			// TODO: handle exception
		}

	}

	public void lanuchApp(String browserName) {

		// String browserName=prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}
		/*
		 * else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
		 */
		else {
			System.out.println("Browser is not opened");
		}

		Action action = new Action();
		action.implicitWait(driver, 10);
		action.pageLoadTimeOut(driver, 30);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		// PageLoad TimeOuts
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

	@AfterSuite
	public void TearDown() {

		// driver.close();
	}

}
