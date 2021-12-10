package com.redbus.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils1 {
static WebDriver Driver;
public static void createdriver()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SDEVIHOS\\eclipse-workspace\\OrangeHrm\\Driver\\chromedriver.exe");
     Driver=new ChromeDriver();
 	Driver.get("https://www.redbus.in/");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public static WebDriver getDriver()
{
	if(Driver==null) {
		createdriver();
	}
	return Driver;
	}
}