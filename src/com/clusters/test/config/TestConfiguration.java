package com.clusters.test.config;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestConfiguration  {
	
	@BeforeSuite
	public void beforesuite()
	{ 
		
	
		Reporter.log("***************started execution*******", true);
	}
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("***************ended execution*******", true);
	}
	
	@BeforeClass
	public void beforeclass()
	{
		Reporter.log("***************started execution of user story*******", true);
	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("***************ended execution of user story*******", true);
	}
	

}
