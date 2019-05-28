package com.shopcart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.base.TestBase;
import com.shopcart.pages.AdminLoginPage;
import com.shopcart.pages.DashboardPage;
import com.shopcart.pages.Shipping_CarriersPage;

public class Shipping_CarriersPageTestCases extends TestBase {
	AdminLoginPage adminLoginPage;
	DashboardPage dashboardPage;
	Shipping_CarriersPage shipping_CarriersPage;
	
	public Shipping_CarriersPageTestCases() {
		super();
	}
	
	@BeforeMethod
	public void setEnv() {
		initialisation();
		adminLoginPage = new AdminLoginPage();
		dashboardPage = adminLoginPage.validEmail_Password(prop.getProperty("email"), prop.getProperty("password"));
		shipping_CarriersPage = dashboardPage.clickOnShipping_CarriersLink();
	}
	
	@Test(priority = 1)
	public void verifyTitle() {
		String actual = shipping_CarriersPage.verifyPageTitle();
		String expected = "Carriers • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 2)
	public void verifyShippingMenuTest() {
		String actual = shipping_CarriersPage.verifyShippingeMenu();
		String expected = "Shipping";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 3)
	public void clickOnShippingMenu() {
		shipping_CarriersPage.clickOnShippingMenu();
	}

	@Test(priority = 4)
	public void verifyCarriersMenuTest() {
		String actual = shipping_CarriersPage.verifyCarriersMenu();
		String expected = "";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 5)
	public void clickOnCarriersMenu() {
		shipping_CarriersPage.clickOnCarriersMenu();
	}

	@Test(priority = 6)
	public void verifyCarriersPageTitleTest() {
		String actual = shipping_CarriersPage.verifyCarriersPageTitle();
		String expected = "";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 7)
	public void verifyCarriersPanelHeadingTest() {
		String actual = shipping_CarriersPage.verifyCarriersPanelHeading();
		String expected = "";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
