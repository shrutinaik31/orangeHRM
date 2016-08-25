package org.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PerformancePage
{
	@FindBy(how = How.ID, using = "goalSearchForm_goalType")
	private WebElement goalTypeDD ;
	
	@FindBy(how = How.ID, using = "goalSearchForm_goalName")
	private WebElement goalBox;
	
	@FindBy(how = How.ID, using = "date_from")
	private WebElement dueDatefromBox;
	
	@FindBy (how = How.ID, using = "date_to")
	private WebElement dueDateToBox;
	
	@FindBy(how = How.ID, using = "goalSearchForm_achieved")
	private WebElement showAchieveGoalsCheckBox;
	
	@FindBy(how = How.ID, using = "searchBtn")
	private WebElement searchbutton;
	
	
	public void selectgoalTypeDD(String goalType)
	{
		Select goalTypeobj = new Select(goalTypeDD);
		goalTypeobj.selectByVisibleText(goalType);
		
	}
	
	public void enterGoalBox(String Goal)
	{
		goalBox.sendKeys(Goal);
	}
	public void enterdueDatefromBox(String dueDateFrom)
	{
		dueDatefromBox.sendKeys(dueDateFrom);
	}
	public void dueDateToBox(String dueDateTo)
	{
		dueDateToBox.sendKeys(dueDateTo);
	}

	public void ClickshowAchieveGoalsCheckBox(String AchieveGoals)
	{
		showAchieveGoalsCheckBox.click();
	}
	public void clickSearchbutton()
	{
		searchbutton.click();
	}
	
	
	
}
