package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.BlogPage;
import pageobjects.IndexPage;

public class BlogPageTest extends BaseTest2 {
	Logger logger = LogManager.getLogger(BlogPageTest.class);
	public BlogPageTest() {

		super();
	}

	@Parameters("browser")
	@BeforeMethod
	public void load() {
		initialization();
		IndexPage indexPage = new IndexPage();

	}

	@Test
	public void verify_BlogPage() {

		BlogPage blogPage = new BlogPage();
		blogPage.testblogpage();

	}

	@AfterMethod
	public void TearDown() {
		driver.close();

	}

}
