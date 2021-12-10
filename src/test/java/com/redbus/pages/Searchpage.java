package com.redbus.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends BasePage1
{


@FindBy(id="src")
private WebElement src;
@FindBy(id="dest")
private WebElement dest;
@FindBy(xpath = "//label[@for='onward_cal']")
private WebElement d1;
@FindBy(xpath = "//td[@class='wd day']")
private WebElement d2;
@FindBy(xpath = "//button[@id='search_btn']")
private WebElement search;
public void openUrl() {
	
	Driver.get("https://www.redbus.in/");
}
 public void enterSource(String s)
{
src.sendKeys(s);
}
public void enterDestination(String d)
{
dest.sendKeys(d);
}
public void clickDate()
{
d1.click();
}
public void selectDate()
{
d2.click();
}


public void searchBus() {
	search.click();
	
}
	
}
	

