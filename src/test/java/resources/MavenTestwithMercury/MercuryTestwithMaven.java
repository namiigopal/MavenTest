package resources.MavenTestwithMercury;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MercuryTestwithMaven 
{
	public WebDriver driver;
  @Test(priority=1)
  public void l1() 
  {
	  System.out.println("In loginwithValidUser1 method under Test1 ");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap1");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  WebDriverWait wait=new WebDriverWait(driver, 15);
	  boolean flag=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	  System.out.println("Flight finder image is displayed for User1 ");
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  System.out.println("User1 is able to login into Mercurytours succesfully");
	 
  }
  @Test(priority=2)
  public void l2()
  {
	  System.out.println("In loginwithValidUser2 method under Test2");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap2");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword2");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  WebDriverWait wait=new WebDriverWait(driver, 15);
	  boolean flag=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	  System.out.println("Flight finder image is displayed for User2 ");
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  System.out.println("User2 is able to login into Mercurytours succesfully");
	 
	  
	  
  }
  @Test(priority=3)
  public void l3()
  {
 	  System.out.println("login with valid user3");
 	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap0");
 	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword0");
 	  driver.findElement(By.xpath("//input[@name='login']")).click();
 	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  System.out.println("User3 is able to login into Mercurytours succesfully");
	 
 	  
 	  
  }

  @BeforeMethod
  public void addCookies()
  {
	  driver.manage().getCookies();
  }

  @AfterMethod
  public void capturedScreenshot() throws IOException 
  {
	  System.out.println("In captureScreenshot method under AfterMethod");
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFileToDirectory(src, new File("C:\\Users\\lenovo\\workspace\\MavenTestwithMercury\\src\\test\\resources\\screenshot\\"));
	  System.out.println("screenshot successfully done");
	 
  }

  @BeforeClass
  public void maximizeBrowser() 
  {
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void deleteAllcookies()
  {
	  driver.manage().deleteAllCookies();
  }

  @BeforeTest
  public void enterApplicationURL() 
  {
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
  }

  @AfterTest
  public void dbConnectionclosed() 
  {
	  System.out.println("close db connection");
  }

  @BeforeSuite
  public void openBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium setup\\chromedriver_win32 (16)\\chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterSuite
  public void closeBrowser() 
  {
	  driver.close();
	  System.out.println("chrome browser close");
  }

}
