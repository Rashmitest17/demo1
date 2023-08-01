package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseTest2;

public class LoginPage extends BaseTest2 {

	// Page Object

	@FindBy(id = "email")
	WebElement emailElement;

	@FindBy(id = "password")
	WebElement passwordElement;

	@FindBy(css = "#recaptcha-anchor > div.recaptcha-checkbox-border")
	WebElement captchaElement;

	//@FindBy(css = "#login > div.form-group.clearfix > button")
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement signinbtn;

//	@FindBy(how = How.CSS, using ="#login > div.form-group.clearfix > button")
//	@CacheLookup
//	WebElement signinbtn;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	/*
	 * public Homepage signin() throws InterruptedException {
	 * 
	 * // To Verify click works or not on SignIn Button. signinicon.click();
	 * 
	 * emailElement.sendKeys(prop.getProperty("username"));
	 * passwordElement.sendKeys(prop.getProperty("password"));
	 * 
	 * // Select Captcha WebDriverWait wait1 = new WebDriverWait(driver,
	 * Duration.ofSeconds(25));
	 * 
	 * wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(
	 * "//iframe[@title='reCAPTCHA']")));
	 * wait1.until(ExpectedConditions.elementToBeClickable((By.className(
	 * "recaptcha-checkbox-border")))).click();
	 * System.out.println("Clicked the checkbox");
	 * 
	 * Thread.sleep(2000); driver.switchTo().defaultContent();
	 * 
	 * signinbtn.click(); return Homepage();
	 * 
	 * 
	 * 
	 * }
	 */

	/*
	 * public HomePage login(String uname,String psw,HomePage homePage) throws
	 * IOException, InterruptedException {
	 * 
	 * action.type(emailElement,uname); action.type(passwordElement,psw);
	 * 
	 * action.click(driver,signinbtn); Thread.sleep(2000); homePage= new HomePage();
	 * return new HomePage();
	 * 
	 * }
	 */

	// Actions

	public HomePage login(String un, String pwd) throws InterruptedException {

		emailElement.clear();
		emailElement.sendKeys(un);

		passwordElement.clear();
		passwordElement.sendKeys(pwd);

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
		wait1.until(ExpectedConditions.elementToBeClickable((By.className("recaptcha-checkbox-border")))).click();

		/*
		 * //WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(25));
		 * 
		 * driver.switchTo().frame(driver.findElement(By.
		 * xpath("//iframe[@title='reCAPTCHA']recaptcha challenge expires in two minutes"
		 * )));
		 * 
		 * Thread.sleep(500);
		 * 
		 * captchaElement.click();
		 * //driver.findElement(By.className("recaptcha-checkbox-border")).click();
		 * 
		 */

		System.out.println("Clicked the checkbox");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		signinbtn.click();

		return new HomePage();

	}

}
