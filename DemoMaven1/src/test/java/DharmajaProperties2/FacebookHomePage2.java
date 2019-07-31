 package DharmajaProperties2;

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

public class FacebookHomePage2 {
	
   
    WebDriver driver ; 
    
     String  FBLogoutMenuInvoke,FBLogout;
	  
	  
	 public  FacebookHomePage2(WebDriver driver) throws IOException
	 {
		  this.driver=driver;
		  
		  File src= new File("C:\\Users\\sudhakar\\Desktop\\application.properties");
		  FileInputStream fis = new FileInputStream(src);
		  Properties prop = new Properties(); 
		  prop.load(fis);
		  
		  FBLogoutMenuInvoke = prop.getProperty("FBLogoutMenuInvoke");
		  FBLogout = prop.getProperty("FBLogout");
		  
		 
		 
		  
	 }
    
    public void LogoutFaceBook()
    {
    	
    	
    	 
    	driver.findElement(By.xpath(FBLogoutMenuInvoke)).click();
    	
    	
         try 
         {
 			Thread.sleep(5000);
 		 } 
         catch (InterruptedException e) 
         {
 			e.printStackTrace(); 
 		 }
         
         
        
         driver.findElement(By.xpath(FBLogout)).click();
         
         
         
    	
    }
    

}
