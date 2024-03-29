package com.Netcore.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	/**
	 * @author Madhav
	 * Read the data from Property file
	 * @param path of property file
	 * @param Pass Key for which u want to read data
	 * @return value
	 * @throws IOException
	 */
	public String readDatafromPropFile(String path,String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
}
