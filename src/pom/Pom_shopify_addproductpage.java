package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_shopify_addproductpage {
	@FindBy(xpath="//input[@name='title']")
	private WebElement titleTextField;
	@FindBy(xpath="//body[@class='mce-content-body ']")
	private WebElement descriptionTextField;
	@FindBy(xpath="//input[@placeholder='e.g. Shirts']")
	private WebElement productTypeTextField;
	@FindBy(xpath="//input[@placeholder='e.g. Nike']")
	private WebElement vendorTextField;
	@FindBy(xpath="//input[@placeholder='Vintage, cotton, summer']")
	private WebElement tagsTextField;
	@FindBy(xpath="//input[@name='price']")
	private WebElement priceTextField;
	@FindBy(xpath="//input[@name='compareAtPrice']")
	private WebElement compareAtPriceTextField;
	@FindBy(xpath="//input[@name='unitCost']")
	private WebElement costPerItemTextField;
	@FindBy(xpath="//input[@id='InventoryCardSku']")
	private WebElement skuTextField;
	@FindBy(xpath="//input[@id='InventoryCardBarcode']")
	private WebElement barcodeTextField;
	@FindBy(xpath="//input[@id='AdjustQuantityPopoverTextFieldActivator']")
	private WebElement quantityTextField;
	@FindBy(xpath="//input[@id='ShippingCardWeight']")
	private WebElement weightTextField;
	@FindBy(xpath="(//span[.='Save'])[3]")
	private WebElement saveButton;
	
	public Pom_shopify_addproductpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addProductDetailsMethod() throws InterruptedException {
		titleTextField.sendKeys("Caps");
		Thread.sleep(2000);
	//	descriptionTextField.sendKeys("Baseball caps with adjuster");
	//	Thread.sleep(2000);
		productTypeTextField.sendKeys("Hats");
		Thread.sleep(2000);
		vendorTextField.sendKeys("Puma");
		Thread.sleep(2000);
		tagsTextField.sendKeys("vintage,polyester");
		Thread.sleep(2000);
		priceTextField.sendKeys("10000");
		Thread.sleep(2000);
		compareAtPriceTextField.sendKeys("8000");
		Thread.sleep(2000);
		costPerItemTextField.sendKeys("500");
		Thread.sleep(2000);
		skuTextField.sendKeys("KS944RUR");
		Thread.sleep(2000);
		barcodeTextField.sendKeys("1234500010234");
		Thread.sleep(2000);
		quantityTextField.sendKeys("8000");
		Thread.sleep(2000);
		weightTextField.sendKeys("80");
		Thread.sleep(2000);
		saveButton.click();
		
	}
	

}
