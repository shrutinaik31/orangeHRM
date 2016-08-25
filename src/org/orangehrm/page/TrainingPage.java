package org.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TrainingPage 
{
	@FindBy(how = How.ID,using = "searchTrainerSession_name")
	private WebElement sessionName;
	
	@FindBy(how=How.ID,using = "searchTrainerSession_course")
	private WebElement trainingCourse;
	
	@FindBy(how=How.ID,using = "searchSession_scheduledDate")
	private WebElement scheduledDate;
	
	@FindBy(how=How.ID,using = "searchTrainerSession_status")
	private WebElement status;
	
	@FindBy(how=How.ID,using = "searchBtn")
	private WebElement searchButton;
	
	@FindBy (how = How.ID,using = "searchStudentSession_name")
	private WebElement studentsessionName;
	
	@FindBy(how = How.ID,using = "searchStudentSession_course")
	private WebElement studentTrainingCourse;
	
	@FindBy (how = How.ID,using = "searchSession_scheduledDate")
	private WebElement studentSheduledDate;
	
	@FindBy (how = How.ID,using = "searchStudentSession_status")
	private WebElement studentStatus;	
	
	
	
	public void enterSessionName(String session)
	{
		
		sessionName.sendKeys(session);
	}
	
	public void enterTrainingCourse(String Course)
	{
		trainingCourse.sendKeys(Course);
	}
	
	public void enterscheduledDate(String SchDate)
	{
		scheduledDate.clear();
		scheduledDate.sendKeys(SchDate);
	}
	public void selectStatus(String sts)
	{
		Select statusOptions = new Select(status);
		statusOptions.selectByVisibleText(sts);
	}
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void enterStudentSessionName(String stdSessionName)
	{
		studentsessionName.sendKeys(stdSessionName);
	}
	
	public void enterStudentTrainingCourse(String stdTrainingCoourse)
	{
		studentTrainingCourse.sendKeys(stdTrainingCoourse);
	}
	
	public void enterStudentScheduledDate(String stdScheduledDate)
	{
		studentSheduledDate.clear();
		studentSheduledDate.sendKeys(stdScheduledDate);
	}
	public void enterstudentStatus(String stdStatus)
	{
		Select stsOptions = new Select(studentStatus);
		stsOptions.selectByVisibleText(stdStatus);
	}

}
