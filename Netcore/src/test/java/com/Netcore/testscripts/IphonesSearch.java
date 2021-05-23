package com.Netcore.testscripts;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Netcore.generic.BaseClass;
import com.Netcore.objectrepo.HomePage;
import com.opencsv.CSVWriter;
public class IphonesSearch extends BaseClass
{
@Test
public void iphonessearch() throws IOException
{
	HomePage hp=new HomePage(driver);
	hp.getLoginpopup().click();
	WebElement srchbox = hp.getSearchbox();
	srchbox.sendKeys("iphones below 40000");
	hp.getSearchbutton().click();
	hp.getSort().click();
	List<WebElement> devicelist = hp.getModel();
    List<WebElement> pricelist = hp.getPrice();
    List<WebElement> ratingslist = hp.getRating();
    
    String[] header = {"Device Details","Price","Ratings"};
	List<String[]> list = new ArrayList<String[]>();
	list.add(0,header);
	for(int i=0;i<devicelist.size();i++)
	{
		String[] row1 = {devicelist.get(i).getText(),pricelist.get(i).getText().substring(1),ratingslist.get(i).getText()};
		list.add(i, row1);
	}
	CSVWriter writecsv = new CSVWriter(new FileWriter("../Netcore/Testoutput/Iphones.csv"));
	writecsv.writeAll(list);
	writecsv.close();
	driver.close();
	
}

}
