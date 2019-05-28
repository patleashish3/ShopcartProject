package com.shopcart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.base.TestBase;
import com.shopcart.pages.AdminLoginPage;
import com.shopcart.pages.CartRulesPage;
import com.shopcart.pages.CatalogPriceRulesPage;
import com.shopcart.pages.DashboardPage;

public class CatalogPriceRulesTestCases extends TestBase {
	AdminLoginPage adminLoginPage;
	DashboardPage dashboardPage;
	CartRulesPage cartRulesPage;
	CatalogPriceRulesPage catalogPriceRulesPage;

	public CatalogPriceRulesTestCases() {
		super();
	}

	@BeforeMethod
	public void setEnv() {
		initialisation();
		adminLoginPage = new AdminLoginPage();
		dashboardPage = adminLoginPage.validEmail_Password(prop.getProperty("email"), prop.getProperty("password"));
		catalogPriceRulesPage = dashboardPage.clickOnCatalogPriceRulesLink();
	}

	@Test(priority = 1)
	public void verifyTitle() {
		String actual = catalogPriceRulesPage.verifyPageTitle();
		String expected = "Catalog Price Rules • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 2)
	public void verifyPriceRulesMenuTest() {
		String actual = catalogPriceRulesPage.verifyPriceRulseMenu();
		String expected = "Price Rules";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 3)
	public void clickOnPriceRulesMenu() {
		catalogPriceRulesPage.clickOnPriceRulseMenu();
	}

	@Test(priority = 4)
	public void verifyCatalogPriceRulesMenuTest() {
		String actual = catalogPriceRulesPage.verifyCatalogPriceRulseMenu();
		String expected = "Catalog Price Rules";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 5)
	public void clickOnCatalogPriceRulesMenu() {
		catalogPriceRulesPage.clickOnPriceRulseMenu();
	}

	@Test(priority = 6)
	public void verifyCatalogPriceRulesPageTitleTest() {
		String actual = catalogPriceRulesPage.verifyCatalogPriceRulsePageTitle();
		String expected = "Catalog Price Rules";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 7)
	public void verifyCatalogPriceRulesPanelHeadingTest() {
		String actual = catalogPriceRulesPage.verifyCatalogPriceRulsePanelHeading();
		String expected = "CATALOG PRICE RULES 0";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
