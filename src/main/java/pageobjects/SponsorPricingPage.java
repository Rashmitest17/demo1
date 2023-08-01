package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest2;

public class SponsorPricingPage extends BaseTest2{

	//Page Object 
	
		@FindBy(xpath = "")
		WebElement boostyourprofilElement;
	
		@FindBy(xpath ="//div[contains(@class,'link-button getlisted-link')]")
		WebElement becomesponsorElement;
		
				
		
		// Initialization
		public SponsorPricingPage() {
			PageFactory.initElements(driver,this);
		}
	
			
		// Actions 
		public void sponserPricing() throws InterruptedException{
			
			boostyourprofilElement.click();
			Thread.sleep(2000);
			
			becomesponsorElement.click();
		}
		
		
		
	
}
