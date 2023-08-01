package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;
import actions.Action;

public class IndexPageNew extends BaseTest2 {

	Action action = new Action();

	// Page Factory
	@FindBy(css = "#website-header > div.logo-search-wrapper > div > div > div.logo-wrapper > a > svg")
	// *[@id="website-header"]/div[1]/div/div/div[1]/a/svg
	WebElement logoElement;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	WebElement signinicon;

	// Initializing the page objects
	public IndexPageNew() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginpageTitle() {

		return action.getTitle(driver);

		// driver.getTitle();
	}

	public String validateIndexpageTitle() {
		return action.getTitle(driver);
		// return driver.getTitle();
	}

	public boolean validategoodfirmsImage() {
		return action.isDisplayed(driver, logoElement);
		// return logoElement.isDisplayed();

	}

	public LoginPageNew clickonSignin() {

		action.click(driver, signinicon);
		// signinicon.click();
		return new LoginPageNew();
	}
}
