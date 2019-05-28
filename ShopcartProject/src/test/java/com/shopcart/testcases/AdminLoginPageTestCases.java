package com.shopcart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.base.TestBase;
import com.shopcart.pages.AdminLoginPage;
import com.shopcart.pages.DashboardPage;

public class AdminLoginPageTestCases extends TestBase {
	AdminLoginPage adminLogInPage;
	DashboardPage dashboard;

	@BeforeMethod
	public void setEnv() {
		initialisation();
		adminLogInPage = new AdminLoginPage();
	}

	@Test(priority = 1)
	public void verifyPageTitleTest() {
		String actual = adminLogInPage.verifyPageTitle();
		String expected = "ShopCartt > Administration panel (PrestaShop™)";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
		log.info("=============================================");
	}

	@Test(priority = 2)
	public void verifyPrestaShopNameLogoTest() {
		boolean logo = adminLogInPage.verifyPrestaShopNameLogo();
		Assert.assertTrue(logo);
		log.info(logo);
		log.info("==============================================");
	}

	@Test(priority = 3)
	public void verifyVersionTextTest() {
		String actual = adminLogInPage.verifyVersionText();
		String expected = "1.6.1.23";
		Assert.assertEquals(actual, expected);
		log.info("Actual: " + actual);
		log.info("Expected: " + expected);
		log.info("===============================================");
	}

	@Test(priority = 4)
	public void verifyPrestaShopImageLogoTest() {
		boolean imgLogo = adminLogInPage.verifyPrestaShopImageLogo();
		Assert.assertTrue(imgLogo);
		log.info(imgLogo);
		log.info("================================================");
	}
	
	@Test(priority = 5)
	public void verifyShopcartTextTest() {
		String actual = adminLogInPage.verifyShopcartText();
		String expected = "ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("=================================================");
	}
	
	@Test(priority = 6)
	public void verifyEmailAdderessLabelTest() {
		String actual = adminLogInPage.verifyEmailAddressLabel();
		String expected = "Email address";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("==================================================");
	}
	
	@Test(priority = 7)
	public void verifyPasswordAdderessLabelTest() {
		String actual = adminLogInPage.verifyPasswordAddressLabel();
		String expected = "Password";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("===================================================");
	}
	
	@Test(priority = 8)
	public void verifyStayLoggedInTextTest() {
		String actual = adminLogInPage.verifyStayLoggedInText();
		String expected = "Stay logged in";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("===================================================");
	}
	
	@Test(priority = 9)
	public void clickOnStayLoggedInButtonTest() {
		adminLogInPage.clickOnStayLoggedInButton();
		log.info("===================================================");
	}
	
	@Test(priority = 10)
	public void verifyForgotPasswordTextTest() {
		String actual = adminLogInPage.verifyForgotPasswordText();
		String expected = "I forgot my password";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("===================================================");
	}
	
	@Test(priority = 11)
	public void clickOnForgotPasswordButtonTest() {
		adminLogInPage.clickOnForgotPasswordButton();
		log.info("===================================================");
	}
	
	@Test(priority = 12)
	public void verifyUrlRightLinktextTest() {
		String actual = adminLogInPage.verifyUrlRightLinkText();
		String expected = "© PrestaShop™ 2007-2019 - All rights reserved";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("===================================================");
	}
	
	@Test(priority = 13)
	public void clickOnUrlRightLink() {
		adminLogInPage.clickOnUrlRightLink();
		log.info("===================================================");
	}
	
	@Test(priority = 14)
	public void verifyTwitterIconLinkTest() {
		boolean tLogo = adminLogInPage.verifyTwitterIconLink();
		Assert.assertTrue(tLogo);
		log.info(tLogo);
		log.info("===================================================");
	}
	
	@Test(priority = 15)
	public void clickOnTwitterIconLinkTest() {
		adminLogInPage.clickOnTwitterIconLink();
		log.info("====================================================");
	}
	
	@Test(priority = 16)
	public void verifyFacebookIconLinkTest() {
		boolean fLogo = adminLogInPage.verifyFacebookIconLink();
		Assert.assertTrue(fLogo);
		log.info(fLogo);
		log.info("===================================================");
	}
	
	@Test(priority = 17)
	public void clickOnFacebookIconLinkTest() {
		adminLogInPage.clickOnFacebookIconLink();
		log.info("====================================================");
	}
	
