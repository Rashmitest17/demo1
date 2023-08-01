package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest2;
import pageobjects.FindServicesPageNew;
import pageobjects.IndexPageNew;

public class ServiceMenuPageTestNew extends BaseTest2 {

	IndexPageNew indexPageNew;
	FindServicesPageNew fServicesPageNew;

	public ServiceMenuPageTestNew() {

		super();

	}

	@Parameters("browser")
	@BeforeMethod
	public void setup() {
		initialization();
		indexPageNew = new IndexPageNew();

	}

	@Test
	public void verify_servicemenu() throws InterruptedException {

		fServicesPageNew = new FindServicesPageNew();
		fServicesPageNew.GFindServices_Menu();
	}


	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
