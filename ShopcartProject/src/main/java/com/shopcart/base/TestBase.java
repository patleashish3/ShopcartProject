package com.shopcart.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import com.shopcart.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	public TestBase() {
		
		log = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Maven Project\\ShopcartProject\\src\\main\\java\\com\\shopcart\\config\\config.properties");
			prop.load(ip);
		} catch (Exception e) {
		    }
		}
	
	public static void initialisation() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Maven Project\\ShopcartProject\\src\\main\\java\\com\\shopcart\\exedrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","‪C:\\Program Files\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		log.info("*******Maximizing The window******");
		driver.manage().window().maximize();
		
		log.info("******Waiting for Pageload*******");
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		log.info("******Implicit wait******");
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		log.info("*******Opening URL******");
		driver.get(prop.getProperty("url"));
		
	}

}
