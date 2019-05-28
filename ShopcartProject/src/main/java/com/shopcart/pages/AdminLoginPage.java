package com.shopcart.pages;

import org.apache.poi.hslf.model.Placeholder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class AdminLoginPage extends TestBase {

	@FindBy(xpath = "//img[@id='logo']")
	WebElement prestaShopLogo;

	@FindBy(xpath = "//div[@class='text-center']")
	WebElement appVersion;

	@FindBy(xpath = "//div[@id='shop-img']//img")
	WebElement appImage;

	@FindBy(xpath = "//div[@class='front panel']//h4")
	WebElement shopcartText;

	@FindBy(xpath = "//label[@for='email']")
	WebElement emailaddressLabel;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailLink;

	@FindBy(xpath = "//span[@for='email']")
	WebElement emailError;

	@FindBy(xpath = "//div[@id='error']//li")
	WebElement errorPopup;

	@FindBy(xpath = "//Label[@for='passwd']")
	WebElement passwordLabel;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement passwordLink;

	@FindBy(xpath = "//span[@for='passwd']")
	WebElement passwordError;

	@FindBy(xpath = "//div[@id='error']//ol")
	WebElement passwordErrorPopup;

	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	WebElement loginText;

	@FindBy(xpath = "//div[@class='form-group row-padding-top']//button")
	WebElement loginButton;

	@FindBy(xpath = "//label[@for='stay_logged_in']")
	WebElement stayLoggedInText;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement stayLoggedInCheckbox;

	@FindBy(xpath = "//a[@href='#']")
	WebElement forgotPasswordLink;

	@FindBy(xpath = "//a[@href='http://www.prestashop.com/']")
	WebElement urlRightsLink;

	@FindBy(xpath = "//i[@class='icon-twitter']")
	WebElement twitterIconLink;

	@FindBy(xpath = "//i[@class='icon-facebook']")
	WebElement facebookIconLink;

	@FindBy(xpath = "//i[@class='icon-github']")
	WebElement githubIconLink;

	@FindBy(xpath = "//i[@class='icon-google-plus']")
	WebElement googlePlusIconLink;

	public AdminLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyPageTitle() {
		return driver.getTitle();
	}

	public boolean verifyPrestaShopNameLogo() {
		return prestaShopLogo.isDisplayed();
	}

	public String verifyVersionText() {
		return appVersion.getText();
	}

	public boolean verifyPrestaShopImageLogo() {
		return appImage.isDisplayed();
	}

	public String verifyShopcartText() {
		return shopcartText.getText();
	}

	public String verifyEmailAddressLabel() {
		return emailaddressLabel.getText();
	}
	
	public String verifyEmailPlaceHolder() {
		return emailLink.getAttribute("placeholder");
	}
	
	public String verifyPasswordAddressLabel() {
		return passwordLabel.getText();
	}
	
	public String verifyLoginButtonText() {
		return loginButton.getText();
	}
	
	public boolean verifyLoginLink() {
		return loginButton.isDisplayed();
	}
	
	public DashboardPage clickOnLogInButton() {
		loginButton.click();
		return new DashboardPage();
	}
	
	public String verifyPasswordPlaceHolder() {
		return passwordLink.getAttribute("placeholder");
	}
	
    public String verifyStayLoggedInText() {
		return stayLoggedInText.getText();
	}

	public void clickOnStayLoggedInButton() {
		stayLoggedInCheckbox.click();
	}

	public String verifyForgotPasswordText() {
		return forgotPasswordLink.getText();
	}

	public ForgotPasswordPage clickOnForgotPasswordButton() {
		forgotPasswordLink.click();
		return new ForgotPasswordPage();
	}

	public String verifyUrlRightLinkText() {
		return urlRightsLink.getText();
	}

	public UrlPage clickOnUrlRightLink() {
		urlRightsLink.click();
		return new UrlPage();
	}

	public boolean verifyTwitterIconLink() {
		return twitterIconLink.isDisplayed();
	}

	public TwitterPage clickOnTwitterIconLink() {
		twitterIconLink.click();
		return new TwitterPage();
	}

	public boolean verifyFacebookIconLink() {
		return facebookIconLink.isDisplayed();
	}

	public FacebookPage clickOnFacebookIconLink() {
		facebookIconLink.click();
		return new FacebookPage();
	}

	public boolean verifyGithubIconLink() {
		return githubIconLink.isDisplayed();
	}

	public GithubPage clickOnGithubIconLink() {
		githubIconLink.click();
		return new GithubPage();
	}

	public boolean verifyGooglePlusIconLink() {
		return googlePlusIconLink.isDisplayed();
	}

	public GooglePlusPage clickOnGooglePlusIconLink() {
		googlePlusIconLink.click();
		return new GooglePlusPage();
	}

	// Blank email & password
	public void blank_Email_Password(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();

		String EmailErrorMsg = emailError.getText();
		log.info("Please enter Valid email :" + EmailErrorMsg);

		String PasswordErrorMsg = passwordError.getText();
		log.info("Please enter Valid password :" + PasswordErrorMsg);
	}

	// Valid email & blank Password
	public void validEmail_BlankPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();

		String PasswordErrorMsg = passwordError.getText();
		log.info("Please enter Valid password :" + PasswordErrorMsg);
	}

	// Blank email & valid Password
	public void blankEmail_ValidPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();

		String EmailErrorMsg = emailError.getText();
		log.info("Please enter Valid email :" + EmailErrorMsg);
	}

	// Invalid Email & Invalid Password
	public void invalidEmail_InvalidPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();

		String ErrorPopUpMsg = errorPopup.getText();
		log.info("Error Popup: " + ErrorPopUpMsg);
	}

	// Invalid Email & valid Paasword
	public void invalidEmail_ValidPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();

		String ErrorPopUpMsg = errorPopup.getText();
		log.info("Error Popup: " + ErrorPopUpMsg);
	}

	// Valid Email & Invalid Paasword
	public void validEmail_InvalidPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();

		String ErrorPopUpMsg = errorPopup.getText();
		log.info("Error Popup: " + ErrorPopUpMsg);
	}

	// Invalid email format & valid Password
	public void invalidEmailFormat_validPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();

		String EmailErrorMsg = emailError.getText();
		log.info("Please enter Valid email :" + EmailErrorMsg);

		String EmailFormatMsg = emailLink.getAttribute("Placeholder");
		log.info("Please enter email address in valid format: " + EmailFormatMsg);
	}

	// Valid email & invalid password format
	public void validEmail_InvalidPasswordFormat(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();

		String PasswordAlertPop = errorPopup.getText();
		log.info("Error Popup: " + PasswordAlertPop);
		}

	// valid Email & valid pasword
	public DashboardPage validEmail_Password(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);

		passwordLink.clear();
		passwordLink.sendKeys(password);

		loginButton.click();
		
		return new DashboardPage();
	}
	
	public void cheak_TwtterLogo_Color() {
		log.info("Before mouse over twitter logo color is: "+twitterIconLink.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(twitterIconLink).build().perform();
		log.info("After mouse over twitter logo color is: "+twitterIconLink.getCssValue("color"));
		
	}
	
	public void cheak_FacebookLogo_Color() {
		log.info("Before mouse over facebook logo color is: "+facebookIconLink.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(facebookIconLink).build().perform();
		log.info("After mouse over facebook logo color is: "+facebookIconLink.getCssValue("color"));
		
	}
	
	public void cheak_GithubLogo_Color() {
		log.info("Before mouse over github logo color is: "+githubIconLink.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(githubIconLink).build().perform();
		log.info("After mouse over github logo color is: "+githubIconLink.getCssValue("color"));
		
	}
	
	public void cheak_GooglePlusLogo_Color() {
		log.info("Before mouse over googleplus logo color is: "+googlePlusIconLink.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(googlePlusIconLink).build().perform();
		log.info("After mouse over googleplus logo color is: "+googlePlusIconLink.getCssValue("color"));
		
	}
	
	public void cheak_LoginButton_Color() {
		log.info("Before mouse over googleplus logo color is: "+loginButton.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(loginButton).build().perform();
		log.info("After mouse over googleplus logo color is: "+loginButton.getCssValue("color"));
		
	}
     
	
}
