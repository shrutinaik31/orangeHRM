package org.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class OnBoardingPage 
{
	@FindBy(how = How.ID, using = "tasksSearch_name")
	private WebElement taskNameBox;
	
	@FindBy(how = How.ID,using = "tasksSearch_job")
	private WebElement EventDD;
	
	@FindBy(how = How.ID,using = "taskDueDate")
	private WebElement dueDateBox;
	
	@FindBy(how = How.ID,using = "tasksSearch_newHire_empName")
	private WebElement participantBox;
	
	@FindBy(how = How.ID,using = "tasksSearch_status")
	private WebElement taskStatusDD;
	
	@FindBy(how = How.ID,using = "tasksSearch_archive")
	private WebElement archiveDD;
	
	@FindBy(how = How.ID,using = "searchBtn")
	private WebElement searchButton;
	
	public void entertaskNameBox(String taskName )
	{
		taskNameBox.sendKeys(taskName);
	}
	
	public void selectEventDD(String Event)
	{
		Select eventObj = new Select(EventDD);
		eventObj.selectByVisibleText(Event);
	}
	public void enterDueDateBox(String DueDate)
	{
		dueDateBox.sendKeys(DueDate);
	}
	public void enteParticipantBox(String Participant)
	{
		participantBox.sendKeys(Participant);
	}
	
	public void selectTaskStatusDD(String TaskStatus)
	{
		Select taskStatusObj = new Select(taskStatusDD);
		taskStatusObj.selectByVisibleText(TaskStatus);
	}
	
	public void SelectArchiveDD(String Archive)
			{
		      Select ArchiveObj = new Select(archiveDD);
		      ArchiveObj.selectByVisibleText(Archive);
			}
	public void clickSearchButton()
	{
		searchButton.click();
	}


}
