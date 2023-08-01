package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v100.page.model.NavigatedWithinDocument;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;

public class BuildYourProfile extends BaseTest2 {

	// Page Factory Objects
	@FindBy(xpath = "//a[normalize-space()='Build Your Profile']")
	WebElement footerlinkElement;

	@FindBy(xpath = "//button[@id='defaultOpen']")
	WebElement collectionreviewElement;

	@FindBy(xpath = "//a[normalize-space()='Add Reviews']")
	WebElement addReviewElement;

	// Initialization
	public void BuildYourProfile() {

		PageFactory.initElements(driver, this);
	}

	// Actions
	public HomePage buildyourprofile() {

		// Down Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

		footerlinkElement.click();
		collectionreviewElement.click();
		addReviewElement.click();
		driver.navigate().forward();

		return new HomePage();

	}

}
