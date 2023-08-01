package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseTest2;
import actions.Action;

public class LoginPageNew extends BaseTest2 {

	Action action = new Action();

	@FindBy(id = "email")
	WebElement emailElement;

	@FindBy(id = "password")
	WebElement passwordElement;

	@FindBy(css = "#recaptcha-anchor > div.recaptcha-checkbox-border")
	WebElement captchaElement;

	@FindBy(css = "#login > div.form-group.clearfix > button")
	WebElement signinbtn;

	@FindBy(css = "#website-header > div.logo-search-wrapper > div > div > div.search-signIn-wrapper.align-center.flex > div > a")
	WebElement loggediniconElement;

	@FindBy(xpath = "//*[@id=\"content\"]/article/div/div/section/div[1]/p[1]")
	WebElement usernamElement;

	public LoginPageNew() {

		PageFactory.initElements(driver, this);
	}

	public HomePageNew login(String un, String pwd) throws InterruptedException {

		action.type(emailElement, un);
		action.type(passwordElement, pwd);

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
		wait1.until(ExpectedConditions.elementToBeClickable((By.className("recaptcha-checkbox-border")))).click();

		System.out.println("Clicked the checkbox");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		action.click(driver, signinbtn);

		action.click(driver, loggediniconElement);

		System.out.println(usernamElement.isDisplayed());

		return new HomePageNew();

	}

}
