package DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	public Properties properties;
	String Filepath = "configs//Configuration.properties";
	
public ConfigFileReader()
{
	BufferedReader reader;
	try {
		reader=new BufferedReader(new FileReader(Filepath));
		properties=new Properties();
		properties.load(reader);
		reader.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	
	public String getDriverPath()
	{
		String driverpath=properties.getProperty("driverpath");
		if(driverpath!=null)
			return driverpath;
		else
			throw new RuntimeException("driverpath not found");
		}
	
	public String getURL()
	{
		String url=properties.getProperty("url");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("URL not specified");
}
}
