package com.redus.test;

import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.redbus.generic.PropertyReader;
import com.redbus.pages.Searchpage;


public class SearchTest extends Basetest
{
	Searchpage hp = new Searchpage();
@Test
public void verifySearch() throws InterruptedException
{
hp.openUrl();
PropertyReader.initProperty();
hp.enterSource(PropertyReader.getProperty("search.src"));
hp.enterDestination(PropertyReader.getProperty("search.dest"));
Thread.sleep(2000);


hp.clickDate();
Thread.sleep(2000);
hp.selectDate();
Thread.sleep(10000);
hp.searchBus();
	/*Searchpage Loginpage= new Searchpage();
	Loginpage.openUrl();
	//loginPage.openUrl();
	
	Loginpage.enterSource("Admin");
	Thread.sleep(2000);
	Loginpage.enterDestination("admin123");
	Thread.sleep(2000);
	Loginpage.clickDate();
	Loginpage.selectDate();
	Thread.sleep(10000);
	Loginpage.searchBus();*/
	
}
}