package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_shopify_lookuppage {
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailTextField;
	@FindBy(xpath="//button[.='Next']")
	private WebElement nextButton;
	@FindBy(xpath="//a[.='Log in to another store']")
	private WebElement link1;

	public Pom_shopify_lookuppage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailMethod() throws InterruptedException
	{
		emailTextField.sendKeys("shantanugupta@cedcommerce.com");
		Thread.sleep(2000);
		nextButton.click();
		Thread.sleep(5000);
	}
}
