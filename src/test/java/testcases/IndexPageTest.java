package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.IndexPage;

public class IndexPageTest extends BaseTest2 {
	Logger logger = LogManager.getLogger(IndexPageTest.class);
	
	IndexPage indexPage;

	public IndexPageTest() {
		super();
	}

	@BeforeMethod
	public void load() {
		initialization();
		indexPage = new IndexPage();

	}

	@Test
	public void verify_GoodfirmsImageTest() {
		System.out.println(indexPage.validategoodfirmsImageLogo());
		Assert.assertTrue(true);
		System.out.println("GoodFirms Image Logo Displayed");
	}

	@Test
	public void verify_IndexPageTitleTest() {
		String str1 = " GoodFirms - B2B Reviews & Ratings you can trust";
		String str2 = " GoodFirms - B2B Reviews & Ratings you can trust";
		System.out.println("Page Title :--> " + indexPage.validateIndexpageTitle());
		Assert.assertEquals(str1, str2);
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();

	}

}
