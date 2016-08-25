package org.orangehrm.test;

import org.openqa.selenium.support.PageFactory;
import org.orangehrm.page.HomePage;
import org.orangehrm.page.LoginPage;
import org.orangehrm.page.TrainingPage;
import org.orangehrm.util.TestDataProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class trainingTest extends BaseTest
{
	private LoginPage objLoginPage;
	private TrainingPage objTrainingPage;
	private HomePage objHomePage;
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		objLoginPage = PageFactory.initElements(driver, LoginPage.class);
		objTrainingPage =PageFactory.initElements(driver, TrainingPage.class);
		objHomePage =PageFactory.initElements(driver, HomePage.class);
	}
	@Test(dataProvider = "studentTrainingInfo", dataProviderClass =TestDataProvider.class)
	public void searchTrainerSessionList(String userName,String password,String sessionName,String trainingCourse,String scheduledDate,String Status) throws InterruptedException
	{
		driver.get(baseURL);
		driver.manage().window().maximize();
		objLoginPage.login(userName, password);
		Thread.sleep(3000);
		objHomePage.clickTrainingTab();
		objHomePage.clickTrainerSessionsTab();
		objTrainingPage.enterSessionName(sessionName);
		objTrainingPage.enterTrainingCourse(trainingCourse);
		objTrainingPage.enterscheduledDate(scheduledDate);
		objTrainingPage.selectStatus(Status);
		objTrainingPage.clickSearchButton();
	}
	
	@Test(dataProvider = "trainingInfo",dataProviderClass = TestDataProvider.class)	
	public void searchStudentSessionList(String userName, String password, String StudentSessionName,String StudentTrainingCourse ,String StudentScheduledDate, String studentStatus) throws InterruptedException
	{
		driver.get(baseURL);
		driver.manage().window().maximize();
		objLoginPage.login(userName, password);
		Thread.sleep(3000);
		objHomePage.clickTrainingTab();
		objHomePage.clickMyTrainingSessionsTab();
		objTrainingPage.enterStudentSessionName(StudentSessionName);
		objTrainingPage.enterStudentTrainingCourse(StudentTrainingCourse);
		objTrainingPage.enterStudentScheduledDate(StudentScheduledDate);
		objTrainingPage.enterstudentStatus(studentStatus);
		objTrainingPage.clickSearchButton();
	}
	
	

}


