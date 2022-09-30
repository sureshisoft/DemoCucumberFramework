package com.demo.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			prop= new Properties();
			FileInputStream fis= new 
			FileInputStream("C:\\Users\\LT-SUKR\\eclipse-workspace\\DemocumberFramework\\src\\main\\java\\com\\demo\\config\\config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}

	public static void intitlization()
	{
		String BROWSERNAME= prop.getProperty("browser");
		if(BROWSERNAME.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	
	}

