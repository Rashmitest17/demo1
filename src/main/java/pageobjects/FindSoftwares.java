package pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BaseTest2;

public class FindSoftwares extends BaseTest2 {

	// Page Factory
	@FindBy(xpath = "//*[@id=\"website-header\"]/div[2]/div/div/nav/ul/li[2]/button")
	WebElement softwaremenElement;

	@FindBy(css = "#software-category-menu > li:nth-child(4) > a")
	WebElement ecomcategoryElement;

	@FindBy(xpath = "//*[@id=\"software-category-menu\"]/li[2]/a")
	WebElement appdevsoftwarElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div/div/div[2]/div")
	WebElement sortbyElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div/div/div[2]/ul/li[3]/a")
	WebElement highestRatedelement;

	@FindBy(css = "#software-providers > div > div.directory-list > div")
	WebElement pagingationElement;

	@FindBy(xpath = "//*[@id=\"software-providers\"]/div/div[2]/div/ul/li[4]/a")
	WebElement page2Element;

	@FindBy(xpath = "/html/body/main/section[4]/div")
	WebElement relatedCategoriesElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[1]/button[1]")
	WebElement shoFilterElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[1]/button")
	WebElement popularFeaturElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[1]/ul")
	List<WebElement> popfeatureselects;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[2]/button")
	WebElement pricingModElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[2]/ul")
	List<WebElement> pricemodelselection;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[3]/button")
	WebElement devicesSupportedElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[3]/ul")
	List<WebElement> devicesupportselection;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[4]/button")
	WebElement deploymentElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[4]/ul/li[1]/label")
	List<WebElement> deploymentselection;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[5]/button")
	WebElement targercompanysizeElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[5]/ul/li[1]/label")
	List<WebElement> targetcompanysizeselection;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[2]/div[5]/ul")
	List<WebElement> targetcheckboxElements;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[1]/div[3]/button")
	WebElement applyElement;

	@FindBy(xpath = "//*[@id=\"filter\"]/div/div[2]/div[2]/a")
	WebElement clearfilterElement;

	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> checkboxes;

	// Initializing page objects
	public FindSoftwares() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public FindSoftwares findsoftwaremenu() throws InterruptedException {

		softwaremenElement.click();
		appdevsoftwarElement.click();
		// ecomcategoryElement.click();
		Thread.sleep(2000);
		return new FindSoftwares();

	}

	public FindSoftwares validateClickedsoftwarepageTitle() throws InterruptedException {
		softwaremenElement.click();
		ecomcategoryElement.click();
		System.out.println(driver.getTitle());
		return new FindSoftwares();

	}

