package pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Base.BaseTest2;

public class FooterLinksPage extends BaseTest2 {

	@FindBy(css = "#website-footer > div.footer-info > div > div > div.goodfirms-address > div.company_address")
	WebElement sociElement;

	@FindBy(css = "#website-footer > div.footer-info > div > div > div.footer-menu.footer-about-wrapper")
	WebElement footerElement1;

	@FindBy(css = "#website-footer > div.footer-info > div > div > div.footer-menu.flex.footer-business-wrapper")
	WebElement footerElement2;

	@FindBy(css = "#website-footer > div.footer-info > div > div > div.goodfirms-address > div.goodfirms-logo.flex > a > svg")
	WebElement footergoodfirmslogo;

	@FindBy(css = "#website-footer > div.footer-copyright.flex.align-center.justify-center")
	WebElement copyrightElement;

	public FooterLinksPage() {

		PageFactory.initElements(driver, this);

	}

	public IndexPage footerlink_About() throws InterruptedException {

		footergoodfirmslogo.click();
		

		// WebElement opentabs = footerElement1;
		try {

			// Social Media icons + Privacy and Terms of use links
			sociElement.findElements(By.tagName("a")).size();

			for (int i = 0; i < sociElement.findElements(By.tagName("a")).size(); i++) {

				String opentabsagain = Keys.chord(Keys.CONTROL, Keys.ENTER);
				Thread.sleep(1000);
				driver.getWindowHandle();
				sociElement.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
				String linktext1 = sociElement.findElements(By.tagName("a")).get(i).getText();
				System.out.println(linktext1);

			}

			// For About Footer Links
			footerElement1.findElements(By.tagName("a")).size();

			for (int i = 0; i < footerElement1.findElements(By.tagName("a")).size(); i++) {

				String opentabsagain = Keys.chord(Keys.CONTROL, Keys.ENTER);
				Thread.sleep(1000);
				footerElement1.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
				String linktext2 = footerElement1.findElements(By.tagName("a")).get(i).getText();
				System.out.println(linktext2);
				
				
				
			
				
			}

			// For User + For Businesss Footer Links
			footerElement2.findElements(By.tagName("a")).size();

			for (int i = 0; i < footerElement2.findElements(By.tagName("a")).size(); i++) {

				String opentabsagain = Keys.chord(Keys.CONTROL, Keys.ENTER);
				Thread.sleep(1000);
				footerElement2.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
				String linktext3 = footerElement2.findElements(By.tagName("a")).get(i).getText();
				System.out.println(linktext3);

			}
		} catch (Exception e) {
			Set<String> counttabs = driver.getWindowHandles();
			Iterator<String> itrIterator = counttabs.iterator();
			while (itrIterator.hasNext()) {
				driver.switchTo().window(itrIterator.next());
			}
			System.out.println("Total OpenedTabs are:-" + counttabs.size());
		}

		return new IndexPage();

	}

	public boolean verify_Copyright() {

		System.out.println(copyrightElement.getText());
		return copyrightElement.isDisplayed();

	}

}
