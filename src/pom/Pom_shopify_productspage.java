package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_shopify_productspage {
	@FindBy(xpath="//button[.='Export']")
	private WebElement exportButton;
	@FindBy(xpath="//button[.='Import']")
	private WebElement importButton;
	@FindBy(xpath="(//button[.='More actions'])[1]")
	private WebElement moreactionsButton;
	@FindBy(xpath="(//span[.='Add product'])[2]")
	private WebElement addproductButton;
	
	public Pom_shopify_productspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void addProductMthod() throws InterruptedException {
		addproductButton.click();
		Thread.sleep(5000);
		
	}
	
	 
	

}
