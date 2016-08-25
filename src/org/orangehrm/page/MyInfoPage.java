package org.orangehrm.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MyInfoPage 
{
	@FindBy(how = How.XPATH, using = "//*[@id='personal_txtEmpFirstName']")
	private WebElement firstNameBox;
	
	@FindBy(how = How.ID, using ="personal_txtEmpMiddleName")
	private WebElement middleNameBox;
	
	@FindBy(how = How.ID, using = "personal_txtEmpLastName")
	private WebElement lastNameBox;
	
	@FindBy(how = How.NAME, using = "personal[optGender]")
	private List<WebElement> genderRadioButton;
	
	@FindBy(how = How.ID, using = "personal_cmbMarital")
	private WebElement maritalStatusDD;
	
	@FindBy(how=How.ID,using = "btnSave")
	private WebElement editSaveButton;
	
	public void enterFirstName(String firstName)
	{
		firstNameBox.clear();
		firstNameBox.sendKeys(firstName);	
		
	}
	public String readFirstName()
	{
		return firstNameBox.getAttribute("value");
	}
	
	public void enterMiddleName(String middleName)
	{
		middleNameBox.clear();
		middleNameBox.sendKeys(middleName);
	}
	public void enterLastName(String lastName)
	{
		lastNameBox.clear();
		lastNameBox.sendKeys(lastName);
	}
	
	public void selectGender(String gender)
	
	{
		if(gender.contentEquals("Male"))		
		{
			genderRadioButton.get(0).click();
		}
		else
		{
			genderRadioButton.get(1).click();
		}
	}
	public void selectMaritalStatus(String MaritalStatus)
	{
		Select maritalOptions = new Select(maritalStatusDD);
		maritalOptions.selectByVisibleText(MaritalStatus);
	}
	public void clickEditSaveButton()
	{
		editSaveButton.click();
	}

}
