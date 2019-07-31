//import MercuryDemoTours;

package  MercuryDemoTours1;
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
 
public class MercuryLoginPage
{
	//public static WebDriver driver ; 
	
	@Test
	public static void Allmethods() throws Exception
	{
		 // create TC149_FB.xls in E:\Functional TestCases
		 Folders123.FolderCreation("TC149_FB");
		 CommonUtility.OpenBlankChromeBrowser();
		// driver=OR.driver;
		 
		 CommonUtility.OpenMercuryDemoToursURL();
		 MercuryLoginPage.MerucryLogin();
		 CommonUtility.CloseBrowser();
	}
	
	
	 
public static void MerucryLogin() throws Exception
{
	//driver=OR.driver;
	CommonUtility.driver.findElement(By.xpath(OR.MLPage_UserNameTextbox)).sendKeys("mercury");
	CommonUtility.driver.findElement(By.xpath(OR.MLPage_PasswordTextbox)).sendKeys("mercury");

	//Screenshot2
	CommonUtility.waitFor6Seconds();
	Folders123.takeSnapShot(OR.sTargetTestCaseExcelPath,OR.sTestCaseName,2,6,OR.sTargetFolderPath);
	
	CommonUtility.driver.findElement(By.xpath(OR.MLPage_SignInButton)).click();
	
}
			  	  
	
    
					  
	
}
