package com.clusters.generic.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getUserNameTextBox()
	{
		WebElement element1 = driver.findElement(By.id("email"));
		return element1;
		
	}
	public WebElement getPasswordTextBox()
	{
		WebElement element2 = driver.findElement(By.id("pass"));
		return element2;
		
	}
	public WebElement getLoginButton()
	{
		WebElement element3 = driver.findElement(By.xpath("//[@text()='submit']"));
		return element3;
		
	}
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//[@text()='submit']")));
	}
}