	@Test(priority = 18)
	public void verifyGithubIconLinkTest() {
		boolean gLogo = adminLogInPage.verifyGithubIconLink();
		Assert.assertTrue(gLogo);
		log.info(gLogo);
		log.info("===================================================");
	}
	
	@Test(priority = 19)
	public void clickOnGithubIconLinkTest() {
		adminLogInPage.clickOnGithubIconLink();
		log.info("====================================================");
	}
	
	@Test(priority = 20)
	public void verifyGooglePlusIconLinkTest() {
		boolean gpLogo = adminLogInPage.verifyGooglePlusIconLink();
		Assert.assertTrue(gpLogo);
		log.info(gpLogo);
		log.info("===================================================");
	}
	
	@Test(priority = 21)
	public void clickOnGooglePlusIconLinkTest() {
		adminLogInPage.clickOnGooglePlusIconLink();
		log.info("====================================================");
	}
	
	@Test(priority = 22)
	public void blank_Email_PasswordTest() {
		adminLogInPage.blank_Email_Password(" ", " ");
		log.info("====================================================");
	}
	
	@Test(priority = 23)
	public void validEmail_BlankPasswordTest() {
		adminLogInPage.validEmail_BlankPassword("admin@javaclassesinpune.com", " ");
		log.info("====================================================");
	}
	
	@Test(priority = 24)
	public void blankEmail_ValidPasswordTest() {
		adminLogInPage.blankEmail_ValidPassword(" ", "password");
		log.info("====================================================");
	}
	
	@Test(priority = 25)
	public void invalidEmail_InvalidPasswordTest() {
		adminLogInPage.invalidEmail_InvalidPassword("ashish@gmail.com", "ashish");  
		log.info("====================================================");
	}
	
	@Test(priority = 26)
	public void invalidEmail_ValidPasswordTest() {
		adminLogInPage.invalidEmail_ValidPassword("ashish@gmail.com", "password");
		log.info("====================================================");
	}
	
	@Test(priority = 27)
	public void validEmail_InvalidPasswordTest() {
		adminLogInPage.validEmail_InvalidPassword("admin@javaclassesinpune.com", "passwd");
		log.info("====================================================");
	}
	
	@Test(priority = 28)
	public void invalidEmailFormat_ValidPasswordTest() {
		adminLogInPage.invalidEmailFormat_validPassword("asdfghjk", "password");
		log.info("====================================================");
	}
	
	@Test(priority = 28)
	public void validEmail_invalidPasswordFormatTest() {
		adminLogInPage.validEmail_InvalidPasswordFormat("admin@javaclassesinpune.com", "pas");
		log.info("====================================================");
	}
	
	@Test(priority = 29)
	public void validEmail_PasswordTest() {
		adminLogInPage.validEmail_Password("admin@javaclassesinpune.com", "password");
		log.info("====================================================");
	}
	
	@Test(priority=30)
	public void verifyEmailPlaceholderTest() {
		String actual=adminLogInPage.verifyEmailPlaceHolder();
		String expected=" test@example.com";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("====================================================");
	}
	
	@Test(priority=31)
	public void verifyPasswordPlaceholderTest() {
		String actual=adminLogInPage.verifyPasswordPlaceHolder();
		String expected=" Password";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("====================================================");
	}
	
	@Test(priority=32)
	public void verifyLoginButtonTextTest() {
		String actual=adminLogInPage.verifyLoginButtonText();
		String expected="";
		Assert.assertEquals(actual, expected);
		log.info("Actual: "+actual);
		log.info("Expected: "+expected);
		log.info("====================================================");
	}

	@Test(priority=33)
	public void clickOnLoginButtonTest() {
		adminLogInPage.clickOnLogInButton();
		log.info("====================================================");
	}
	
	@Test(priority=34)
	public void check_TwitterLogo_ColorTest() {
		adminLogInPage.cheak_TwtterLogo_Color();;
		log.info("=====================================================");
	}

	@Test(priority=35)
	public void check_Facebooklogo_ColorTest() {
		adminLogInPage.cheak_FacebookLogo_Color();
		log.info("=====================================================");
	}

	@Test(priority=36)
	public void check_GithubLogo_ColorTest() {
		adminLogInPage.cheak_GithubLogo_Color();
		log.info("=====================================================");
	}
	
	@Test(priority=37)
	public void check_GooglePlusLogo_ColorTest() {
		adminLogInPage.cheak_GooglePlusLogo_Color();
		log.info("=====================================================");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}