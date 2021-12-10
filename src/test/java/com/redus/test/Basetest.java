package com.redus.test;


import org.testng.annotations.BeforeTest;

import com.redbus.generic.DriverUtils1;



public class Basetest {
	@BeforeTest
	public void setup()
	{
		DriverUtils1.createdriver();
		
	}

}
