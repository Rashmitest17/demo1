package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.BuildYourProfile;
import pageobjects.HomePage;

public class BuildYourProfileTest extends BaseTest2 {

   Logger logger = LogManager.getLogger(BuildYourProfileTest.class);
	
	IndexPageTest indexPageTest;
	HomePage homePage;
	BuildYourProfile buildyourprofile;

	public BuildYourProfileTest() {
		super();
	}

	@BeforeMethod
	public void load() {

		initialization();
		indexPageTest = new IndexPageTest();
		homePage = new HomePage();
	}

	@Test
	public void Verify_BuildYourProfileTest() {
		buildyourprofile = new BuildYourProfile();
		buildyourprofile.buildyourprofile();

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
