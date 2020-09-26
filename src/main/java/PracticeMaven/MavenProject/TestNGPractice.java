package PracticeMaven.MavenProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataProvider.ConfigFileReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGPractice {
	
	ConfigFileReader fileReader;
	WebDriver driver;
	
	public void Home_Page()
	{
	
	fileReader =new ConfigFileReader();
	System.setProperty("webdriver.chrome.driver",fileReader.getDriverPath());
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	
	
	
	
}

}