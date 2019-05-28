package com.shopcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class CatalogPriceRulesPage extends TestBase {
	@FindBy(xpath="//li[@class='breadcrumb-container']//a[contains(text(),'Price Rules')]")
	WebElement PriceRulseMenu;
	
	@FindBy(xpath="//ul[@class='submenu']//a[contains(text(),'Catalog Price Rules')]")
	WebElement CatalogPriceRulesMenu;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement CatalogPriceRulesPageTitle;
	
	@FindBy(xpath="//div[@class='panel-heading']")
	WebElement CatalogPriceRulesPanelHeading;
	
	public CatalogPriceRulesPage() {
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
	
	public String verifyCatalogPriceRulseMenu() {
		return CatalogPriceRulesMenu.getText();
	}
	
	public void clickOnCatalogPriceRulseMenu() {
		CatalogPriceRulesMenu.click();
	}
	
	public String verifyCatalogPriceRulsePageTitle() {
		return CatalogPriceRulesPageTitle.getText();
	}
	
	public String verifyCatalogPriceRulsePanelHeading() {
		return CatalogPriceRulesPanelHeading.getText();
	}

}
