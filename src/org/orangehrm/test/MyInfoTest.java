package org.orangehrm.test;

import org.openqa.selenium.support.PageFactory;

import org.orangehrm.page.HomePage;
import org.orangehrm.page.LoginPage;
import org.orangehrm.page.MyInfoPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.orangehrm.util.*;

public class MyInfoTest extends BaseTest
{
	private MyInfoPage objMyInfoPage;
	private LoginPage objLoginPage;
	private HomePage objHomePage;

	
	@BeforeMethod
	public void beforeMethod()
	{
		objMyInfoPage = PageFactory.initElements(driver,MyInfoPage.class );
		objLoginPage = PageFactory.initElements(driver, LoginPage.class);
		objHomePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	@Test(dataProvider="myInfo", dataProviderClass=TestDataProvider.class)	
	public void editPersonalDetails(String userName, String password,String firstName,String middleName, String lastName,String gender,String maritalStatus) throws InterruptedException
	{
		driver.get(baseURL);		
		driver.manage().window().maximize();		
		objLoginPage.login(userName, password);
		Thread.sleep(3000);
		objHomePage.clickMyInfoTab();
		objMyInfoPage.clickEditSaveButton();
		objMyInfoPage.enterFirstName(firstName);
		objMyInfoPage.enterMiddleName(middleName);
		objMyInfoPage.enterLastName(lastName);
		objMyInfoPage.selectGender(gender);
		objMyInfoPage.selectMaritalStatus(maritalStatus);
		objMyInfoPage.clickEditSaveButton();
		String actualFirstName = objMyInfoPage.readFirstName();	
		Assert.assertEquals(actualFirstName, firstName);			
	}
	
	
}

