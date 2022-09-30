package com.demo.pages;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.util.TestBase;

public class AboutusPage extends TestBase {
	
	
	
	@FindBy(xpath="//a[@class='mobileTrigger']")
	//@FindBy(id="intelligentautomation")
	public static WebElement secondlink;

	@FindBy(xpath="//a[contains(text(),'About us')]")
	public static WebElement aboutUslinkclick;
	
	public AboutusPage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public AboutusPage Aboutusmainmenu2Click() 
	{
		//Thread.sleep(5000);
		
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 * wait.until(ExpectedConditions.elementToBeClickable(menuTwo));
		 */
		System.out.println(" sucessfully entered in message function");
		/*
		 * Actions act= new Actions(driver);
		 * act.moveToElement(menuTwo).build().perform(); act.click();
		 */
		
		
	  secondlink.click();
		
		//	menuTwo.click();
		
		
		
		 return this;
	}
	
	public AboutusPage AboutusClick()
	{
		
		 aboutUslinkclick.click();
		 System.out.println("About us link clicked sucessfully");
		 return this;
	}
}
