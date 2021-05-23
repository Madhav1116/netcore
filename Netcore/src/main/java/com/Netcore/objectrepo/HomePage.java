package com.Netcore.objectrepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
private WebElement loginpopup;

@FindBy(xpath="//input[@type='text']")
private WebElement searchbox;

@FindBy(xpath="//button[@class='L0Z3Pu']")
private WebElement searchbutton;

@FindBy(xpath="//div[text()='Price -- Low to High']")
private WebElement sort;

@FindBy(xpath="//div[@class='_4rR01T']")
private List<WebElement> model;

@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
private List<WebElement> price;

@FindBy(xpath="//span[@class='_2_R_DZ']")
private List<WebElement> rating;

public List<WebElement> getModel() {
	return model;
}
public List<WebElement> getPrice() {
	return price;
}
public List<WebElement> getRating() {
	return rating;
}


 public WebElement getLoginpopup() {
	return loginpopup;
}
public WebElement getSort() {
	return sort;
}


 public WebElement getSearchbutton() {
		return searchbutton;
	}
 public HomePage(WebDriver driver)
 {
	PageFactory.initElements(driver,this); 
 }
public WebElement getSearchbox() 
{
	return searchbox;
}
 
}
