package com.blaze.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.blaze.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{
		switch(browser.toLowerCase()){
			case "chrome":
				WebDriverManager.chromedriver().setup();
		    	driver = new ChromeDriver();		
			  break;
			 default:
			driver = null ;
			break;
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
