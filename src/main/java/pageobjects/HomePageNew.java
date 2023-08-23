package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;
import actions.Action;

public class HomePageNew extends BaseTest2 {

	Action action = new Action();

	@FindBy(xpath = "//*[@id=\"website-header\"]/div[1]/div/div/div[1]/a/svg")
	WebElement logoElement;

	@FindBy(css = "#website-header > div.logo-search-wrapper > div > div > div.search-signIn-wrapper.align-center.flex > div > a")
	WebElement loggediniconElement;

	@FindBy(xpath = "//body[1]/div[1]/main[1]/article[1]/div[1]/div[1]/section[1]/div[1]/p[1]")
	// "//*[@id=\"content\"]/article/div/div/section/div[1]/p[1]")
	WebElement usernamElement;

	public HomePageNew() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateLogo() {
		return logoElement.isDisplayed();

	}

	public static String getCurrURL() {

		String homepageURL = driver.getCurrentUrl();
		return homepageURL;
	}

	public boolean verifyUserName() {

		String data = usernamElement.getText();
		System.out.println("VerifyUserName:--" + data);
		return usernamElement.isDisplayed();

	}
	

	

}
