package sudha5;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;

public class mercury {
	
    public static String baseUrl = "http://newtours.demoaut.com/";
    public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    public static WebDriver driver ; 

  @Test
  public static void allMethods()throws Exception
  {
	  mercury.openBrowser();
	  mercury.signinpage();
  }
  public static void signinpage()throws Exception
  {
	  driver.findElement(By.xpath(OR.username_text)).sendKeys("mercury");
	  driver.findElement(By.xpath(OR.password_text)).sendKeys("mercury");
	  driver.findElement(By.xpath(OR.signin_click)).click();

	      }
  	  
  public static void openBrowser()throws Exception
  {
	  ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver",driverPath);
		 driver =new ChromeDriver(options);
		 driver.get(baseUrl);
		 OR.driver=driver;
	 	 driver.manage().window().maximize() ;
	 	 
  }
  public static void wait5seconds()throws Exception
  {
	  
  

	  try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
  }
	  	 
 	 
	
 
 	 
  

  
  

}
