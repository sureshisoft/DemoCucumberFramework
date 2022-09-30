package com.demo.stepdef;

import org.openqa.selenium.By;

import com.demo.pages.Whatwedopage;
import com.demo.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhatwedolinkStep extends TestBase {
	
	Whatwedopage wedo= new Whatwedopage();

	
	@Given("user open the browser")
	public void user_open_the_browser() {
	   
		TestBase.intitlization();
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
	}

	@When("user click on main menu ciklum website")
	public void user_click_on_main_menu_ciklum_website() {
	    
		wedo.mainMenu();
	}

	@Then("Whatwedo link should be clicked")
	public void whatwedo_link_should_be_clicked() {
	 
		wedo.whatLinkClick();
	}

	@Then("productengineering link should be Clicked")
	public void productengineering_link_should_be_clicked() {
	    wedo.productview();
	}

}
