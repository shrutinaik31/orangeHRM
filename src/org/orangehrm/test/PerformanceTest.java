package org.orangehrm.test;

import org.openqa.selenium.support.PageFactory;
import org.orangehrm.page.HomePage;
import org.orangehrm.page.LoginPage;
import org.orangehrm.page.PerformancePage;
import org.testng.annotations.BeforeMethod;

public class PerformanceTest extends BaseTest
{
	private PerformancePage objPerformancePage;
	private LoginPage objLoginPage;
	private HomePage objHomePage;
    
	@BeforeMethod
	public void beforeMethod ()
	{
		objPerformancePage = PageFactory.initElements(driver, PerformancePage.class);
		objLoginPage = PageFactory.initElements(driver, LoginPage.class);
		objHomePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	public void searchGoals(String userName,String password,String goalType,String goal,String dueDatefrom,String dueDateTo,String showAchieveGoals) throws InterruptedException
	{
		driver.get(baseURL);		
		driver.manage().window().maximize();		
		objLoginPage.login(userName, password);
		Thread.sleep(3000);
		objHomePage.clickPerformanceTab();
		objHomePage.selectGoalsTab(goalType);
		objPerformancePage.enterGoalBox(goal);
		objPerformancePage.enterdueDatefromBox(dueDatefrom);
		objPerformancePage.dueDateToBox(dueDateTo);
		objPerformancePage.ClickshowAchieveGoalsCheckBox(showAchieveGoals);
		objPerformancePage.clickSearchbutton();
		
	}
	
	
	
	
	
	
	
	
	


}
 