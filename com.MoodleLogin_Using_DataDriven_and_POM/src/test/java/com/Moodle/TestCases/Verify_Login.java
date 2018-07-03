package com.Moodle.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Moodle.Pages.Login;

import Library.BrowserFactory;

public class Verify_Login {
	
	
	@Test
	public void MoodleLogin() throws Exception
	{
		WebDriver driver=BrowserFactory.initiateBrowser("chrome", "https://qa.moodle.net/login/index.php");
		
		Login page=PageFactory.initElements(driver, Login.class);
		page.GetData();
		driver.quit();
	}

}
