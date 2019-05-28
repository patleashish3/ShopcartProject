package com.shopcart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.base.TestBase;
import com.shopcart.pages.AdminLoginPage;
import com.shopcart.pages.DashboardPage;
import com.shopcart.pages.Shipping_PreferencesPage;

public class Shipping_PreferencesPageTestCases extends TestBase {
	AdminLoginPage adminLoginPage;
	DashboardPage dashboardPage;
	Shipping_PreferencesPage shipping_PreferencesPage;
	
	public Shipping_PreferencesPageTestCases() {
		super();
	}
	
	@BeforeMethod
	public void setEnv() {
		initialisation();
		adminLoginPage = new AdminLoginPage();
		dashboardPage = adminLoginPage.validEmail_Password(prop.getProperty("email"), prop.getProperty("password"));
		shipping_PreferencesPage = dashboardPage.clickOnShipping_PrefencesLink();
	}
	
	@Test(priority = 1)
	public void verifyTitle() {
		String actual = shipping_PreferencesPage.verifyPageTitle();
		String expected = "Preferences • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 2)
	public void verifyShippingMenuTest() {
		String actual = shipping_PreferencesPage.verifyShippingeMenu();
		String expected = "Shipping";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 3)
	public void clickOnShippingMenu() {
		shipping_PreferencesPage.clickOnShippingMenu();
	}

	@Test(priority = 4)
	public void verifyPreferencesMenuTest() {
		String actual = shipping_PreferencesPage.verifyPreferencesMenu();
		String expected = "";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 5)
	public void clickOnPreferencesMenu() {
		shipping_PreferencesPage.clickOnPreferencesMenu();		
	}

	@Test(priority = 6)
	public void verifyPreferencesPageTitleTest() {
		String actual = shipping_PreferencesPage.verifyPreferencesPageTitle();
		String expected = "Preferences";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 7)
	public void verifyHandlingPanelHeadingTest() {
		String actual = shipping_PreferencesPage.verifyHandlingPanelHeading();
		String expected = "HANDLING";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
