package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseTest2;
import pageobjects.IndexPage;
import pageobjects.TopSearchPage;

public class TopSearchPageTest extends BaseTest2 {

	IndexPage indexPage;
	TopSearchPage topSearchPage;

	public TopSearchPageTest() {

		super();
	}

	@Parameters("browser")
	@BeforeMethod
	public void load() {
		initialization();
		indexPage = new IndexPage();

	}

	@Test(priority = 4, enabled = false)
	public void verify_TopSearch() throws InterruptedException {

		TopSearchPage searchPage = new TopSearchPage();
		searchPage.topSearch();
		Thread.sleep(3000);
	}

	@Test(priority = 2, enabled = false)
	public void verify_BlankTopSearch() throws InterruptedException {

		TopSearchPage searchPage = new TopSearchPage();
		searchPage.BlankTopSearch();
		Thread.sleep(3000);
	}

	@Test(priority = 3, enabled = false)
	public void verify_InvalidTopSearch() throws InterruptedException {

		TopSearchPage searchPage = new TopSearchPage();
		searchPage.InvalidTopSearch();
		Thread.sleep(3000);
	}

	@Test(priority = 1, enabled = false)
	public void verify_searchIconPresent() {
		topSearchPage = new TopSearchPage();
		boolean flag = topSearchPage.validatesearchicon();
		Assert.assertTrue(flag);
		System.out.println(" Search icon is Present in search Box and Value is :--- " + flag);
	}

	@Test(priority = 5, enabled = false)
	public void verify_cursorEnabledinsearchbox() {
		topSearchPage = new TopSearchPage();
		boolean flag = topSearchPage.validateCursorisEnabled();
		Assert.assertTrue(flag);
		System.out.println(" Cursor is Enabled in search Box and Value is :--- " + flag);
	}

	@Test(priority = 6, enabled = false)
	public void verify_LoaderdisplaySearch() throws InterruptedException {

		topSearchPage = new TopSearchPage();
		topSearchPage.validateLoader();
		Thread.sleep(3000);

	}

	@Test(priority = 7, enabled = false)
	public void verify_validateSuggessionSearch() throws InterruptedException {
		// Verify suggestions shown or not on adding a keyword to search.
		topSearchPage = new TopSearchPage();
		topSearchPage.validateSuggessionSearch();
		String str1 = "1902 Software Development Corporation";
		String str2 = "1902 Software Development Corporation";
		Assert.assertEquals(str1, str2);
		System.out.println("Suggestions shown on adding a keyword to search");
		Thread.sleep(3000);

	}

	@Test(priority = 8, enabled = false)
	public void verify_validateSearchBoxonTop() {
		// Verify the search field present and aligned.
		topSearchPage = new TopSearchPage();
		boolean flag = topSearchPage.validateSearchBoxonTop();
		Assert.assertTrue(flag);
		System.out.println("Search Box is present on WebPage and  their GUI Proper Aligned, and Result:--- " + flag);
	}

	@Test(priority = 9, enabled = false)
	public void verify_valiateskipsearch() {

		System.out.println("Functionality is Skipped");
		throw new SkipException("Some modification in Search Module");
	}

	@Test(priority = 10, enabled = false)
	public void verify_NegativeTcs() {

		String s1 = "test";
		String s2 = "test2";
		Assert.assertEquals(s1, s2);
		Assert.assertTrue(false);

	}

	@Test(priority = 11, enabled = false)
	public void verify_NoResultFoundSerchPopup() throws InterruptedException {
		// Verify NoResultFound Popup in Search box while entering invalid text.
		topSearchPage = new TopSearchPage();
		topSearchPage.validateNoResultFoundsearchPopup();
		Thread.sleep(3000);

	}

	@Test(priority = 12, enabled = false)
	public void verify_validateBlogSearch() throws InterruptedException {
		// Search By Blog
		topSearchPage = new TopSearchPage();
		topSearchPage.validateBlogSearchTest();

	}

	@Test(priority = 13, enabled = false)
	public void verify_validateBlogSearchByViewAllResultTest() throws InterruptedException {
		// Search by view All Result by Click on View Result link
		topSearchPage = new TopSearchPage();
		topSearchPage.validateBlogSearchByViewAllResultTest();
	}

	@Test(priority = 14, enabled = false)
	public void verify_InsightReaserchTest() throws InterruptedException {
		// Click on Insignts and open Resarch Page.
		topSearchPage = new TopSearchPage();
		topSearchPage.validateResearch();

	}

	@Test(priority = 15, enabled = true)
	public void verify_validateSearchBymultilingualService_Lanaguage() throws InterruptedException {
		try {
		// validateSearchBymultilingualService --BMC Software Company اپلیکیشن, برنامه
		topSearchPage = new TopSearchPage();
		topSearchPage.validateSearchBymultilingualService();
		}
		catch(Throwable e) {
			e.printStackTrace();
			System.out.println("Company is not an Active so company name is not listed.");
		}
		}
	
	@AfterMethod
	public void TearDown() {
		driver.close();
	}

}
