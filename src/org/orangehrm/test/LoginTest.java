package org.orangehrm.test;

import org.openqa.selenium.support.PageFactory;
import org.orangehrm.page.DashboardPage;
import org.orangehrm.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.orangehrm.util.*;

public class LoginTest extends BaseTest
{

	private LoginPage objLoginPage;
	private DashboardPage objDashboardPage;
		
	@BeforeMethod
	public void beforeMethod()
	{
		objLoginPage = PageFactory.initElements(driver, LoginPage.class);
		objDashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		
	}
	
	@Test(dataProvider="loginData", dataProviderClass=TestDataProvider.class)
	public void loginTestMethod(String userName, String password) throws InterruptedException
	{		
		driver.get(baseURL);		
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		
		objLoginPage.login(userName, password);
		
		String displayText = objDashboardPage.readDashboardText();
		
		Assert.assertEquals(displayText, "Dashboard");
	}	

}
