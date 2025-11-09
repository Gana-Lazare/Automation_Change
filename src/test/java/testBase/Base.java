package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterTest;

public class Base {
 public WebDriver driver= null;

 public static  Base base = new Base();
 public  void initDriver(){
  WebDriverManager.chromedriver().setup();
  this.driver = new ChromeDriver();
 }
 @AfterTest
public void tearDown(){
  driver.quit();
}

}
