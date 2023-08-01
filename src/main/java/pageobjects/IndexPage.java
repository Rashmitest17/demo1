package pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;

public class IndexPage extends BaseTest2 {

	// Page Factory
	//@FindBy(css = "#website-header > div.logo-search-wrapper > div > div > div.logo-wrapper > a > svg")
	@FindBy(xpath="//*[local-name()='svg']")
	// *[@id="website-header"]/div[1]/div/div/div[1]/a/svg
	WebElement logoElement;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
	WebElement signinicon;

	@FindBy(xpath = "/html/body/main/article/section[4]/div/div[1]/h2")
	WebElement homelocation;

	// Initializing the page objects
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginpageTitle() {
		return driver.getTitle();
	}
	
	public String validateIndexpageTitle() {
		return driver.getTitle();
	}

	public boolean validategoodfirmsImageLogo() {
		return logoElement.isDisplayed();

	}
	

	public LoginPage clickonSignin() {
		signinicon.click();
		return new LoginPage();
	}

	public void validate_BrowseLocations() {
		assertEquals(homelocation.getText(), "Browse services from around the world");

	}

}
