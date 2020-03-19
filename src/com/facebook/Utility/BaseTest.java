package com.facebook.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	  public static WebDriver dr;
	  public static File src;
	  public static FileInputStream fi;
	  public static Properties po;
	  
	  @BeforeMethod
	  public void init() throws Exception
	  {
		  openbrowser();
	  }
	  
	  private void openbrowser() throws Exception {
			readPropertyFile();
			if(po.getProperty("BROWSER").equalsIgnoreCase("CHROME"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//lib//chromedriver.exe");
				dr = new ChromeDriver();
			}
			else if(po.getProperty("BROWSER").equalsIgnoreCase("FIREFOX"))
			{
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "//lib//geckodriver.exe");
				dr = new FirefoxDriver();
			}
			dr.manage().window().maximize();
			dr.get(po.getProperty("URL"));
		}

	private void readPropertyFile() throws Exception {
		
		src = new File(System.getProperty("user.dir")+ "//src//OR.properties");
		fi = new FileInputStream(src);
		po = new Properties();
		po.load(fi);
		
	}
	
	@AfterMethod
    public void afterMethod() {
	 dr.quit();
    }
}

