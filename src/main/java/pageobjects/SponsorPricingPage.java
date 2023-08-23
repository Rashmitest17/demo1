package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;

public class SponsorPricingPage extends BaseTest2{

	//Page Object 
		
	
		@FindBy( linkText = "Boost Your Profile")
		WebElement footerlinkboostyourprofilElement;
		
		@FindBy(xpath ="//h4[normalize-space()='Boost Your Profile']")
		WebElement boostyourprofilElement;
	
		//@FindBy(xpath ="//div[contains(@class,'link-button getlisted-link')]")
		//WebElement becomesponsorElement;
		
		
		@FindBy(linkText = "Boost Your Profile")
		WebElement becomeaSponsorbuttonElement;
		
			
		
		// Initialization
		public SponsorPricingPage() {
			PageFactory.initElements(driver,this);
		}
	
			
		// Actions 
		public IndexPage sponserPricing() throws InterruptedException{
			
			Thread.sleep(2000);
			footerlinkboostyourprofilElement.click();
			
			//To Click on Boost Your Profile
			boostyourprofilElement.click();
			Thread.sleep(2000);
			//To click on Become a Sponsor button 
			becomeaSponsorbuttonElement.click();
			
			return new IndexPage();
			
		}
		
		
		
	
}
