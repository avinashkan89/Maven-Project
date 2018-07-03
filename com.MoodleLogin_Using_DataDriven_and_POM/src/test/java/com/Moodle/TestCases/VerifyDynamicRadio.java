package com.Moodle.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Library.BrowserFactory;



public class VerifyDynamicRadio{
	
	@Test

	public void Test() throws InterruptedException
	{
		
		WebDriver driver=BrowserFactory.initiateBrowser("chrome", "http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> element=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for(WebElement ele:element)
		{
			String val=ele.getAttribute("value");
			System.out.println(val);
			
			if(val.equalsIgnoreCase("PYTHON"))
			{
				ele.click();
				Thread.sleep(5000);
				break;
				
			}
		}
		driver.quit();
		
	}

}
