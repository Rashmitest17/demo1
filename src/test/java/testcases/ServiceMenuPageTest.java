package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.FindServicesPage;
import pageobjects.IndexPage;

public class ServiceMenuPageTest extends BaseTest2 {

	Logger logger = LogManager.getLogger(LoginPageTest.class);
	
	IndexPage indexPage;

	public ServiceMenuPageTest() {

		super();

	}

	@Parameters("browser")
	@BeforeMethod
	public void setup() {

		initialization();
		indexPage = new IndexPage();
	}

	@Test
	public void verify_servicemenu() {

		FindServicesPage fS = new FindServicesPage();
		fS.GFindServices_Menu();
	}

	@AfterMethod
	public void TearDown() {
		driver.close();
	}

}
