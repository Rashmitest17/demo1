package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.FooterLinksPage;
import pageobjects.IndexPage;

public class VerifyFooterLinksclickTest extends BaseTest2 {

	//Logger logger = LogManager.getLogger(VerifyFooterLinksclickTest.class);

	Logger logger = LogManager.getLogger(VerifyFooterLinksclickTest.class);
	
	FooterLinksPage footerlinkpage;
	IndexPage indexPage;

	public VerifyFooterLinksclickTest() {

		super();
		// The super() function is used to give access to methods and properties of a
		// parent or sibling class.
	}

	@BeforeMethod
	public void setup() {

		initialization();
		indexPage = new IndexPage();
		footerlinkpage = new FooterLinksPage();

	}

	@Test(priority = 2, enabled = true)
	public void footerlinks_aboutTest() throws InterruptedException {

		footerlinkpage.footerlink_About();
		logger.info("Footer Goodfrims Logo Clicked and view on new page!!");
		logger.info("Open Social Media icons clicks clickable links - LinkedIn,FB,Twitter,");
		logger.info("Open Privacy link");
		logger.info("Open Terms of use link");
		logger.info("Open WHY GOODFIRMS link");
		logger.info("Open HELP CENTER link");
		logger.info("Open GLOSSARY link");
		logger.info("Open BLOGS link");
		logger.info("Open FAQS link");
		logger.info("Open RESEARCH link");
		logger.info("Open METHODOLOGY link");
		logger.info("Open FIND SERVICES link");
		logger.info("Open FIND SOFTWARE link");
		logger.info("Open INSIGHTS link");
		logger.info("Open WRITE A REVIEW link");
		logger.info("Open GET LISTED link");
		logger.info("Open WHY GET LISTED? link");
		logger.info("Open BUILD YOUR PROFILE link");
		logger.info("Open BOOST YOUR PROFILE link");
		logger.info("Open VENDOR LOGIN link");

	}

	@Test(priority = 1, enabled = true)
	public void verify_copyrightTest() {
		String str1 = "Copyright © GoodFirms 2023 | All rights reserved";
		String str2 = "Copyright © GoodFirms 2023 | All rights reserved";
		Assert.assertEquals(str1, str2);
		footerlinkpage.verify_Copyright();
		logger.atTrace();

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
