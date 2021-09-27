package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser extends Utility {

	public static void main(String[] args) throws Exception
	{
		
/*		System.setProperty("webdriver.chrome.driver", "E://Drivers//Chrome//chromedriver.exe/");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://amazon.com/");
	*/	
		init();
		
		
		launch("chromebrowser");
		
		 url("url");
			
		

	}

}
