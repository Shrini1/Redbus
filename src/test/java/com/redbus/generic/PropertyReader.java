package com.redbus.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {
static Properties pro=new Properties();
public static void initProperty() {
try {
	pro.load(new FileInputStream("C:\\Users\\SDEVIHOS\\eclipse-workspace\\Redbus\\src\\test\\resources\\config\\config.properties"));
} catch (Exception e) {
	e.printStackTrace();
}
}
public static String getProperty(String key) {
	return pro.getProperty(key);
}
}