	public FindSoftwares sortbysoftware() throws InterruptedException {
		softwaremenElement.click();
		ecomcategoryElement.click();
		sortbyElement.click();
		// Open and select Value
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN)).perform();

		Thread.sleep(1000);
		// Click on selected value
		highestRatedelement.click();
		Thread.sleep(1000);

		// Down Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

		// To view Pagaination section
		js.executeScript("arguments[0].scrollIntoView();", pagingationElement);
		Thread.sleep(1000);

		return new FindSoftwares();
	}

	public FindSoftwares softwarePagination() throws InterruptedException {
		softwaremenElement.click();
		ecomcategoryElement.click();
		sortbyElement.click();
		Thread.sleep(1000);

		// Down Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// For Scroll down:
		js.executeScript("window.scrollBy(0,250)");

		Thread.sleep(2000);
		// For Scroll up:
		js.executeScript("scroll(0, -250);");

		Thread.sleep(2000);
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", pagingationElement);

		Thread.sleep(1000);
		// Click on next page
		page2Element.click();

		// To view Pagaination section
		js.executeScript("arguments[0].scrollIntoView();", pagingationElement);
		Thread.sleep(1000);
		// To view scroll up again
		js.executeScript("scroll(0, -250);");
		Thread.sleep(1000);

		return new FindSoftwares();
	}

	public FindSoftwares relatedCategorylinks() throws InterruptedException {
		softwaremenElement.click();
		ecomcategoryElement.click();
		sortbyElement.click();

		// Open and select Value
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN)).perform();

		Thread.sleep(1000);
		// Click on selected value
		highestRatedelement.click();
		Thread.sleep(1000);

		// For Related Category Links to verify by click and open in new tabs....
		try {
			relatedCategoriesElement.findElements(By.tagName("a")).size();

			for (int i = 0; i < relatedCategoriesElement.findElements(By.tagName("a")).size(); i++) {

				String opentabsagain = Keys.chord(Keys.CONTROL, Keys.ENTER);
				Thread.sleep(1000);
				relatedCategoriesElement.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
				String linktext3 = relatedCategoriesElement.findElements(By.tagName("a")).get(i).getText();
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

		return new FindSoftwares();
	}

	public FindSoftwares verify_FindSoftwareByFilter() throws InterruptedException {

		shoFilterElement.click();
		Thread.sleep(1000);
		popularFeaturElement.click();
		Thread.sleep(1000);
		pricingModElement.click();
		Thread.sleep(1000);
		devicesSupportedElement.click();
		Thread.sleep(1000);
		deploymentElement.click();
		Thread.sleep(1000);
		targercompanysizeElement.click();
		Thread.sleep(1000);

		applyElement.click();
		Thread.sleep(1000);

		return new FindSoftwares();

	}

	public FindSoftwares verify_PopularFeaturescheck() throws InterruptedException {

		// Check popularFeaturElement selection
		shoFilterElement.click();
		Thread.sleep(1000);

		popularFeaturElement.click();
		Thread.sleep(1000);

		System.out.println(popfeatureselects.size());

		for (WebElement checkbox : popfeatureselects) {
			if (!checkbox.isSelected()) {
				checkbox.click();

				Thread.sleep(2000);
			}
		}

		Thread.sleep(2000);
		applyElement.click();
		Thread.sleep(3000);

		clearfilterElement.click();
		Thread.sleep(3000);
		return new FindSoftwares();

	}

	public FindSoftwares verify_PriceModelSelection() throws InterruptedException {

		// Check pricemodelselection

		shoFilterElement.click();
		Thread.sleep(1000);

		popularFeaturElement.click();
		Thread.sleep(1000);

		System.out.println(popfeatureselects.size());

		for (WebElement checkbox : popfeatureselects) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(2000);

			}
		}

		pricingModElement.click();
		Thread.sleep(1000);

		System.out.println(pricemodelselection.size());

		for (WebElement checkbox : pricemodelselection) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(2000);
			}
		}

		Thread.sleep(2000);
		applyElement.click();
		Thread.sleep(3000);

		clearfilterElement.click();
		Thread.sleep(3000);
		return new FindSoftwares();
	}

	public FindSoftwares verify_devicesupportselection() throws InterruptedException {

		// Check devicesupportselection
		shoFilterElement.click();
		Thread.sleep(1000);

		popularFeaturElement.click();
		Thread.sleep(1000);

		System.out.println(popfeatureselects.size());

		for (WebElement checkbox : popfeatureselects) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(2000);
			}
		}

		devicesSupportedElement.click();
		Thread.sleep(1000);

		System.out.println(devicesupportselection.size());

		for (WebElement checkbox : devicesupportselection) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(3000);
			}
		}

		Thread.sleep(2000);
		applyElement.click();
		Thread.sleep(5000);

		clearfilterElement.click();
		Thread.sleep(5000);

		return new FindSoftwares();
	}

	public FindSoftwares verify_deploymentselection() throws InterruptedException {
		shoFilterElement.click();
		Thread.sleep(1000);

		devicesSupportedElement.click();
		Thread.sleep(1000);

		System.out.println(devicesupportselection.size());

		for (WebElement checkbox : devicesupportselection) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(3000);
			}
		}

		pricingModElement.click();
		Thread.sleep(1000);

		System.out.println(pricemodelselection.size());

		for (WebElement checkbox : pricemodelselection) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(2000);
			}
		}

		deploymentElement.click();
		Thread.sleep(1000);

		System.out.println(deploymentselection.size());

		for (WebElement checkbox : deploymentselection) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(3000);
			}
		}

		Thread.sleep(2000);
		applyElement.click();
		Thread.sleep(5000);

		clearfilterElement.click();
		Thread.sleep(5000);

		return new FindSoftwares();
	}

	public FindSoftwares verify_targetcompanysizeselection() throws InterruptedException {
		shoFilterElement.click();
		Thread.sleep(1000);

		deploymentElement.click();
		Thread.sleep(1000);

		System.out.println(deploymentselection.size());

		for (WebElement checkbox : deploymentselection) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(3000);
			}
		}

		targercompanysizeElement.click();
		Thread.sleep(1000);

		System.out.println(targetcompanysizeselection.size());

		for (WebElement checkbox : targetcompanysizeselection) {
			if (!checkbox.isSelected()) {
				checkbox.click();
				Thread.sleep(3000);
			}
		}

		Thread.sleep(2000);
		applyElement.click();
		Thread.sleep(5000);

		// Scroll Down Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		js.executeScript("window.scrollBy(0,250)");

		clearfilterElement.click();
		Thread.sleep(5000);

		return new FindSoftwares();
	}

	public FindSoftwares Extra_selectCheckbox(String checkbox1, String checkbox2) throws InterruptedException {
		shoFilterElement.click();
		Thread.sleep(1000);

		targercompanysizeElement.click();

		List<WebElement> checkboxList = checkboxes;
		List<WebElement> string = checkboxList;
		System.out.println(string);

		for (WebElement checkbox : checkboxList) {
			if (checkbox.getAttribute("value").equals(checkbox1) || checkbox.getAttribute("value").equals(checkbox2)) {
				checkbox.click();

			}
		}
		return new FindSoftwares();

	}

}
