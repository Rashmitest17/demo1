package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;

public class HomePage extends BaseTest2 {

	@FindBy(xpath = "//*[@id=\"website-header\"]/div[1]/div/div/div[1]/a/svg")
	WebElement logoElement;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateLogo() {
		return logoElement.isDisplayed();

	}

	public static String getCurrURL() {

		String homepageURL = driver.getCurrentUrl();
		return homepageURL;

	}

}
