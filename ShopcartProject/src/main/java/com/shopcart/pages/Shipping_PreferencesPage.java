package com.shopcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class Shipping_PreferencesPage extends TestBase {
	@FindBy(xpath="//ul[@class='breadcrumb page-breadcrumb']//a[contains(text(),'Shipping')]")
	WebElement ShippingMenu;
	
	@FindBy(xpath="//li[@class='breadcrumb-current']//a[contains(text(),'Preferences')]")
	WebElement PreferencesMenu;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement PreferencesPageTitle;
	
	@FindBy(xpath="//div[@id='delivery_fieldset_handling']//div[@class='panel-heading']")
	WebElement HandlingPanelHeading;
	
	public Shipping_PreferencesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public String verifyShippingeMenu() {
		return ShippingMenu.getText();
	}
	
	public void clickOnShippingMenu() {
		ShippingMenu.click();
	}
	
	public String verifyPreferencesMenu() {
		return PreferencesMenu.getText();
	}
	
	public void clickOnPreferencesMenu() {
		PreferencesMenu.click();
	}
	
	public String verifyPreferencesPageTitle() {
		return PreferencesPageTitle.getText();
	}
	
	public String verifyHandlingPanelHeading() {
		return HandlingPanelHeading.getText();
	}

}
