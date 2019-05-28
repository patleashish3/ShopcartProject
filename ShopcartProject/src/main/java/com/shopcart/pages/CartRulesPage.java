package com.shopcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class CartRulesPage extends TestBase {
	@FindBy(xpath="//li[@class='breadcrumb-container']//a[contains(text(),'Price Rules')]")
	WebElement PriceRulseMenu;
	
	@FindBy(xpath="//li[@class='breadcrumb-current']//a[contains(text(),'Cart Rules')]")
	WebElement CartRulseMenu;
	
	@FindBy(xpath="//h2[contains(text(),'Cart Rules')]")
	WebElement CartRulesPageTitle;
	
	@FindBy(xpath="//li//i[@class='process-icon-new']")
	WebElement AddNewCartIcon;
	
	@FindBy(xpath="//div[contains(text(),'Add new cart rule')]")
	WebElement AddNewCartText;
	
	@FindBy(xpath="//a[@class='toolbar_btn']")
	WebElement RecommendedModulesAndServicesIcon;
	
	@FindBy(xpath="//div[contains(text(),'Recommended Modules and Services')]")
	WebElement RecommendedModulesAndServicesText;
	
	@FindBy(xpath="//div[@class='panel-heading']")
	WebElement CartRulesPanelheading;
	
	@FindBy(xpath="//span//i[@class='process-icon-new']")
	WebElement AddNewIcon;
	
	@FindBy(xpath="//input[@id='name_1']")
	WebElement AddCartName;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement AddDescription;
	
	@FindBy(xpath="//span[@class='input-group-btn']//a[@class='btn btn-default']")
	WebElement GenerateButton;
	
	@FindBy(xpath="//label[@for='highlight_on']")
	WebElement HighlightYes;
	
	@FindBy(xpath="//label[@for='highlight_off']")
	WebElement HighlightNo;
	
	@FindBy(xpath="//label[@for='partial_use_on']")
	WebElement PartialUseYes;
	
	@FindBy(xpath="//label[@for='partial_use_off']")
	WebElement PartialUseNo;
	
	@FindBy(xpath="//input[@name='priority']")
	WebElement Priority;
	
	@FindBy(xpath="//label[@for='active_on']")
	WebElement StatusYes;
	
	@FindBy(xpath="//label[@for='active_off']")
	WebElement StatusNo;
	
	@FindBy(xpath="//a[@id='desc-cart_rule-save']")
	WebElement SaveButton;
	
	@FindBy(xpath="//i[@class='process-icon-refresh']")
	WebElement RefreshIcon;
	
	@FindBy(xpath="//i[@class='process-icon-terminal']")
	WebElement TerminalIcon;
	
	@FindBy(xpath="//i[@class='process-icon-database']")
	WebElement DatabaseIcon;
	
	public CartRulesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPriceRulseMenuText() {
		return PriceRulseMenu.getText();
	}
	
	public void clickOnPriceRulseMenu() {
		PriceRulseMenu.click();
	}
	
	public String verifyCartRulseMenuText() {
		return CartRulseMenu.getText();
	}
	
	public void clickOnCartRulseMenu() {
		CartRulseMenu.click();
	}
	
	public String verifyCartRulsePageTitle() {
		return CartRulesPageTitle.getText();
	}
	
	public boolean verifyAddNewCartIcon() {
		return AddNewCartIcon.isDisplayed();
	}
	
	public void clickOnAddNewCartIcon() {
		AddNewCartIcon.click();
	}
	
	public String verifyAddNewCartText() {
		return AddNewCartText.getText();
	}
	
	public boolean verifyRecommendedModulesAndServicesIcon() {
		return RecommendedModulesAndServicesIcon.isDisplayed();
	}
	
	public void clickOnRecommendedModulesAndServicesIcon() {
		RecommendedModulesAndServicesIcon.click();
	}
	
	public String verifyRecommendedModulesAndServicesText() {
		return RecommendedModulesAndServicesText.getText();
	}
	
	public String verifyCartRulesPanelHeadingText() {
		return CartRulesPanelheading.getText();
	}
	
	public boolean verifyAddNewIcon() {
		return AddNewIcon.isDisplayed();
	}
	
	public void clickAddNewIcon() {
		AddNewIcon.click();
	}
	
	public boolean verifyRefreshIcon() {
		return RefreshIcon.isDisplayed();
	}
	
	public void clickOnRefreshIcon() {
		RefreshIcon.click();
	}
	
	public boolean verifyTerminalIcon() {
		return TerminalIcon.isDisplayed();
	}
	
	public void clickOnTerminalIcon() {
		TerminalIcon.click();
	}
	
	public boolean verifyDatabaseIcon() {
		return DatabaseIcon.isDisplayed();
	}
	
	public void clickOnDatabaseIcon() {
		DatabaseIcon.click();
	}
	
	public void AddNewCartRule(String name, String description, String number) {
		AddNewIcon.click();
		AddCartName.clear();
		AddCartName.sendKeys(name);
		AddDescription.clear();
		AddDescription.sendKeys(description);
		GenerateButton.click();
		HighlightYes.click();
		PartialUseYes.click();
		Priority.clear();
		Priority.sendKeys(number);
		StatusYes.click();
		SaveButton.click();
		
	}

}
