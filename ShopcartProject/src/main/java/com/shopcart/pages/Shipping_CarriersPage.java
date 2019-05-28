package com.shopcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class Shipping_CarriersPage extends TestBase{
	@FindBy(xpath="//ul[@class='breadcrumb page-breadcrumb']//a[contains(text(),'Shipping')]")
	WebElement ShippingMenu;
	
	@FindBy(xpath="//ul[@class='submenu']//a[contains(text(),'Carriers')]")
	WebElement CarriersMenu;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement CarriersPageTitle;
	
	@FindBy(xpath="//div[@class='panel']")
	WebElement CarrierspanelHeading;
	
	public Shipping_CarriersPage() {
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
	
	public String verifyCarriersMenu() {
		return CarriersMenu.getText();
	}
	
	public void clickOnCarriersMenu() {
		CarriersMenu.click();
	}
	
	public String verifyCarriersPageTitle() {
		return CarriersMenu.getText();
	}
	
	public String verifyCarriersPanelHeading() {
		return CarriersMenu.getText();
	}

}
