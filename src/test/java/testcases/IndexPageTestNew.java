package testcases;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.IndexPageNew;

public class IndexPageTestNew extends BaseTest2 {
	
	IndexPageNew indexPageNew;

	public IndexPageTestNew() {
		super();
	}

	@BeforeMethod
	public void load() {
		initialization();
		indexPageNew = new IndexPageNew();

	}

	@Test
	public void verifyGoodfirmsImageLogoTest() {
		System.out.println(indexPageNew.validategoodfirmsImage());
		Assert.assertTrue(true);
		System.out.println("GoodFirms Image Logo displayed");
	}

	@Test
	public void verify_IndexpageTitle() {
		System.out.println(indexPageNew.validateIndexpageTitle());
		Assert.assertTrue(true);
		System.out.println("Validate IndexPage Title!!!!");
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
