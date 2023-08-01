package testcases;

import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.HomePage;
import pageobjects.IndexPage;
import pageobjects.LoginPage;
import pageobjects.VendorAddPortfolioList;
import pageobjects.VendorViewPortfolioList;

public class ViewVendorPortfolioListTest extends BaseTest2 {

	IndexPage indexPage;
	HomePage homePage;
	LoginPage loginPage;
	LoginPageTest loginPageTest;
	VendorViewPortfolioList vendorViewPortfolioList;
	VendorAddPortfolioList vendorAddPortfolioList;

	public ViewVendorPortfolioListTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		IndexPage indexPage = new IndexPage();
		LoginPage loginPage = new LoginPage();

	}

	@SuppressWarnings("finally")
	@Test(priority = 2, enabled = false)
	public void Verify_Listofportfolioskip() throws InterruptedException {

		try {
			// Click on signin and then login flow
			indexPage = new IndexPage();
			indexPage.clickonSignin();

			loginPage = new LoginPage();
			loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

			// Click on profile icon and display list of view portfolio Result
			vendorViewPortfolioList = new VendorViewPortfolioList();
			vendorAddPortfolioList = vendorViewPortfolioList.portfoliomenu();

		} catch (ElementClickInterceptedException e) {
			e.printStackTrace();
		} finally {
			// For Skip this Testcase
			System.out.println("testing skipped functionality");
			throw new SkipException("Login Functionality is incomplete");
		}
	}

	@Test(priority = 1, enabled = true)
	public void Verify_Listofportfolio() throws InterruptedException {

		// Click on signin and then login flow
		indexPage = new IndexPage();
		indexPage.clickonSignin();

		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

		// Click on profile icon and display list of view portfolio Result
		vendorViewPortfolioList = new VendorViewPortfolioList();
		vendorAddPortfolioList = vendorViewPortfolioList.portfoliomenu();

	}

	@AfterMethod
	public void TearDown() {

		driver.close();
	}

}
