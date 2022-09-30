package com.demo.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.demo.pages.AboutusPage;
import com.demo.pages.Whatwedopage;
import com.demo.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutusStep extends TestBase{
	
	AboutusPage aboutpg;
	
	
	@Given("user open the browser and launch ciklum website")
	public void user_open_the_browser_and_launch_ciklum_website() {
	   
		TestBase.intitlization();
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
	}

	@When("user on Main menu")
	public void user_on_main_menu() throws InterruptedException {
		AboutusPage aboutpg=new AboutusPage();
		Thread.sleep(6000);
		aboutpg.Aboutusmainmenu2Click();
		}
	

	@Then("user should click on Aboutus link")
	public void user_should_click_on_aboutus_link() throws InterruptedException {
	   
		AboutusPage aboutpg=new AboutusPage();
		Thread.sleep(6000);
		aboutpg.AboutusClick();
		
		
	}


}
