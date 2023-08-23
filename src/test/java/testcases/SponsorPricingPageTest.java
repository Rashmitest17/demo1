package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.IndexPage;
import pageobjects.SponsorPricingPage;

public class SponsorPricingPageTest extends BaseTest2 {

	IndexPage indexPage;
	
	public SponsorPricingPageTest() {
		super();
	
	}
	
	
	@BeforeMethod
	public void load() {
		initialization();
		indexPage = new IndexPage();
		
	}
	
	@Test
	public void Verify_sponserPricingPage() throws InterruptedException {
		
		//WebElement footerlinksElement = driver.findElement(By.linkText(""));
		//footerlinksElement.click();
		
		SponsorPricingPage sp = new SponsorPricingPage();
		sp.sponserPricing();
		
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

	
	
}
