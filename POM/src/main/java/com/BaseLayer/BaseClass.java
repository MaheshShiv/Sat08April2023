package com.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties prop;
	
	public BaseClass() {
		
		prop = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\ConfigLayer\\config.properties");
			prop.load(fis);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		public static void init(String browser)
		{
			if(prop.getProperty(browser).equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
			}
			else if(prop.getProperty(browser).equals("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}
		
		public static void navigateUrl(String url) {
			
		driver.get(prop.getProperty(url));
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

	}
	}
