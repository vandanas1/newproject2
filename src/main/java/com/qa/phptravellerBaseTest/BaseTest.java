package com.qa.phptravellerBaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.PHPTraveller.util.WaitVariables;

public class BaseTest {
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseTest() throws FileNotFoundException {
		 prop = new Properties();
		 FileInputStream fi= new FileInputStream("C:\\Users\\Mukeshwar Singh\\workspace\\Practice\\PHPTest\\src\\"
		 		+ "main\\java\\com\\qa\\PHPTraveller\\configuration\\config.properties"); 
		 try {
			prop.load(fi);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = "FF";
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "F:\\webDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver","F:\\webDriver\\FF");
				driver=new FirefoxDriver();
				
			}
			else{
				System.out.println("driver is not present");	
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(WaitVariables.implicit_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(WaitVariables.pageload_timeout, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	

}
