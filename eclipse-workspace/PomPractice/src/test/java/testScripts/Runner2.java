package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testBase.Baseclass;
import com.testUtility.DriverUtility2;

public class Runner2 extends Baseclass{
	@Test
	public void m1()
	{
		setUp("FireFox");
		DriverUtility2.getMaximize();
		DriverUtility2.getImplicitWait(10);
		DriverUtility2.openPageUrl("https://www.facebook.com/");
		System.out.println(DriverUtility2.getPageTitle()); 
		System.out.println(DriverUtility2.getPageUrl());
		WebElement emailField = driver.findElement(By.name("email1"));
		DriverUtility2.getInput(emailField, "ice.sanju@gmail");
		WebElement passwordField = driver.findElement(By.id("pass"));
		DriverUtility2.getInput(passwordField, "123456");
		DriverUtility2.captureScreenShot("ScreenLogin1");
	

}
}
