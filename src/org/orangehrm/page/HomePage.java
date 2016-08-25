package org.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage 
{
	@FindBy(how = How.ID, using = "menu_pim_viewMyDetails")
	private WebElement myInfoTab;
	
	@FindBy(how = How.ID,using = "menu_training_defaultTrainingModulePage")
	private WebElement trainingTab;
	
	@FindBy(how = How.ID,using = "menu_training_viewTrainerSessionList")
	private WebElement trainerSessionsTab;
	
	@FindBy(how = How.ID,using = "menu_training_viewMyTrainingSessionList")
	private WebElement myTrainingSessionsTab;
	
	@FindBy(how = How.ID,using = "menu_onboarding_defaultMenuView")
	private WebElement onBoardingTab;
	
	public void clickMyInfoTab()
	{
		myInfoTab.click();
	}
	
	public void clickTrainingTab()
	{
		trainingTab.click();
	}
	
	public void clickTrainerSessionsTab()
	{
		trainerSessionsTab.click();
	}
	
	public void clickMyTrainingSessionsTab()
	{
		myTrainingSessionsTab.click();
	}
	public void clickOnBoardingTab()
	{
		onBoardingTab.click();
	}
	
	
	
	
}

