package org.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage 
{
	@FindBy(how = How.XPATH,using="//*[@id='content']/div/div[1]/h1")
	private WebElement dashboardLabel;
	
	public String readDashboardText()
	{
		String text =dashboardLabel.getText();
		return text;	
	}	

}
 