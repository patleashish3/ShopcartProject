package com.shopcart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.base.TestBase;
import com.shopcart.pages.AdminLoginPage;
import com.shopcart.pages.DashboardPage;
import com.shopcart.pages.Marketing;

public class MarketingPageTestCases extends TestBase{
	AdminLoginPage adminLoginPage;
	DashboardPage dashboardPage;
	Marketing marketing;
	
	public MarketingPageTestCases() {
		super();
	}
	
	@BeforeMethod
	public void setEnv() {
		initialisation();
		adminLoginPage = new AdminLoginPage();
		dashboardPage = adminLoginPage.validEmail_Password(prop.getProperty("email"), prop.getProperty("password"));
		marketing = dashboardPage.clickOnMarketingLink();
	}
	
	@Test(priority = 1)
	public void verifyTitle() {
		String actual = marketing.verifyPageTitle();
		String expected = "Marketing • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 2)
	public void verifyPriceRulesMenuTest() {
		String actual = marketing.verifyPriceRulseMenu();
		String expected = "Price Rules";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 3)
	public void clickOnPriceRulesMenu() {
		marketing.clickOnPriceRulseMenu();
	}

	@Test(priority = 4)
	public void verifyMarketingsMenuTest() {
		String actual = marketing.verifyMarketingMenu();
		String expected = "Marketing";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 5)
	public void clickOnMarketingMenu() {
		marketing.clickOnMarketingMenu();
	}

	@Test(priority = 6)
	public void verifyMarketingPageTitleTest() {
		String actual =marketing.verifyMarketingPageTitle();
		String expected = "Marketing";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@Test(priority = 7)
	public void verifyListPanelHeadingTest() {
		String actual = marketing.verifyListPanelHeading();
		String expected = "MODULES LIST";
		Assert.assertEquals(actual, expected);
		log.info("Actual; " + actual);
		log.info("Expected; " + expected);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
