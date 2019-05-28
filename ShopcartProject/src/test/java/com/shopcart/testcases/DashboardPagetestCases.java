package com.shopcart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.base.TestBase;
import com.shopcart.pages.AdminLoginPage;
import com.shopcart.pages.DashboardPage;

public class DashboardPagetestCases extends TestBase {
	AdminLoginPage adminLoginPage;
	DashboardPage dashboardPage;

	public DashboardPagetestCases() {
		super();
	}

	@BeforeMethod
	public void setEnv() {
		initialisation();
		adminLoginPage = new AdminLoginPage();
		dashboardPage = adminLoginPage.validEmail_Password(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void verifyDashboardTitleTest() {
		String actual = dashboardPage.verifyDashboardTitle();
		String expected = "Dashboard • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 2)
	public void verifyPrestashopHeaderLogoTest() {
		boolean logo = dashboardPage.verifyPrestashopHeaderLogo();
		Assert.assertTrue(logo);
		log.info("Logo displayed: " + logo);
	}

	@Test(priority = 3)
	public void verifyShopcartHeaderNameTest() {
		String actual = dashboardPage.verifyShopcartHeaderName();
		String expected = "ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 4)
	public void verifyShoppingCartIconTest() {
		boolean sIcon = dashboardPage.verifyShoppingCartIcon();
		Assert.assertTrue(sIcon);
		log.info("Shopping cart Icon display: " + sIcon);
	}

	@Test(priority = 5)
	public void clickOnShoppingCartIconTest() {
		dashboardPage.clickOnShoppingCartIcon();
	}

	@Test(priority = 6)
	public void verifyUserIconTest() {
		boolean uIcon = dashboardPage.verifyUserIcon();
		log.info("Usert Icon display: " + uIcon);
	}

	@Test(priority = 7)
	public void clickOnUserIconTest() {
		dashboardPage.clickOnUserIcon();
	}

	@Test(priority = 8)
	public void verifyEnvelopeIconTest() {
		boolean eIcon = dashboardPage.verifyEnvelopeIcon();
		Assert.assertTrue(eIcon);
		log.info("Envelope Icon display: " + eIcon);
	}

	@Test(priority = 9)
	public void clickOnEnvelopeIconTest() {
		dashboardPage.clickOnEnvelopeIcon();
	}

	@Test(priority = 10)
	public void verifyCupLogoTest() {
		boolean cLogo = dashboardPage.verifyCupLogo();
		Assert.assertTrue(cLogo);
		log.info("Cup Logo is displayed:" + cLogo);
	}

	@Test(priority = 11)
	public void verifyQuickAccessLinkTextTest() {
		String actual = dashboardPage.verifyQuickAccessLinkText();
		String expected = "Quick Access";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 12)
	public void clickOnQuickAccessLinkTest() {
		dashboardPage.clickOnQuickAccessLink();
	}

	@Test(priority = 13)
	public void verifyConnectToPrestashopLinkTextTest() {
		String actual = dashboardPage.verifyConnectToPestashopLinkText();
		String expected = "Connect to PrestaShop Marketplace account";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 14)
	public void clickOnConnectToPrestashopLinkTest() {
		dashboardPage.clickOnConnectToPrestashopLink();
	}

	@Test(priority = 15)
	public void verifyShopLinkTextTest() {
		String actual = dashboardPage.verifyShopLinkText();
		String expected = "My shop";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 16)
	public void clickOnShopLinkTest() {
		dashboardPage.clickOnShoplink();
	}

	@Test(priority = 17)
	public void verifySystemAdministratorTextTest() {
		String actual = dashboardPage.verifySystemAdministratorText();
		String expected = "System Administrator";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 18)
	public void verifyDropDownMenuTest() {
		boolean ddMenu = dashboardPage.verifyDropDownMenu();
		Assert.assertTrue(ddMenu);
		log.info("Dropdown Menu diplayed: " + ddMenu);
	}

	@Test(priority = 19)
	public void clickOnDropDownMenuTest() {
		dashboardPage.clickOnDropDownMenu();
	}

	@Test(priority = 20)
	public void verifyEmployeeImageTest() {
		boolean eImg = dashboardPage.verifyemployeeImage();
		Assert.assertTrue(eImg);
		log.info("employee Image displayed: " + eImg);
	}

	@Test(priority = 21)
	public void clickOnEmployeeImageTest() {
		dashboardPage.clickOnEmployeeImage();
	}

	@Test(priority = 22)
	public void verifySearchIconTest() {
		boolean sIcon = dashboardPage.verifySearchIcon();
		Assert.assertTrue(sIcon);
		log.info("Search Icon displayed: " + sIcon);
	}

	@Test(priority = 23)
	public void verifySearchdropDownIconTest() {
		boolean sdIcon = dashboardPage.verifySearchDropDownIcon();
		Assert.assertTrue(sdIcon);
		log.info("Search Drop Down Icon displayed: " + sdIcon);
	}

	@Test(priority = 24)
	public void clickOnDropDownIconTest() {
		dashboardPage.clickOnSearchDropDownButton();
	}

	@Test(priority = 25)
	public void verifySearchBoxTest() {
		boolean sBox = dashboardPage.verifySearchbox();
		Assert.assertTrue(sBox);
		log.info("Search Box is displayed: " + sBox);
	}

	@Test(priority = 26)
	public void verifySearchBoxPlaceHolderTest() {
		String actual = dashboardPage.verifySearchBoxPlaceholder();
		String expected = "Search";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 27)
	public void verifySmallNamedashboardTextTest() {
		String actual = dashboardPage.verifySmallNameDashboardText();
		String expected = "Dashboard";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 28)
	public void verifyPageTitleTest() {
		String actual = dashboardPage.verifyPageTitle();
		String expected = "Dashboard";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 29)
	public void verifyToggleButtonTest() {
		boolean tButton = dashboardPage.verifyToggleButton();
		Assert.assertTrue(tButton);
		log.info("Search Icon displayed: " + tButton);
	}

	@Test(priority = 30)
	public void clickOnToggleBitton() {
		dashboardPage.clickOnToggleButton();
		log.info("Button is enable");
	}

	@Test(priority = 31)
	public void verifyDemoModetoggleButtonTest() {
		String actual = dashboardPage.verifyDemoModeToggleButton();
		String expected = "Demo mode";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 32)
	public void verifyHelpIconTest() {
		boolean help = dashboardPage.verifyHelpIcon();
		Assert.assertTrue(help);
		log.info("Help icon displayed: " + help);
	}

	@Test(priority = 33)
	public void clickOnHelpIconTest() {
		dashboardPage.clickOnHelpIcon();
	}

	@Test(priority = 34)
	public void verifyHelpRextTest() {
		String actual = dashboardPage.verifyHelpText();
		String expected = "Help";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 35)
	public void verifyAdminDashboardIconTest() {
		boolean adIcon = dashboardPage.verifyAdminDashboardIcon();
		Assert.assertTrue(adIcon);
		log.info("Dashboard icon displayed: " + adIcon);
	}

	@Test(priority = 36)
	public void verifyDashboardLinkTest() {
		String actual = dashboardPage.verifyDashboardLink();
		String expected = "Dashboard";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 37)
	public void verifyCatalogIconTest() {
		boolean cIcon = dashboardPage.verifyCatalogIcon();
		Assert.assertTrue(cIcon);
		log.info("Catalog icon displayed: " + cIcon);
	}

	@Test(priority = 38)
	public void verifyCatalogLinkTextTest() {
		String actual = dashboardPage.verifyCatalogLinkText();
		String expected = "Catalog";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 39)
	public void clickOnCatalogLinkTest() {
		dashboardPage.clickOnCatalogLink();
	}

	@Test(priority = 40)
	public void verifyOrdersIconTest() {
		boolean oIcon = dashboardPage.verifyOrdersIcon();
		Assert.assertTrue(oIcon);
		log.info("Orders icon displayed: " + oIcon);
	}

	@Test(priority = 41)
	public void verifyOrdersLinkTextTest() {
		String actual = dashboardPage.verifyOrdersLinkText();
		String expected = "Orders";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 42)
	public void clickOnOrdersLinkTest() {
		dashboardPage.clickOnOrdersLink();
	}

	@Test(priority = 43)
	public void verifyCustomersTest() {
		boolean cIcon = dashboardPage.verifyCustomersIcon();
		Assert.assertTrue(cIcon);
		log.info("Customers icon displayed: " + cIcon);
	}

	@Test(priority = 44)
	public void verifyCustomersLinkTextTest() {
		String actual = dashboardPage.verifyCustomersLinkText();
		String expected = "Customers";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 45)
	public void clickOnCustomersLinkTest() {
		dashboardPage.clickOnCustomersLink();
	}

	@Test(priority = 46)
	public void verifyPriceRulesIconTest() {
		boolean prIcon = dashboardPage.verifyPriceRulseIcon();
		Assert.assertTrue(prIcon);
		log.info("Price Rules icon displayed: " + prIcon);
	}

	@Test(priority = 47)
	public void verifyPriceRulesLinkTextTest() {
		String actual = dashboardPage.verifyPriceRulseLinkText();
		String expected = "Price Rules";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 48)
	public void clickOnPriceRulesLinkTest() {
		dashboardPage.clickOnCatalogLink();
	}

	@Test(priority = 49)
	public void verifyModulesandServicesIconTest() {
		boolean msIcon = dashboardPage.verifyModulesAndServicesIcon();
		Assert.assertTrue(msIcon);
		log.info("Modules&Services icon displayed: " + msIcon);
	}

	@Test(priority = 50)
	public void verifyModulesAndServicesLinkTextTest() {
		String actual = dashboardPage.verifyModulesAndServicesLinkText();
		String expected = "Modules and Services";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 51)
	public void clickOnModulesAndServicesLinkTest() {
		dashboardPage.clickOnModulesAndServicesLink();
	}

	@Test(priority = 52)
	public void verifyShippingIconTest() {
		boolean sIcon = dashboardPage.verifyShippingIcon();
		Assert.assertTrue(sIcon);
		log.info("Shipping icon displayed: " + sIcon);
	}

	@Test(priority = 53)
	public void verifyShippingLinkTextTest() {
		String actual = dashboardPage.verifyShippingLinkText();
		String expected = "Shipping";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 54)
	public void clickOnShippingLinkTest() {
		dashboardPage.clickOnShippingLink();
	}

	@Test(priority = 55)
	public void verifyLocalizationIconTest() {
		boolean lIcon = dashboardPage.verifyLocalizationIcon();
		Assert.assertTrue(lIcon);
		log.info("Localization icon displayed: " + lIcon);
	}

	@Test(priority = 56)
	public void verifyLocalizationLinkTextTest() {
		String actual = dashboardPage.verifyLocalizationLinkText();
		String expected = "Localization";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 57)
	public void clickOnLocalizationLinkTest() {
		dashboardPage.clickOnLocalizationLink();
	}

	@Test(priority = 58)
	public void verifyPreferencesIconTest() {
		boolean pIcon = dashboardPage.verifyPreferencesIcon();
		Assert.assertTrue(pIcon);
		log.info("Preferences icon displayed: " + pIcon);
	}

	@Test(priority = 59)
	public void verifyPreferencesLinkTextTest() {
		String actual = dashboardPage.verifyPreferencesLinkText();
		String expected = "Preferences";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 60)
	public void clickOnPreferencesLinkTest() {
		dashboardPage.clickOnPreferencesLink();
	}

	@Test(priority = 61)
	public void verifyAdvancedParametersIconTest() {
		boolean apIcon = dashboardPage.verifyAdvancedParametersIcon();
		Assert.assertTrue(apIcon);
		log.info("Advanced Parameters icon displayed: " + apIcon);
	}

	@Test(priority = 62)
	public void verifyAdvancedParametersLinkTextTest() {
		String actual = dashboardPage.verifyAdvancedParametersLinkText();
		String expected = "Advanced Parameters";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 63)
	public void clickOnAdvancedParametersLinkTest() {
		dashboardPage.clickOnAdvancedParametersLink();
	}

	@Test(priority = 64)
	public void verifyAdministrationIconTest() {
		boolean aIcon = dashboardPage.verifyAdministrationIcon();
		Assert.assertTrue(aIcon);
		log.info("Administration icon displayed: " + aIcon);
	}

	@Test(priority = 65)
	public void verifyAdministrationLinkTextTest() {
		String actual = dashboardPage.verifyAdministrationLinkText();
		String expected = "Administration";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 66)
	public void clickOnAdministrationLinkTest() {
		dashboardPage.clickOnAdministrationLink();
	}

	@Test(priority = 67)
	public void verifyStatsIconTest() {
		boolean sIcon = dashboardPage.verifyStatsIcon();
		Assert.assertTrue(sIcon);
		log.info("Stats icon displayed: " + sIcon);
	}

	@Test(priority = 68)
	public void verifyStatsLinkTextTest() {
		String actual = dashboardPage.verifyStatsLinkText();
		String expected = "Stats";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
	}

	@Test(priority = 69)
	public void clickOnStatsLinkTest() {
		dashboardPage.clickOnstatsLink();
	}

	@Test(priority = 70)
	public void verifyAlignIconTest() {
		boolean aIcon = dashboardPage.verifyAlignIcon();
		Assert.assertTrue(aIcon);
		log.info("Align icon displayed: " + aIcon);
	}

	@Test(priority = 71)
	public void clickOnAlignIconTest() {
		dashboardPage.clickOnAlignIcon();
	}
	
	@Test(priority=72)
	public void clickOnCatalogPriceRulesLinkTest() {
		dashboardPage.clickOnCatalogPriceRulesLink();
	}
	
	@Test(priority=73)
	public void clickOnMarketigLinkTest() {
		dashboardPage.clickOnMarketingLink();
	}
	
	@Test(priority=74)
	public void clickOnShipping_CarriersLinkTest() {
		dashboardPage.clickOnShipping_CarriersLink();
	}
	
	@Test(priority=75)
	public void clickOnShipping_PreferencesLinkTest() {
		dashboardPage.clickOnShipping_PrefencesLink();
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
