package com.testUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DriverUtility {
	public static WebDriver driver;
	static Select select;
	
	public static void setUp()
	{
		driver = new ChromeDriver();
	}
	
	public static void getMaximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void getMinimize()
	{
		driver.manage().window().maximize();
	}
	
	public static void openPageUrl(String url)
	{
		driver.get(url);
	}
	
	public static String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public static String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public static void getImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	
	public static void getImplicitWait(int waitNum)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitNum));
	}
	
	public static void getInput(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	public static void getClick(WebElement element)
	{
		element.click();
	}
	
	public static void isElementDisplayed(WebElement element)
	{
		element.isDisplayed();
	}
	
	public static void isElementEnabled(WebElement element)
	{
		element.isEnabled();
	}
	
	public static void isElementSelected(WebElement element)
	{
		element.isSelected();
	}
	
	public static void alertHandling()
	{
		driver.switchTo().alert().accept();
	}
	
	public static void alertDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static String alertText()
	{
		return driver.switchTo().alert().getText();
	}
	
	public static void getDropDownValue(WebElement element, String value)
	{
		select = new Select(element);
		select.selectByValue(value);
		
	}
	
	public static void getDropDownIndex(WebElement element, int num)
	{
		select = new Select(element);
		select.selectByIndex(num);
	}
	
	public static void getDropDownText(WebElement element, String value)
	{
		select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	public static void captureScreenShot(String FileName)
	{
	   String FilePath = "ScreenShots/";
	   String FileType = ".png";
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	   File screenshotTo = new File(FilePath+FileName+FileType);
	   try {
	   FileHandler.copy(screenshotAs, screenshotTo);
	   }
	   catch (IOException e) 
	   {
		   e.printStackTrace();
	   }
	}
		
		public static void closeTab()
		{
			driver.close();
		}
		
		public static void closeBrowser()
		{
			driver.quit();
		}



}
