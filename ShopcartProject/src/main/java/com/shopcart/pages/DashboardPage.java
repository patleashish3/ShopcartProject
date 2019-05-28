package com.shopcart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class DashboardPage extends TestBase {
	@FindBy(xpath = "//a[@id='header_shopversion']")
	WebElement PrestashopHeaderLogo;

	@FindBy(xpath = "//a[@id='header_shopname']")
	WebElement ShopcartHeaderName;

	@FindBy(xpath = "//a[@class='dropdown-toggle notifs']//i[@class='icon-shopping-cart']")
	WebElement ShoppingCartIcon;

	@FindBy(xpath = "//a[@class='dropdown-toggle notifs']//i[@class='icon-user']")
	WebElement UserIcon;

	@FindBy(xpath = "//a[@class='dropdown-toggle notifs']//i[@class='icon-envelope']")
	WebElement EnvelopeIcon;

	@FindBy(xpath = "//a[@class='dropdown-toggle gamification_notif']//img")
	WebElement CupLogo;

	@FindBy(xpath = "//a[@id='quick_select']")
	WebElement QuickAccessLink;

	@FindBy(xpath = "//span[contains(text(),'My shop')]")
	WebElement ShopLink;

	@FindBy(xpath = "//li[@id='employee_infos']//span[contains(text(),'Me')]")
	WebElement SystemAdministrator;

	@FindBy(xpath = "//i[@class='caret']")
	WebElement DropdownMenu;

	@FindBy(xpath = "//span[@class='employee_avatar_small']//img[@class='imgm img-thumbnail']")
	WebElement EmployeeImage;

	@FindBy(xpath = "//span[contains(text(),'Connect to PrestaShop Marketplace account')]")
	WebElement ConnectToPrestashopLink;

	@FindBy(xpath = "//i[@id='search_type_icon']")
	WebElement SearchIcon;

	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']//i[@class='icon-caret-down']")
	WebElement SearchDropDown;

	@FindBy(xpath = "//input[@id='bo_query']")
	WebElement SearchBox;

	@FindBy(xpath = "//a[contains(text(),'Dashboard')]")
	WebElement SmallNameDashboardText;

	@FindBy(xpath = "//h2[@class='page-title']")
	WebElement pageTitle;

	@FindBy(xpath = "//i[@class='process-icon-toggle-off']")
	WebElement ToggleButton;

	@FindBy(xpath = "//div[contains(text(),'Demo mode')]")
	WebElement DemoModeToggleButton;

	@FindBy(xpath = "//i[@class='process-icon-help']")
	WebElement HeplIcon;

	@FindBy(xpath = "//div[contains(text(),'Help')]")
	WebElement HelpText;

	@FindBy(xpath = "//i[@class='icon-AdminDashboard']")
	WebElement AdminDashboardIcon;

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	WebElement DashboardLink;

	@FindBy(xpath = "//i[@class='icon-AdminCatalog']")
	WebElement CatalogIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Catalog')]")
	WebElement CatalogLink;

	@FindBy(xpath = "//i[@class='icon-AdminParentOrders']")
	WebElement OrdersIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Orders')]")
	WebElement OrdersLink;

	@FindBy(xpath = "//i[@class='icon-AdminParentCustomer']")
	WebElement CustomersIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Customers')]")
	WebElement CustomersLink;

	@FindBy(xpath = "//i[@class='icon-AdminPriceRule']")
	WebElement PriceRulesIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Price Rules')]")
	WebElement PriceRulesLink;
	
	@FindBy(xpath="//a[contains(text(),'Catalog Price Rules')]")
	WebElement CatalogPriceRulesLink;
	
	@FindBy(xpath="//a[contains(text(),'Marketing')]")
	WebElement MarketingLink;

	@FindBy(xpath = "//i[@class='icon-AdminParentModules']")
	WebElement ModulesAndServicesIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Modules and Services')]")
	WebElement ModulesAndServicesLink;

	@FindBy(xpath = "//i[@class='icon-AdminParentShipping']")
	WebElement ShippingIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Shipping')]")
	WebElement ShippingLink;
	
	@FindBy(xpath="//a[contains(text(),'Carriers')]")
	WebElement Shipping_CarriersLink;
	
	@FindBy(xpath="//li[@id='subtab-AdminShipping']//a[contains(text(),'Preferences')]")
	WebElement Shipping_PreferencesLink;

	@FindBy(xpath = "//i[@class='icon-AdminParentLocalization']")
	WebElement LocalizationIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Localization')]")
	WebElement LocalizationLink;

	@FindBy(xpath = "//i[@class='icon-AdminParentPreferences']")
	WebElement PreferencesIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Preferences')]")
	WebElement PreferencesLink;

	@FindBy(xpath = "//i[@class='icon-AdminTools']")
	WebElement AdvancedParametersIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Advanced Parameters')]")
	WebElement AdvancedParametersLink;

	@FindBy(xpath = "//i[@class='icon-AdminAdmin']")
	WebElement AdministrationIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Administration')]")
	WebElement AdministrationLink;

	@FindBy(xpath = "//i[@class='icon-AdminParentStats']")
	WebElement StatsIcon;

	@FindBy(xpath = "//a[@class='title']//span[contains(text(),'Stats')]")
	WebElement StatsLink;

	@FindBy(xpath = "//i[@class='icon-align-justify icon-rotate-90']")
	WebElement AlignIconLink;

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyDashboardTitle() {
		return driver.getTitle();
	}

	public boolean verifyPrestashopHeaderLogo() {
		return PrestashopHeaderLogo.isDisplayed();
	}

	public String verifyShopcartHeaderName() {
		return ShopcartHeaderName.getText();
	}

	public boolean verifyShoppingCartIcon() {
		return ShoppingCartIcon.isDisplayed();
	}

	public void clickOnShoppingCartIcon() {
		ShoppingCartIcon.click();
	}

	public boolean verifyUserIcon() {
		return UserIcon.isDisplayed();
	}

	public void clickOnUserIcon() {
		UserIcon.click();
	}

	public boolean verifyEnvelopeIcon() {
		return EnvelopeIcon.isDisplayed();
	}

	public void clickOnEnvelopeIcon() {
		EnvelopeIcon.click();
	}

	public boolean verifyCupLogo() {
		return CupLogo.isDisplayed();
	}

	public String verifyQuickAccessLinkText() {
		return QuickAccessLink.getText();
	}

	public void clickOnQuickAccessLink() {
		QuickAccessLink.click();
	}

	public String verifyConnectToPestashopLinkText() {
		return ConnectToPrestashopLink.getText();
	}

	public void clickOnConnectToPrestashopLink() {
		ConnectToPrestashopLink.click();
	}

	public String verifyShopLinkText() {
		return ShopLink.getText();
	}

	public void clickOnShoplink() {
		ShopLink.click();
	}

	public String verifySystemAdministratorText() {
		return SystemAdministrator.getText();
	}

	public boolean verifyDropDownMenu() {
		return DropdownMenu.isDisplayed();
	}

	public void clickOnDropDownMenu() {
		DropdownMenu.click();
	}

	public boolean verifyemployeeImage() {
		return EmployeeImage.isDisplayed();
	}

	public void clickOnEmployeeImage() {
		EmployeeImage.click();
	}

	public boolean verifySearchIcon() {
		return SearchIcon.isDisplayed();
	}

	public boolean verifySearchDropDownIcon() {
		return SearchDropDown.isDisplayed();
	}

	public void clickOnSearchDropDownButton() {
		SearchDropDown.click();
	}

	public boolean verifySearchbox() {
		return SearchBox.isDisplayed();
	}

	public String verifySearchBoxPlaceholder() {
		String placeHolder = SearchBox.getAttribute("placeholder");
		return placeHolder;
	}

	public String verifySmallNameDashboardText() {
		return SmallNameDashboardText.getText();
	}

	public String verifyPageTitle() {
		return pageTitle.getText();
	}

	public boolean verifyToggleButton() {
		return ToggleButton.isDisplayed();
	}

	public void clickOnToggleButton() {
		ToggleButton.isEnabled();
	}

	public String verifyDemoModeToggleButton() {
		return DemoModeToggleButton.getText();
	}

	public boolean verifyHelpIcon() {
		return HeplIcon.isDisplayed();
	}

	public void clickOnHelpIcon() {
		HeplIcon.click();
	}

	public String verifyHelpText() {
		return HelpText.getText();
	}

	public boolean verifyAdminDashboardIcon() {
		return AdminDashboardIcon.isDisplayed();
	}

	public String verifyDashboardLink() {
		return DashboardLink.getText();
	}

	public boolean verifyCatalogIcon() {
		return CatalogIcon.isDisplayed();
	}

	public String verifyCatalogLinkText() {
		return CatalogLink.getText();
	}

	public ProductPage clickOnCatalogLink() {
		CatalogLink.click();
		return new ProductPage();
	}

	public boolean verifyOrdersIcon() {
		return OrdersIcon.isDisplayed();
	}

	public String verifyOrdersLinkText() {
		return OrdersLink.getText();
	}

	public OrdersPage clickOnOrdersLink() {
		OrdersLink.click();
		return new OrdersPage();
	}

	public boolean verifyCustomersIcon() {
		return CustomersIcon.isDisplayed();
	}

	public String verifyCustomersLinkText() {
		return CustomersLink.getText();
	}

	public CustomersPage clickOnCustomersLink() {
		CustomersLink.click();
		return new CustomersPage();
	}

	public boolean verifyPriceRulseIcon() {
		return PriceRulesIcon.isDisplayed();
	}

	public String verifyPriceRulseLinkText() {
		return PriceRulesLink.getText();
	}

	public CartRulesPage clickOnPriceRulseLink() {
		PriceRulesLink.click();
		return new CartRulesPage();
	}

	public boolean verifyModulesAndServicesIcon() {
		return ModulesAndServicesIcon.isDisplayed();
	}

	public String verifyModulesAndServicesLinkText() {
		return ModulesAndServicesLink.getText();
	}

	public ModulesAndServicesPage clickOnModulesAndServicesLink() {
		ModulesAndServicesLink.click();
		return new ModulesAndServicesPage();
	}

	public boolean verifyShippingIcon() {
		return ShippingIcon.isDisplayed();
	}

	public String verifyShippingLinkText() {
		return ShippingLink.getText();
	}

	public CarriersPage clickOnShippingLink() {
		ShippingLink.click();
		return new CarriersPage();
	}

	public boolean verifyLocalizationIcon() {
		return LocalizationIcon.isDisplayed();
	}

	public String verifyLocalizationLinkText() {
		return LocalizationLink.getText();
	}

	public LocalizationPage clickOnLocalizationLink() {
		LocalizationLink.click();
		return new LocalizationPage();
	}

	public boolean verifyPreferencesIcon() {
		return PreferencesIcon.isDisplayed();
	}

	public String verifyPreferencesLinkText() {
		return PreferencesLink.getText();
	}

	public GeneralPage clickOnPreferencesLink() {
		PreferencesLink.click();
		return new GeneralPage();
	}

	public boolean verifyAdvancedParametersIcon() {
		return AdvancedParametersIcon.isDisplayed();
	}

	public String verifyAdvancedParametersLinkText() {
		return AdvancedParametersLink.getText();
	}

	public ConfigarationInformationPage clickOnAdvancedParametersLink() {
		AdministrationLink.click();
		return new ConfigarationInformationPage();
	}

	public boolean verifyAdministrationIcon() {
		return AdministrationIcon.isDisplayed();
	}

	public String verifyAdministrationLinkText() {
		return AdministrationLink.getText();
	}

	public PreferencesPage clickOnAdministrationLink() {
		AdministrationLink.click();
		return new PreferencesPage();
	}

	public boolean verifyStatsIcon() {
		return StatsIcon.isDisplayed();
	}

	public String verifyStatsLinkText() {
		return StatsLink.getText();
	}

	public StatsPage clickOnstatsLink() {
		StatsLink.click();
		return new StatsPage();
	}

	public Boolean verifyAlignIcon() {
		return AlignIconLink.isDisplayed();
	}

	public void clickOnAlignIcon() {
		AlignIconLink.click();
	}
	
	public CatalogPriceRulesPage clickOnCatalogPriceRulesLink() {
		Actions action = new Actions(driver);
		action.moveToElement(PriceRulesLink).build().perform();
		CatalogPriceRulesLink.click();
		return new CatalogPriceRulesPage();
	}
	
	public Marketing clickOnMarketingLink() {
		Actions action = new Actions(driver);
		action.moveToElement(PriceRulesLink).build().perform();
		MarketingLink.click();
		return new Marketing();
	}
	
	public Shipping_CarriersPage clickOnShipping_CarriersLink() {
		Actions action = new Actions(driver);
		action.moveToElement(ShippingLink).build().perform();
		Shipping_CarriersLink.click();
		return new Shipping_CarriersPage();
	}
	
	public Shipping_PreferencesPage clickOnShipping_PrefencesLink() {
		Actions action = new Actions(driver);
		action.moveToElement(ShippingLink).build().perform();
		Shipping_PreferencesLink.click();
		return new Shipping_PreferencesPage();
	}

}
