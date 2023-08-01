package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BaseTest2;

public class VendorViewPortfolioList extends BaseTest2 {

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

	public VendorViewPortfolioList() {

		PageFactory.initElements(driver, this);
	}

	public VendorAddPortfolioList portfoliomenu() {

		// Go to menu and clic on portfolio
		loggediniconElement.click();
		organizationElement.click();
		portfolioclickElement.click();

		return new VendorAddPortfolioList();

	}

}
