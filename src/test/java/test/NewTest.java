package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\Desktop\\Ethans\\chromedriver_win32\\chromedriver.exe");

      WebDriver driver=new ChromeDriver();
      
      driver.get("https://www.google.com/");
      
      Thread.sleep(5000);
      driver.quit();
  }
}
