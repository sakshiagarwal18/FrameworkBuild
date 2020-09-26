package PracticeMaven.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	System.out.println("success");
	
	}

}
