/**
 * 
 */
package com.mypages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Rashmi
 *
 */
public class LoginPageA extends BasePageA {

	// page locators:
	// declare with private variable

	private By emailid = By.id("email");
	private By password = By.id("password");
	private By captchaElement = By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border");
	private By signinbtn = By.cssSelector("#login > div.form-group.clearfix > button");
	// private By header =
	// By.xpath("/html/body/main/article/section[1]/div[6]/div/h1");

	private By header = By
			.cssSelector("#content > section > div > div > div:nth-child(2) > div.signin_card > div.signin_title > h4");

	private By signinicon = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]");

	public LoginPageA(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// withtheprivate out of the class i can not access them
	// getters -- concepts of encapsulation

	/**
	 * @return the emailid
	 */
	public WebElement getEmailid() {
		return getElement(emailid);
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the captchaElement
	 */
	public WebElement getCaptchaElement() {
		return getElement(captchaElement);
	}

	/**
	 * @return the signinbtn
	 */
	public WebElement getSigninbtn() {
		return getElement(signinbtn);
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getLoginpageTitle() {
		return getPageTitle();
	}

	public String getLoginPageHeader() {
		return getPageHeader(header);
	}

	/**
	 * @return the signinbtn
	 */
	public WebElement getSigninicon() {
		return getElement(signinicon);
	}

	public HomePageA doLogin(String username, String password) throws InterruptedException {
		getSigninicon().click();
		getEmailid().sendKeys(username);
		getPassword().sendKeys(password);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
		wait.until(ExpectedConditions.elementToBeClickable((By.className("recaptcha-checkbox-border")))).click();
		System.out.println("Clicked the checkbox");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		getSigninbtn().click();
		Thread.sleep(3000);

		return getInstance(HomePageA.class);
	}

	public void doLogin() { // void an nature but this is method overloading
		getSigninicon().click();
		getEmailid().sendKeys("");
		getPassword().sendKeys("");
		getSigninbtn().click();

	}

	// Enter user name but blank password
	public void doLogin(String usercre) throws InterruptedException {

		getSigninicon().click();

		if (usercre.contains("username")) {
			getEmailid().sendKeys(usercre.split(":")[1].trim());

		} else if (usercre.contains("password")) {
			getPassword().sendKeys(usercre.split(":")[1].trim());
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
		wait.until(ExpectedConditions.elementToBeClickable((By.className("recaptcha-checkbox-border")))).click();
		System.out.println("Clicked the checkbox");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		getSigninbtn().click();
	}

	public void doLogin_Invalid(String uname, String pwd) throws InterruptedException {
		getSigninicon().click();
		getEmailid().sendKeys(uname);
		getPassword().sendKeys(pwd);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
		wait.until(ExpectedConditions.elementToBeClickable((By.className("recaptcha-checkbox-border")))).click();
		System.out.println("Clicked the checkbox");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		getSigninbtn().click();
		Thread.sleep(3000);

	}
}
