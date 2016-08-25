package org.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage 
{
	@FindBy(how = How.ID, using ="txtUsername")
	private WebElement userNameBox;	
	
	@FindBy(how=How.ID, using ="txtPassword")
	private WebElement PasswordBox;
		
	@FindBy(how = How.ID, using = "btnLogin")
	private WebElement LoginButton;
	
	public void enterUserName(String userName)
	{
		userNameBox.clear();
		userNameBox.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		PasswordBox.clear();
		PasswordBox.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		LoginButton.click();
	}
	
	public void login(String userName, String password)
	{
		userNameBox.clear();
		userNameBox.sendKeys(userName);
		
		PasswordBox.clear();
		PasswordBox.sendKeys(password);
		LoginButton.click();
	}
}
