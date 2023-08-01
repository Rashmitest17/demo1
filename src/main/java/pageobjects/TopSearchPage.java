package pageobjects;

import javax.lang.model.util.SimpleElementVisitor6;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.openqa.selenium.interactions.Actions;

import Base.BaseTest2;

public class TopSearchPage extends BaseTest2 {

	Actions actions = new Actions(driver);
	// Page Factory
	@FindBy(how = How.XPATH, using = "//*[@id=\"website-header\"]/div[1]/div/div/div[2]/form/input")
	@CacheLookup
	WebElement sElement;

	@FindBy(xpath = "//*[@id=\"website-header\"]/div[1]/div/div/div[2]/form/button")
	WebElement searchiconElement;

	@FindBy(xpath = "//*[@id=\"website-header\"]/div[1]/div/div/div[2]/form/div/div[4]/div[2]/div/a")
	WebElement blogElement;

	@FindBy(xpath = "/html/body/main/div[2]/div/section/div/div/p/a")
	WebElement blogreadmorElement;

	@FindBy(xpath = "/html/body/main/div[1]/div/div")
	WebElement searchquery;

	@FindBy(xpath = "//*[@id=\"website-header\"]/div[1]/div/div/div[2]/form/div/div[5]/div[2]/div/a/span")
	WebElement researchElement;

	@FindBy(xpath = "//*[@id=\"website-header\"]/div[1]/div/div/div[2]/form/div")
	WebElement searchpathElement;
	
	@FindBy(xpath = "//span[@class='enity-tilte']")
	WebElement companyElement;

	// Initialize page objects
	public TopSearchPage() {

		PageFactory.initElements(driver, this);
	}

	// Actions
	public HomePage topSearch() throws InterruptedException {

		sElement.sendKeys(prop.getProperty("searchname"));
		sElement.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("The Page Title is :- " + driver.getTitle());
		return new HomePage();

	}

	public HomePage BlankTopSearch() {

		sElement.sendKeys(prop.getProperty("blanksearchname"));
		sElement.sendKeys(Keys.ENTER);

		return new HomePage();

	}

	public HomePage InvalidTopSearch() {

		sElement.sendKeys(prop.getProperty("invalidsearch"));
		sElement.sendKeys(Keys.ENTER);

		return new HomePage();

	}

	public boolean validateSearchBoxonTop() {
		return sElement.isDisplayed();
	}

	public boolean validatesearchicon() {
		return searchiconElement.isDisplayed();
	}

	public boolean validateCursorisEnabled() {
		return searchiconElement.isEnabled();
	}

	public HomePage validateLoader() {

		sElement.sendKeys(prop.getProperty("loader"));
		sElement.sendKeys(Keys.ENTER);

		return new HomePage();
	}

	public HomePage validateSuggessionSearch() throws InterruptedException {

		sElement.sendKeys(prop.getProperty("suggessionsearch"));
		Thread.sleep(3000);
		sElement.sendKeys(Keys.ENTER);

		return new HomePage();
	}

	public HomePage validateNoResultFoundsearchPopup() throws InterruptedException {

		sElement.sendKeys(prop.getProperty("invalidsearch"));
		Thread.sleep(4000);

		return new HomePage();
	}

	public HomePage validateBlogSearchTest() throws InterruptedException {

		sElement.sendKeys(prop.getProperty("blogsearch"));
		Thread.sleep(1000);

		String str = prop.getProperty("blogsearch");

		// sElement.sendKeys(Keys.chord(Keys.valueOf(str)));

		blogElement.click();
		Thread.sleep(1000);

		// sElement.sendKeys(Keys.ENTER);
		return new HomePage();
	}

	public HomePage validateBlogSearchByViewAllResultTest() throws InterruptedException {

		sElement.sendKeys(prop.getProperty("blogsearch"));
		Thread.sleep(1000);

		sElement.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		System.out.println(searchquery.getText());

		blogreadmorElement.click();
		Thread.sleep(1000);

		System.out.println(searchquery.isDisplayed());

		String str1 = prop.getProperty("blogsearch");
		String str2 = "Zoho Review 2021: How Serious is this Software in Improving Your Business Experience?";

		Assert.assertEquals(str1, str2, "Blog Search Title are matched");
		
		return new HomePage();

	}

	public HomePage validateResearch() throws InterruptedException {

		sElement.sendKeys(prop.getProperty("reaserch"));
		Thread.sleep(2000);

		researchElement.click();
		Thread.sleep(1000);

		return new HomePage();

	}

	public HomePage validateSearchBymultilingualService() throws InterruptedException {
		sElement.sendKeys(prop.getProperty("multilingual"));
		
		companyElement.click(); // Click on company name and display company detail
		
		Thread.sleep(1000);

		researchElement.click();
		Thread.sleep(1000);

		return new HomePage();

	}

	/*
	 * Common test approaches use data to completed project How much required task
	 * to need to create test estimate Organization own estimate appoaach
	 */

}
