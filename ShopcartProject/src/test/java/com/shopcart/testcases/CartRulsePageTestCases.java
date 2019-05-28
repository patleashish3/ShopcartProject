package com.shopcart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shopcart.base.TestBase;
import com.shopcart.pages.AdminLoginPage;
import com.shopcart.pages.CartRulesPage;
import com.shopcart.pages.DashboardPage;
import com.shopcart.util.TestUtil;

public class CartRulsePageTestCases extends TestBase {
	
	AdminLoginPage adminLoginPage;
	DashboardPage dashboardPage;
	CartRulesPage cartRulesPage;
	
	public CartRulsePageTestCases() {
		super();
	}
	
	@BeforeMethod
	public void setEnv() {
		initialisation();
		adminLoginPage = new AdminLoginPage();
		dashboardPage = adminLoginPage.validEmail_Password(prop.getProperty("email"), prop.getProperty("password"));
		cartRulesPage = dashboardPage.clickOnPriceRulseLink();
	}
	
	@Test(priority=1)
	public void verifyPriceRulseMenuTextTest() {
		String actual = cartRulesPage.verifyPriceRulseMenuText();
	    String expected = "Price Rules";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
	}
	
	@Test(priority=2)
	public void clickOnPriceRulesMenu() {
		cartRulesPage.clickOnPriceRulseMenu();
	}
	
	@Test(priority=3)
	public void verifyCartRulseMenuTextTest() {
		String actual = cartRulesPage.verifyCartRulseMenuText();
	    String expected = "Cart Rules";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
	}
	
	@Test(priority=4)
	public void clickOnCartRulesMenu() {
		cartRulesPage.clickOnCartRulseMenu();
	}
	
	@Test(priority=5)
	public void verifyCartRulsePageTitleTest() {
		String actual = cartRulesPage.verifyCartRulsePageTitle();
	    String expected = "Cart Rules";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
	}
	
	@Test(priority=6)
	public void verifyAddNewCartIconTest() {
		boolean anIcon = cartRulesPage.verifyAddNewCartIcon();
		Assert.assertTrue(anIcon);
		log.info("Add new cart Icon displayed: "+anIcon);
	}
	
	@Test(priority=7)
	public void clickOnAddNewCartIconTest() {
		cartRulesPage.clickOnAddNewCartIcon();
	}
	
	@Test(priority=8)
	public void verifyAddNewCartTextTest() {
		String actual = cartRulesPage.verifyAddNewCartText();
	    String expected = "Add new cart rule";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
	}
	
	@Test(priority=9)
	public void verifyRecommendedModuleAndServicesIconTest() {
		boolean rIcon = cartRulesPage.verifyRecommendedModulesAndServicesIcon();
		Assert.assertTrue(rIcon);
		log.info("Add new cart Icon displayed: "+rIcon);
	}
	
	@Test(priority=10)
	public void clickOnRecommendedModuleAndServicesIconTest() {
		cartRulesPage.clickOnRecommendedModulesAndServicesIcon();
	}
	
	@Test(priority=11)
	public void verifyRecommendedModuleAndServicesTextTest() {
		String actual = cartRulesPage.verifyRecommendedModulesAndServicesText();
	    String expected = "Recommended Modules and Services";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
	}
	
	@Test(priority=12)
	public void verifyCartRulesPanelHeadingTextTest() {
		String actual = cartRulesPage.verifyCartRulesPanelHeadingText();
	    String expected = "CART RULSE 0";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
	}
	
	@Test(priority=13)
	public void verifyAddNewIcon() {
		boolean aIcon = cartRulesPage.verifyAddNewIcon();
		Assert.assertTrue(aIcon);
		log.info("Add new icon displyed: "+aIcon);
	}
	
	@Test(priority=14)
	public void clickOnAddNewIcon() {
		cartRulesPage.clickAddNewIcon();
	}
	
	@Test(priority=15)
	public void verifyRefreshIcon() {
		boolean rIcon = cartRulesPage.verifyRefreshIcon();
		Assert.assertTrue(rIcon);
		log.info("Refresh icon displyed: "+rIcon);
	}
	
	@Test(priority=16)
	public void clickOnRefreshIcon() {
		cartRulesPage.clickOnRefreshIcon();
	}
	
	@Test(priority=17)
	public void verifyTerminalIcon() {
		boolean tIcon = cartRulesPage.verifyTerminalIcon();
		Assert.assertTrue(tIcon);
		log.info("Terminal icon displyed: "+tIcon);
	}
	
	@Test(priority=18)
	public void clickOnTerminalIcon() {
		cartRulesPage.clickOnTerminalIcon();
	}
	
	@Test(priority=19)
	public void verifyDatbaseIcon() {
		boolean dIcon = cartRulesPage.verifyDatabaseIcon();
		Assert.assertTrue(dIcon);
		log.info("Database icon displyed: "+dIcon);
	}
	
	@Test(priority=20)
	public void clickOnDatabaseIcon() {
		cartRulesPage.clickOnDatabaseIcon();
	}
	
	@DataProvider
	public Object[][]getAddNewCartRuleData(){
		Object data [][]= TestUtil.getTestData("CartRule");
		return data;
	}
	
	@Test(priority=21, dataProvider = "getAddNewCartRuleData")
	public void AddNewCartRuleTest(String name, String description, String number) {
		cartRulesPage.AddNewCartRule(name, description, number);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}


