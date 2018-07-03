package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver initiateBrowser(String BrowserName,String url)
	{
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Apps\\Selenium related installation files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();		
			
		}
		else if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("geckodriver.exe", "C:\\Apps\\Selenium related installation files\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
			
			
		}
		else if(BrowserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("internetexplorerdriver.exe", "C:\\Apps\\Selenium related installation files\\chromedriver_win32\\chromedriver.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
		//test comment
		
		
		
	}
	
	

}
