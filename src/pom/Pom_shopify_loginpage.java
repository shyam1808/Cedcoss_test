package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_shopify_loginpage {
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextField;
	@FindBy(xpath="//button[.='Log in']")
	private WebElement loginButton;
	@FindBy(xpath="//a[.='Change email']")
	private WebElement changeEmailLink;
	@FindBy(xpath="//a[.='Forgot password?']")
	private WebElement forgotPasswordLink;
	
	public Pom_shopify_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPasswordMethod() throws InterruptedException
	{
		passwordTextField.sendKeys("dracarys");
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
	}
	

}
