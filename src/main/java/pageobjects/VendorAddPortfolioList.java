package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import Base.BaseTest2;

public class VendorAddPortfolioList extends BaseTest2 {

	@FindBy(css = "#website-header > div.logo-search-wrapper > div > div > div.search-signIn-wrapper.align-center.flex > div > a")
	WebElement loggediniconElement;

	@FindBy(xpath = "//*[@id=\"content\"]/article/div/div/aside[1]/ul/li[2]/a/span")
	WebElement organizationElement;

	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/article/div/div/aside[1]/ul/li[2]/ul/li[2]/a/span")
	WebElement portfolioclickElement;

	@FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/article/div/div/section/div[1]/div[1]/div/a")
	WebElement addportfolioElement;

	@FindBy(how = How.ID, using = "title")
	WebElement titleElement;

	@FindBy(how = How.ID, using = "CompanyPortfolioLinklabel0")
	WebElement projectlinkElement;

	@FindBy(how = How.ID, using = "CompanyPortfolioLink0")
	WebElement projecturlElement;

	@FindBy(how = How.LINK_TEXT, using = "Add more links")
	WebElement addmorelinkElement;

	@FindBy(how = How.CSS, using = "#portfolio_info > div.row.portfolio-link-wrapper > div > div:nth-child(3) > div.project-link-remove-wrapper.pull-right > a > svg")
	WebElement canceladdmorelinkElement;

	@FindBy(how = How.ID, using = "CompanyPortfolioTimeLine")
	WebElement timelineElement;

	@FindBy(how = How.ID, using = "CompanyPortfolioCost")
	WebElement projectcostElement;

	@FindBy(how = How.ID, using = "CompanyPortfolioIndustry")
	WebElement projectforindustryElement;

	@FindBy(how = How.ID, using = "portfolioThumbnail")
	WebElement portfolioimgElement;

	@FindBy(how = How.CSS, using = "#portfolio-screenshot-wrapper > div > div.upload-text.relative.clearfix > div > button")
	WebElement uploadscreenshotElement;

	@FindBy(how = How.XPATH, using = "/html/body/p")
	@CacheLookup
	WebElement projectdescriptionElement;

	@FindBy(how = How.CSS, using = "//*[@id=\"portfolio-screenshot-wrapper\"]/div/div[2]/div/button")
	WebElement browsetestElement;

	public void portfoliomenu() {

		// Go to menu and clic on portfolio
		loggediniconElement.click();
		organizationElement.click();
		portfolioclickElement.click();

	}

	public void add_Portfolio() throws InterruptedException {
		System.out.println("*************Click on Add Portfolio Link***************");
		addportfolioElement.click();
		titleElement.sendKeys("Portfolio-A");

		Thread.sleep(1000);
		Select select = new Select(projectlinkElement);
		select.selectByIndex(2);

		projecturlElement.sendKeys("http://www.google.com");

		addmorelinkElement.click();
		Thread.sleep(1000);

		canceladdmorelinkElement.click();

		Thread.sleep(1000);

		Select timelineSelect = new Select(timelineElement);
		timelineSelect.selectByIndex(4);

		Thread.sleep(1000);

		Select projectcost = new Select(projectcostElement);
		projectcost.selectByIndex(3);

		Thread.sleep(1000);

		Select projectforindustry = new Select(projectforindustryElement);
		projectforindustry.selectByIndex(6);
		Thread.sleep(1000);

	}

	public void portfolioThumbnail_uploadimage() throws InterruptedException {

		String absolutepath = new String(
				System.getProperty("user.dir") + "\\resources\\testdata\\265_175_PX_Portfolio.jpg");
		// Actual Path : -->
		// //"C:\\Users\\Rashmi\\eclipse-workspace\\NewProject1\\resources\\265_175_PX_Portfolio.jpg");
		System.out.println(absolutepath);
		portfolioimgElement.sendKeys(absolutepath);
		Thread.sleep(2000);

	}

	public void uploadScreenshot() {

		Actions a = new Actions(driver);
		a.moveToElement(uploadscreenshotElement).click().perform();

	}
}
