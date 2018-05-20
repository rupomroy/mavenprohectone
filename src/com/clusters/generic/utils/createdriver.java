package com.clusters.generic.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createdriver {
	public static WebDriver getdriverinstance()
	{
		
	String browser_type=DataHandlers.getdatafromproperties("config", "browser");
	String url=DataHandlers.getdatafromproperties("config", "url");
	WebDriver driver=null;
	if(browser_type.toLowerCase().equals("gc"))
	{
		System.setProperty("webdriver.chrome.driver","./browser-servers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (browser_type.equals("ff"))
	{
		System.setProperty("webdriver.firefox.marionette","./browser-servers/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("Invalid Driver Selection");
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(url);
	driver.close();
	return driver;
	
	}
}



	
		

