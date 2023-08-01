package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.HomePage;
import pageobjects.IndexPage;
import pageobjects.LoginPage;

public class LoginPageTest extends BaseTest2 {
	Logger logger = LogManager.getLogger(LoginPageTest.class);

	// Test Case for Sign in to your Vendor Profile
	LoginPage loginPage;
	IndexPage indexPage;
	HomePage homePage;

	public LoginPageTest() {
		//super class constructor called by super keyword.
		super(); // properties method to access must be create class constructor.
	}

	@Parameters("browser")
	@BeforeMethod
	public void setup() {
		initialization();
		indexPage = new IndexPage();
		loginPage = new LoginPage();
	}

	@Test(priority = 4, enabled = true)
	public void Verify_loginPageTitleTest() {

		String title = indexPage.validateLoginpageTitle();
		Assert.assertEquals(title, "GoodFirms - B2B Reviews & Ratings you can trust");
		logger.info("Verify_loginPageTitleTest");
	}

	@Test(priority = 2, enabled = true)
	public void Verify_goodfirmsImageTest() {
		boolean flag = indexPage.validategoodfirmsImageLogo();
		Assert.assertTrue(flag);
		logger.info("Verify_goodfirmsImageTest");

	}

	@Test(priority = 3, enabled = true )
	public void verify_ValidSigninClickTest() {

		indexPage = new IndexPage();
		indexPage.clickonSignin();
		logger.info("Verify_signinClick");

	}

	@Test(priority = 1, enabled = true)
	public void verify_ValidloginTest() throws InterruptedException {

		indexPage.clickonSignin();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		logger.info("Verify_loginTest");
	}
	
	
	
	@Test(priority = 6, enabled = true)
	public void Verify_InvalidloginTest() throws InterruptedException {

		indexPage.clickonSignin();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("passwordIn"));
		Thread.sleep(3000);
		System.out.println("Invalid Credential popup message displayed");
		logger.info("Verify_InvalidloginTest");
	}

	@Test(priority = 5, enabled = true)
	public void verify_BlankCheckTest() throws InterruptedException {
		indexPage.clickonSignin();
		homePage = loginPage.login(prop.getProperty("blankuname"), prop.getProperty("blankpwd"));

		Thread.sleep(3000);
		System.out.println("Validations are display Properly for Blank Values");
		logger.info("Verify_BlankCheck");

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
