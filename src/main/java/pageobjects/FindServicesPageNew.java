package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;
import actions.Action;
import io.github.bonigarcia.wdm.managers.VoidDriverManager;

public class FindServicesPageNew extends BaseTest2 {

	Action action = new Action();

	// This Test Case for Company.

	// Page Factory Objects
	// @FindBy(xpath =
	// "//*[@id=\"website-header\"]/div[2]/div/div/nav/ul/li[1]/button")

	@FindBy(className = "navbar-nav-button")
	WebElement servicemenu;

	// @FindBy(xpath = "//*[@id=\"service-category-menu\"]/li[2]/button")
	// (xpath ="//*[@id=\"service-category-menu\"]/li[2]/a")

	@FindBy(xpath = "//*[@class='navbar-nav-button']")
	WebElement webappserviceelement;

	@FindBy(xpath = "//*[@id=\"service-category-menu\"]/li[2]/div/ul/li[3]/a")
	WebElement ecomdevmegasubmenu;

	@FindBy(xpath = "//*[@id=\"website-header\"]/div[2]/div/div/nav/ul/li[1]/button")
	WebElement ecomdevtopmenuElement;

	@FindBy(xpath = "//*[@id=\"service-category-menu\"]/li[1]/button")
	WebElement platformservicElement;

	@FindBy(xpath = "//*[@id=\"service-category-menu\"]/li[1]/div/ul/li[2]/a")
	WebElement shopifyDeElement;

	// initialization
	public FindServicesPageNew() {

		PageFactory.initElements(driver, this);

	}

	// Actions -- Menus
	public HomePageNew GFindServices_Menu() throws InterruptedException {
		// For Click on FindServices menu
		action.click(driver, servicemenu);

		action.moveToElement(driver, webappserviceelement);
		System.out.println("Click on Web & App Development");

		action.click(driver, ecomdevmegasubmenu);

		action.click(driver, ecomdevtopmenuElement);

		action.moveToElement(driver, platformservicElement);
		System.out.println("PlatForm");

		action.click(driver, shopifyDeElement);

		Thread.sleep(1000);
		System.out.println(action.getTitle(driver));

		return new HomePageNew();

	}

	public void verify_Servicelisting() {

		System.out.println("Test Find services Listing page !!!!!");
		
		
		
		
	}

}
