package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;

public class FindServicesPage extends BaseTest2 {

	// This Test Case for Company.

	// Page Factory Objects
	@FindBy(xpath = "//*[@id=\"website-header\"]/div[2]/div/div/nav/ul/li[1]/button")
	WebElement servicemenu;

	@FindBy(xpath = "//*[@id=\"service-category-menu\"]/li[2]/button")
	// (xpath ="//*[@id=\"service-category-menu\"]/li[2]/a")
	WebElement service;

	@FindBy(xpath = "//*[@id=\"service-category-menu\"]/li[2]/div/ul/li[4]/a")
	WebElement megasubmenu;

	@FindBy(xpath = "//*[@id=\"website-header\"]/div[2]/div/div/nav/ul/li[1]/button")
	WebElement navigationElement;

	@FindBy(xpath = "//*[@id=\"service-category-menu\"]/li[1]/button")
	WebElement plElement;

	@FindBy(xpath = "//*[@id=\"service-category-menu\"]/li[1]/div/ul/li[5]/a")
	WebElement languagElement;

	@FindBy(xpath = "//*[@id=\"header\"]/div/div[3]/a")
	WebElement mleadermatrixElement;

	// initialization
	public FindServicesPage() {

		PageFactory.initElements(driver, this);

	}

	// Actions -- Menus
	public HomePage GFindServices_Menu() {
		servicemenu.click();

		Actions a = new Actions(driver);

		a.moveToElement(service).perform();
		System.out.println("Click on Web & App Development");

		a.moveToElement(megasubmenu).perform();
		megasubmenu.click();

		a.moveToElement(navigationElement).perform();
		navigationElement.click();

		a.moveToElement(plElement).perform();

		a.moveToElement(languagElement).perform();
		languagElement.click();

		return new HomePage();

	}
}
