package com.Netcore.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	protected WebDriver driver;
	FileUtility fu=  new FileUtility();
	WebDriverUtility wdu= new WebDriverUtility();

	/**
	 * Launch the browser
	 * throws IO exception
	 */
	@BeforeClass
	public void launchBrowser() throws IOException {

		String BROWSER=fu.readDatafromPropFile(IConstants.propfilepath, "browser");

		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			//driver= new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("ie")) {
			driver= new InternetExplorerDriver();
		}
		wdu.maximizeWindow(driver);
		wdu.implicitwait(driver);
		driver.get(fu.readDatafromPropFile(IConstants.propfilepath, "url"));
	}

}
