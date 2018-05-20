package com.clusters.test.smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.clusters.generic.utils.DataHandlers;
import com.clusters.generic.utils.createdriver;
import com.clusters.generic.utils.loginPage;
import com.clusters.test.config.TestConfiguration;

public class TestLogin12345 extends TestConfiguration
{
	WebDriver driver;
	loginPage login;
	
@BeforeMethod
public void precondition()
{
	driver=createdriver.getdriverinstance();
	login=new loginPage(driver);
}

@Test
public void testlogin12345() throws InterruptedException
{
	//login.waitForLoginPageToLoad();
	String actual_title=driver.getTitle();
	String expected_title= "Facebook – log in or sign up";
	Assert.assertEquals(actual_title, expected_title);
    System.out.println(actual_title);   

	                /*String userName=DataHandlers.getDataFromExcel("test-data", "Sheet1", 0, 0);//
	                 //System.out.println(userName);
	                 WebElement element=driver.findElement(By.id("email"));
	                 //element.sendKeys(userName);*/
	                		 
	                 
	                 
	                 /*Thread.sleep(5000);
	                 //String pass=DataHandlers.getDataFromExcel("test-data", "Sheet1", 0, 1);//
	                 //System.out.println(pass);*/
	                 
	                 
	                 	                 
	     
}
@AfterMethod
public void postcondition()
{
	driver.close();
}
}

	

	

	


