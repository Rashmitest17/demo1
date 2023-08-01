/**
 * 
 */
package com.mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePageA;
import com.mypages.LoginPageA;

/**
 * @author Rashmi
 *
 */
public class LoginTestA extends BaseTestA {

	@Test(priority = 1, enabled = true)
	public void verifyLoginPageTitleTest() {
		// Use generics

		String title = page.getInstance(LoginPageA.class).getLoginpageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "GoodFirms - B2B Reviews & Ratings you can trust");

	}

	@Test(priority = 2, enabled = true)
	public void verifyLoginPageHeaderTest() {
		// Use generics
		String Header = page.getInstance(HomePageA.class).getHomePageHeader();
		System.out.println(Header);
		Assert.assertEquals(Header, "Where you find the right company");
	}

	@Test(priority = 2, enabled = true)
	public void verifyLoginTest() throws InterruptedException {

		HomePageA homePageA = page.getInstance(LoginPageA.class).doLogin(prop.getProperty("username"),
				prop.getProperty("password"));
		// "orderhive2018@gmail.com", "mytest123");
		String headerhome = homePageA.getHomePageHeader();
		System.out.println(headerhome);

		Assert.assertEquals(headerhome, "Where you find the right company");

	}

	@Test(priority = 3, enabled = true)
	public void verify_Blank_doLoginTest() {

		page.getInstance(LoginPageA.class).doLogin();

	}

	@Test(priority = 5, enabled = true)
	public void verify_InvalidUsername_doLoginTest() throws InterruptedException {
		page.getInstance(LoginPageA.class).doLogin("username:abctest@gmail.com");

	}

	@Test(priority = 4, enabled = true)
	public void verify_doLogin_InvalidTest() throws InterruptedException {
		HomePageA homePageA = page.getInstance(LoginPageA.class).doLogin(prop.getProperty("uname"),
				prop.getProperty("passwordIn"));

	}

}
