package org.orangehrm.test;

import org.openqa.selenium.support.PageFactory;
import org.orangehrm.page.HomePage;
import org.orangehrm.page.LoginPage;
import org.orangehrm.page.OnBoardingPage;
import org.orangehrm.util.TestDataProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OnBoardingTest extends BaseTest
{
	private OnBoardingPage objOnBoarding;
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	
	@BeforeMethod
	public void beforeMethod()
	{
		objOnBoarding = PageFactory.initElements(driver, OnBoardingPage.class);
		objLoginPage = PageFactory.initElements(driver, LoginPage.class);
		objHomePage = PageFactory.initElements(driver, HomePage.class);
		
	}
	
	@Test(dataProvider ="onBoardingInfo" ,dataProviderClass=TestDataProvider.class)
	public void myTaskInformation(String userName,String password,String taskName,String event,String dueDate,String participant,String taskStatus,String archive) throws InterruptedException
	{
		driver.get(baseURL);		
		driver.manage().window().maximize();		
		objLoginPage.login(userName, password);
		Thread.sleep(3000);
		objHomePage.clickOnBoardingTab();
		objOnBoarding.entertaskNameBox(taskName);
		objOnBoarding.selectEventDD(event);
		objOnBoarding.enterDueDateBox(dueDate);
		objOnBoarding.selectTaskStatusDD(taskStatus);
		objOnBoarding.enteParticipantBox(participant);
		objOnBoarding.selectTaskStatusDD(taskStatus);
		objOnBoarding.SelectArchiveDD(archive);
		objOnBoarding.clickSearchButton();
	
	}
	
	

}
