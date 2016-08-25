package org.orangehrm.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataProvider 
{
	@DataProvider (name="loginData")
	public static Object[][] getData() throws IOException
	{
		Object[][] loginData = readFromExcel("LoginTest");
		
		return loginData;
		
	}
	
	@DataProvider (name="myInfo")
	public static Object[][] getMyInfoData()
	{
		Object[][] myInfoData = new Object[][]{
			{"linda.anderson", "linda.anderson","Shravani","M","Rao","Male","Other"}
			};
		
		return myInfoData;
		
	}
	
	@DataProvider (name="studentTrainingInfo")
	public static Object[][]getStudentTrainingData()
	{
		Object[][] studentInfo = new Object[][]
				{
					{"linda.anderson","linda.anderson", "Product Training 1", "Managed Services Process Training", "2015-01-28","Scheduled"}			
				};
		return studentInfo;
	}
		
	@DataProvider (name = "trainingInfo")
	public static Object[][] getTrainerTrainingData()
	{
		 Object[][] trainingData = new Object[][]
				 {
			 { "linda.anderson", "linda.anderson","Product training 1","Managed Services Process training","2015-01-28",
			 "Scheduled"}
			 
			 
			 
				 };
				 return trainingData;
	}
	
	@DataProvider(name = "onBoardingInfo")
	public static  Object[][] getOnBoardingData()
	{
		 Object[][] OnBoardingData = new Object[][] {
			 
			 { "linda.anderson", "linda.anderson","Recollect Assets","Resignation of Kai, Maggie and Dylan","2015-01-12",
			 "Kai Keegan","Complete","With Archived"}		 
			 
			 
				 };
		return OnBoardingData;
	}
	


	
	
	private static Object[][] readFromExcel(String sheetName) throws IOException
	{		
		FileInputStream fis = new FileInputStream("C:\\Users\\shrut\\workspace-new\\OrangeHRM\\testdata\\orangeHRMtestdata.xlsx");
        
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
        XSSFSheet sheet = wb.getSheet(sheetName);
        
        int totalRows = sheet.getLastRowNum();
        int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells() ;
             
        Object[][] excelData = new Object[totalRows][totalColumns];
       
        for(int row = 1;row<=totalRows;row++)
        {
        	for(int col=0;col<totalColumns;col++)
        	{
        		String excelValue = sheet.getRow(row).getCell(col).toString();
        		excelData[row-1][col] = excelValue;
        	}
        	
        }
        wb.close();
        fis.close();		
		return excelData;		
	}
}

