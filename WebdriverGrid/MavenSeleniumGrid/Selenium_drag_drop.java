package MavenSeleniumGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium_drag_drop {

	  public static WebDriver driver;
	@BeforeClass 
	public void open() 
	{
		  
	  
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
     driver=new ChromeDriver();
     
     driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  }
	@Test
	public void drag() throws InterruptedException
	{
	
     
     Thread.sleep(2000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,1000)");
     System.out.println("from.getText()");
     //WebElement on which drag and drop operation needs to be performed  
     WebElement from = driver.findElement(By.xpath("//*[@id='sourceImage']"));  
     
     
     
    System.out.println(from.getText());

     //WebElement to which the above object is dropped  
     WebElement to = driver.findElement(By.xpath("//*[@id='targetDiv']"));  
        
     //Creating object of Actions class to build composite actions  
     Actions act = new Actions(driver);  
        
     //Performing the drag and drop action  
     act.dragAndDrop(from,to).build().perform();  
     act.build();
     
	  }
	
	
	@AfterClass
	public void after()
	{
		
	}
	}
