package com.redbus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.redbus.generic.DriverUtils1;



public class BasePage1 {
WebDriver Driver;
public BasePage1()
{
	Driver=DriverUtils1.getDriver();
	PageFactory.initElements(Driver,this);
}
}
