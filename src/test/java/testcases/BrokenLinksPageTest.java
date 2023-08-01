package testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.BlogPage;
import pageobjects.BrokenLinkPage;
import pageobjects.HomePage;
import pageobjects.IndexPage;
import pageobjects.LoginPage;

public class BrokenLinksPageTest extends BaseTest2 {
	LoginPage loginPage;
	IndexPage indexPage;
	BrokenLinkPage brokenlinkpage;

	public BrokenLinksPageTest() {

		super();
	}

	@Parameters("browser")
	@BeforeMethod
	public void load() throws InterruptedException {
		initialization();
		IndexPage indexPage = new IndexPage();
		indexPage.clickonSignin();

		loginPage = new LoginPage();
		Thread.sleep(1000);
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Test(priority = 1, enabled = true)
	public void Verify_BrokenLinks() throws MalformedURLException, IOException {

		// To Verify Broken links after login form
		brokenlinkpage = new BrokenLinkPage();
		brokenlinkpage.brokenlinks();

	}

	@Test(priority = 2, enabled = false)
	public void verify_brokenlinks1() throws IOException {
		brokenlinkpage = new BrokenLinkPage();
		brokenlinkpage.brokenlinks1();
		
	}
	
	
	
	
	
	  
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
	
	

}
