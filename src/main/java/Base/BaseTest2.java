package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest2 {

	public static WebDriver driver;
	public static Properties prop;

	@BeforeSuite
	public void loadconfig() {

		try {
			prop = new Properties();

			// System.out.println("The path 1 is:-" + System.getProperty("user.dir"));
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Rashmi\\eclipse-workspace\\Test\\src\\main\\java\\config\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception

		}

	}

	@SuppressWarnings("deprecation")
	public static void initialization() {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			// System.setProperty("webdriver.driver.chrome","C:\\Users\\Rashmi\\eclipse-workspace\\Test\\browser\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("MicrosoftEdge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			System.out.println("Browser is not opened");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//For ImplicitlyWait - 
		driver.manage().timeouts().implicitlyWait(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		// PageLoad TimeOuts
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));	// To Get the url by .get method
		
	}

	@AfterSuite
	public void TearDown() {

		driver.close();  //To Close the current window 
		
	}

}
