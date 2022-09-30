package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.util.TestBase;

public class Whatwedopage extends TestBase {
	
	
	@FindBy(xpath="//a[@class='mobileTrigger']")
	public static WebElement mainMenulinkClick;
	
	@FindBy(xpath="//a[contains(text(),'What we do')]")
	public static WebElement whatWedoLinkClick;

	@FindBy(xpath="//a[contains(text(),'Product engineering')]")
	public static WebElement productEngineeringlink;
	
	//Intializing the Page Objects 
	
	public Whatwedopage()
	{
		
		PageFactory.initElements(driver,this);
		
	}
	
	public Whatwedopage mainMenu()
	{
		mainMenulinkClick.click();
		return this;
	}
	
	public Whatwedopage whatLinkClick()
	{
		whatWedoLinkClick.click();
		return this;
	}
	
	public ProductEngineering  productview()
	{
		
		//productEngineeringlink.click();
		
		return new ProductEngineering();
	}

}
