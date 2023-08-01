/**
 * 
 */
package com.mytests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.mypages.BasePageA;
import com.mypages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rashmi
 *
 */
public class BaseTestA {

	WebDriver driver;
	public Page page;
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

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setupTest(String browser) throws InterruptedException {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("MicrosoftEdge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("No Browser is defined in xml file");
		}
		driver.get("https://account.goodfirms.co");
		driver.manage().window().maximize();

		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// important -- we are using constructor of page class
		page = new BasePageA(driver);

	}

	@AfterMethod
	public void TearDown() {
		// driver.quit();

	}
}
