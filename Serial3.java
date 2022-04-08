package serialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serial3 {
  @Test
  public void testing()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium Tool\\chromedriver_win32\\chromedriver.exe");	
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.google.co.in/");
 driver.manage().window().maximize();
  
  }
}
