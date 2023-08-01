package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;

	// we can create constructor of abstract class this is allowed in java
	public Page(WebDriver driver) {
		this.driver = driver;
		// this.wait = new WebDriverWait(this.driver, 15);

	}

	// abstract method ( without method boday)

	public abstract String getPageTitle();

	public abstract String getPageHeader(By locator);

	public abstract WebElement getElement(By locator);

	public abstract void waitElementPresent(By locator);

	public abstract void waitForPageTitle(String title);

	public <TPage extends BasePageA> TPage getInstance(Class<TPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;

		}

	}

}
