package MavenSeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
	
	
		
  @Test
  public void test() throws MalformedURLException {
	  
	 
 
/*  DesiredCapabilities cap=DesiredCapabilities.chrome();
  cap.setPlatform(Platform.WINDOWS);
  URL url=new URL("http://localhost:4444/wd/hub");*/
  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");  
  WebDriver driver=new ChromeDriver();
 // WebDriver driver=new RemoteWebDriver(url,cap);
  driver.manage().window().maximize(); 
  driver.get("https://curiedoctorapp.firebaseapp.com");
  System.out.println("The title is"+ driver.getTitle());
  driver.quit();
  
  }
}
