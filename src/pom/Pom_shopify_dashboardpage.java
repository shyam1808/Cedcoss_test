package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_shopify_dashboardpage {
	@FindBy(xpath="//span[.='Home']")
	private WebElement homePageIcon;
	@FindBy(xpath="//span[.='Orders']")
	private WebElement ordersPageIcon;
	@FindBy(xpath="//span[.='Products']")
	private WebElement productsPageIcon;
	@FindBy(xpath="//span[.='Customers']")
	private WebElement customersPageIcon;
	@FindBy(xpath="//span[.='Analytics']")
	private WebElement analyticsPageIcon;
	@FindBy(xpath="//span[.='Marketing']")
	private WebElement marketingPageIcon;
	@FindBy(xpath="//span[.='Discounts']")
	private WebElement discountPageIcon;
	@FindBy(xpath="//span[.='Apps']")
	private WebElement appsPageIcon;
	
	public Pom_shopify_dashboardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gotoProductSectionMethod() throws InterruptedException
	{
		productsPageIcon.click();
		Thread.sleep(2000);
	}
	

}
