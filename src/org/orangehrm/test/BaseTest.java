package org.orangehrm.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest 
{
	protected WebDriver driver;
	protected String baseURL;
	
	public  BaseTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		baseURL = "http://enterprise.demo.orangehrmlive.com/auth/login";
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//driver.close();
	}
}
