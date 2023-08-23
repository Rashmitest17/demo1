package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.HomePageNew;
import pageobjects.IndexPageNew;
import pageobjects.LoginPageNew;

public class LoginTestCaseNew extends BaseTest2 {

	IndexPageNew indexPageNew;
	LoginPageNew loginPageNew;
	HomePageNew homePageNew;

	public LoginTestCaseNew() {
		super();
	}

	@BeforeMethod
	public void launch() {

		initialization();
		indexPageNew = new IndexPageNew();
		loginPageNew = new LoginPageNew();

	}

	@Test
	public void logintestAndVerifyUserNameTest() throws InterruptedException {

		indexPageNew.clickonSignin();
		homePageNew = loginPageNew.login(prop.getProperty("username"), prop.getProperty("password"));
		// logger.info("Verify_loginTest");
		Thread.sleep(1000);

		String actualURL = homePageNew.getCurrURL();
		String expectedURL = "https://account.goodfirms.co/manage/dashboard";
		Assert.assertEquals(actualURL, expectedURL, "Valid URL");

		Thread.sleep(1000);

		Assert.assertTrue(homePageNew.verifyUserName());
		String actualString = "Welcome, Justin";
		String expectedString = "Welcome, Justin";
		Assert.assertEquals(actualString, expectedString, "Valid UserName");

	}
	
	@AfterMethod
	public void TearDown() {
		// Close the browser
		driver.quit();
	}

}
