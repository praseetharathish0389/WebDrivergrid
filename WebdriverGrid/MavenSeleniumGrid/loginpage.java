package MavenSeleniumGrid;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class loginpage {
	
	public static WebDriver driver;

	 static Logger logger = Logger.getLogger(loginpage.class);
	
	@BeforeMethod
	public void openurl() {
		   
		  
	       //Created object of ATUTestRecorder
	       //Provide path to store videos and file name format.
	      // recorder = new ATUTestRecorder("P:\\Curie_Automation\\WebdriverGrid\\ScriptVideos\\","TestVideo-"+dateFormat.format(date),false);
	       //To start video recording.
	     //  recorder.start();  	
		
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();     
	      //String log4JPropertyFile = "P:\\Curie_Automation\\WebdriverGrid\\log4j.properties";
	      Properties p = new Properties();

	      PropertyConfigurator.configure(p);
	    
	       
	       driver.get("https://curiedoctorapp.firebaseapp.com/#/app/login");
	}

	  @Test
	  public void login()throws Exception 
	   {
		  
		  driver.findElement(By.id("username")).sendKeys("senthil@gmail.com");	
		  logger.info("");
		  driver.findElement(By.id("password")).sendKeys("senthil");
		  driver.findElement(By.id("signin")).click();		  
		  logger.info("Doctor sign In successfully");
		  //driver.findElements(By.id("Testing and finding the value"));
		  
		  
		  
		  
		  
		  
}
	  
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
		  //driver.close();
		 // recorder.stop();
	    
}
}

