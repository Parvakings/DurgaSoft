package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility 
{

	public static WebDriver driver=null;
	public static Properties p;
	
	public static void init() throws Exception {
		    System.out.println("Init Entering");
		    FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//newProperty.properties");
		    p = new Properties();
		    p.load(fs);
		    System.out.println("File Loadeed");
	}
	
	public static void launch(String browser) 
	{
		System.out.println("Entering Launch");
		System.out.println(p.getProperty(browser));
		 if(p.getProperty(browser).equals("chrome"))
			{
				System.out.println(p.getProperty(browser));
				//System.setProperty("webdriver.chrome.driver", "E://Drivers//Chrome//chromedriver.exe/");
				 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
				 driver= new ChromeDriver();
				
			}
		 
		
	
	}
	public static void url(String url)
	{
		System.out.println(p.getProperty(url));
		    driver.get(p.getProperty(url));
	}
}
