package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Pom_shopify_addproductpage;
import pom.Pom_shopify_dashboardpage;
import pom.Pom_shopify_loginpage;
import pom.Pom_shopify_lookuppage;
import pom.Pom_shopify_productspage;

public class Test_shopify_addproduct {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverr.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationtesting.myshopify.com/admin/");
		Thread.sleep(3000);
		
		Pom_shopify_lookuppage lookup=new Pom_shopify_lookuppage(driver);
		lookup.enterEmailMethod();
		
		Pom_shopify_loginpage login=new Pom_shopify_loginpage(driver);
		login.enterPasswordMethod();
		
		Pom_shopify_dashboardpage dash=new Pom_shopify_dashboardpage(driver);
		dash.gotoProductSectionMethod();
		
		Pom_shopify_productspage ppage=new Pom_shopify_productspage(driver);
		ppage.addProductMthod();
		
		Pom_shopify_addproductpage appage=new Pom_shopify_addproductpage(driver);
		appage.addProductDetailsMethod();
		
		Pom_shopify_dashboardpage ddash=new Pom_shopify_dashboardpage(driver);
		ddash.gotoProductSectionMethod();
	}

}
