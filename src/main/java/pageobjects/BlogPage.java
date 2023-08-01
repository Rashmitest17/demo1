package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;

public class BlogPage extends BaseTest2 {

	// Page factory
	@FindBy(linkText = "Blogs")
	WebElement blogtest;

	// initializing page objects
	public BlogPage() {

		PageFactory.initElements(driver, this);

	}

	public HomePage testblogpage() {
		blogtest.click();
		return new HomePage();

	}
}
