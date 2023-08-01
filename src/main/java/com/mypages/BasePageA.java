package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePageA extends Page {

	public BasePageA(WebDriver driver) {
		super(driver);

	}

	@Override
	public String getPageTitle() { // it will return driver.getTitle and it's string and @Override same method name
	     							// and same no of parameter signature

		return driver.getTitle();   
	}
	
	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {

		WebElement element = null;
		// Exception Error handlling
		try {
			waitElementPresent(locator);
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some Error Occurred while creating element" + locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some Exceptions or error occured while waiting for the element" + locator.toString());
		}
		}
		
	@Override
	public void waitForPageTitle(String title) {

		try {
			wait.until(ExpectedConditions.titleContains(title)); // dont use thread.sleep then this is useful
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some Exceptions or error occured while waiting for the element" + title.toString());
		}
	}

}
