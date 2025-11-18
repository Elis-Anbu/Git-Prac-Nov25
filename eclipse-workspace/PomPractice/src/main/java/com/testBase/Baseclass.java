package com.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
public static WebDriver driver;
	
	
	public static void setUp(String browserName)
	{
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else 
		{
			throw new IllegalArgumentException("Please Check the Browser Configuration");
		}
	}



}
