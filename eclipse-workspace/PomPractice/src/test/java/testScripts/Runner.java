package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testUtility.DriverUtility;

public class Runner extends DriverUtility {
	@Test
	public void m1()
	{
		setUp();
		getMaximize();
		getImplicitWait(10);
		openPageUrl("https://www.facebook.com/");
		System.out.println(getPageTitle()); 
		System.out.println(getPageUrl());
		WebElement emailField = driver.findElement(By.name("email"));
		getInput(emailField, "ice.sanju@gmail");
		WebElement passwordField = driver.findElement(By.id("pass"));
		getInput(passwordField, "123456");
	
		
		
	}



}
