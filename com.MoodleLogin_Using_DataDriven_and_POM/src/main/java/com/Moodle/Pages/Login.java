package com.Moodle.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeTest;

import Library.ExcelDataConfig;


public class Login {
	
	/*WebDriver driver;
	
	public Login(WebDriver ldriver)
	{
		this.driver=ldriver;
	}*/

	
	@FindBy(how=How.ID,using="username") WebElement username;
	@FindBy(how=How.NAME,using="password") WebElement password;
	@FindBy(how=How.XPATH,using="//button[@id='loginbtn']") WebElement clicklogin;
	
	
	@BeforeTest
	public void GetData() throws Exception
	{
		//C:\\Users\\ab66949\\Desktop\\DataDriven.xlsx
		/*File src=new File("C:\\Users\\ab66949\\Desktop\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		String user=sheet.getRow(1).getCell(0).getStringCellValue();
		String pass=sheet.getRow(1).getCell(1).getStringCellValue();
		wb.close();	
		username.sendKeys(user);
		password.sendKeys(pass);
		clicklogin.click();
		Thread.sleep(5000);*/
		
		ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\ab66949\\Desktop\\DataDriven.xlsx");

		String user=config.readdata(0, 1, 0);
		String pwd=config.readdata(0, 1, 1);
		username.sendKeys(user);
		password.sendKeys(pwd);
		clicklogin.click();
		Thread.sleep(5000);	
			
	}
	
}
