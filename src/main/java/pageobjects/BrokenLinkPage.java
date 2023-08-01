package pageobjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.BaseTest2;

public class BrokenLinkPage extends BaseTest2 {

	// page Objects
	public BrokenLinkPage() {

		PageFactory.initElements(driver, this);
	}

	// Actions
	public LoginPage brokenlinks() throws MalformedURLException, IOException {

		// Get the list of all the images
		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		// Stored the all the elements which are img tags also.
		linksList.addAll(driver.findElements(By.tagName("img")));

		// check all the links
		System.out.println("Size of Active links and images:-->" + linksList.size());

		// Web Element list which are active
		// 1. get the list of all the links and images :500
		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// 2. iterate linklist -- Exclude all the links/images which doesn't have any
		// attributes :450
		for (int i = 0; i < linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));

			if (linksList.get(i).getAttribute("href") != null
					&& (!linksList.get(i).getAttribute("href").contains("javascript"))) {

				activeLinks.add(linksList.get(i));

			}
		}
		// 3. Get the size of active links list:
		System.out.println("Size of Active links and images:-->" + activeLinks.size());

		// 3. check the href url with httpconnection api: -- check link is correct link
		// or not ?
		// 200- ok
		// 404- Not Found
		// 400- Bad Request
		// 500- internal error

		for (int j = 0; j < activeLinks.size(); j++) {
			// need to cast httpURLConnection class is available
			// Check href url is correct or not by openConnection method
			HttpURLConnection.setFollowRedirects(false);
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();

			String response = connection.getResponseMessage(); // if the link is fine it will return ok else getting
																// error.
			connection.disconnect(); // after that correct disconnect method
			System.out.println(activeLinks.get(j).getAttribute("href") + "--->" + response);

		}

		return new LoginPage();
	}

	public LoginPage brokenlinks1() throws IOException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<String> brokenLinks = new ArrayList<String>();
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.connect();
			int responseCode = connection.getResponseCode();
			if (responseCode >= 400) {
				brokenLinks.add(prop.getProperty("url"));
			}

			Assert.assertEquals(0, brokenLinks.size(), "Found " + brokenLinks.size() + " broken links");
		}
		return new LoginPage();
	}

}
