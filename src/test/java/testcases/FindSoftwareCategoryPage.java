package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.FindSoftwares;
import pageobjects.IndexPage;

public class FindSoftwareCategoryPage extends BaseTest2 {

	Logger logger = LogManager.getLogger(FindSoftwareCategoryPage.class);
	
	IndexPage indexPage;
	FindSoftwares findSoftwares;

	public FindSoftwareCategoryPage() {
		super();
	}

	@BeforeMethod
	public void load() {
		initialization();
		indexPage = new IndexPage();
		findSoftwares = new FindSoftwares();

	}

	@Test(priority = 1, enabled = true)
	public void verify_FindSoftwareMenuTest() throws InterruptedException {
		// Verify Click on software Menus

		findSoftwares.findsoftwaremenu();
		Thread.sleep(2000);

	}

	@Test(priority = 2, enabled = true)
	public void validate_SoftwarePageTitleTest() throws InterruptedException {
		// To Verify the Clickable page Title
		findSoftwares.validateClickedsoftwarepageTitle();

	}

	@Test(priority = 3, enabled = true)
	public void verify_SORTBy_SoftwareTest() throws InterruptedException {

		// To Verify Menu then click on Sort By Software Sponsored ,Most Reviews and
		// Highest Rated Selection.
		findSoftwares.findsoftwaremenu();
		findSoftwares.sortbysoftware();
	}

	@Test(priority = 4, enabled = true)
	public void verify_SoftwareCategory_PaginationTest() throws InterruptedException {
		// Verify Software menu and software listing page with pagination.
		findSoftwares.findsoftwaremenu();
		findSoftwares.softwarePagination();

	}

	@Test(priority = 5, enabled = true)
	public void verify_SoftwareRelatedCategoryTest() throws InterruptedException {

		// Verify Related Category Test -- Open All links in multiple tabs open and close test scenario
		System.out.println(" verify_SoftwareRelatedCategoryTest == Find Software + Sort By + Pagination + Related Category links");
		findSoftwares.findsoftwaremenu();
		findSoftwares.relatedCategorylinks();
	}

	@Test(priority = 6, enabled = true)
	public void verify_FindSoftwareByFilter() throws InterruptedException {

		findSoftwares.findsoftwaremenu();
		findSoftwares.verify_FindSoftwareByFilter();
		findSoftwares.verify_PopularFeaturescheck();
		findSoftwares.verify_PriceModelSelection();
		findSoftwares.verify_devicesupportselection();
		findSoftwares.verify_deploymentselection();
		findSoftwares.verify_targetcompanysizeselection();
	}

	@Test(priority = 7, enabled = true)
	public void verify_FilterByPopularFeaturescheck() throws InterruptedException {
		findSoftwares.findsoftwaremenu();
		findSoftwares.findsoftwaremenu();
	}

	@Test(priority = 8, enabled = true)
	public void verify_FilterByPriceModelSelection() throws InterruptedException {
		findSoftwares.findsoftwaremenu();
		findSoftwares.verify_PriceModelSelection();
	}

	@Test(priority = 9, enabled = true)
	public void verify_FilterByDevicesupportselection() throws InterruptedException {
		findSoftwares.findsoftwaremenu();
		findSoftwares.verify_devicesupportselection();		
		
	}

	@Test(priority = 10, enabled = true)
	public void verify_FilterByDeploymentselection() throws InterruptedException {
		findSoftwares.findsoftwaremenu();
		findSoftwares.verify_deploymentselection();
		
	}

	@Test(priority = 11, enabled = true)
	public void verify_FilterByTargetcompanysizeselection() throws InterruptedException {
		findSoftwares.findsoftwaremenu();
		findSoftwares.verify_targetcompanysizeselection();
	}

	@Test(priority = 12, enabled = true)
	public void verify_FilterByExtra_selectCheckbox() throws InterruptedException {
		// This is not working
		findSoftwares.findsoftwaremenu();
		findSoftwares.Extra_selectCheckbox("checkbox1", "checkbox2");
	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

	
}
