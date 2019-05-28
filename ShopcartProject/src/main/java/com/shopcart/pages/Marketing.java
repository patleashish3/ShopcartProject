package com.shopcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class Marketing extends TestBase{
	@FindBy(xpath="//li[@class='breadcrumb-container']//a[contains(text(),'Price Rules')]")
	WebElement PriceRulseMenu;
	
	@FindBy(xpath="//ul[@class='breadcrumb page-breadcrumb']//a[contains(text(),'Marketing')]")
	WebElement MarketingMenu;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement MarketingPageTitle;
	
	@FindBy(xpath="//div[@class='panel']")
	WebElement ListpanelHeading;
	
	public Marketing() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public String verifyPriceRulseMenu() {
		return PriceRulseMenu.getText();
	}
	
	public void clickOnPriceRulseMenu() {
		PriceRulseMenu.click();
	}
	
	public String verifyMarketingMenu() {
		return MarketingMenu.getText();
	}
	
	public void clickOnMarketingMenu() {
		MarketingMenu.click();
	}
	
	public String verifyMarketingPageTitle() {
		return MarketingPageTitle.getText();
	}
	
	public String verifyListPanelHeading() {
		return ListpanelHeading.getText();
	}


}
