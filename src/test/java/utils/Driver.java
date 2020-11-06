package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    //Only one private static instance
    private static WebDriver driver;
    private Driver(){

    }

    public static WebDriver get(){

      if (driver==null){
          String browser = ConfigurationReader.getProperty("browser");
          switch (browser){
              case "chrome":
                  WebDriverManager.chromedriver().setup();
                  driver = new ChromeDriver();
                  break;
              case "firefox":
                  WebDriverManager.firefoxdriver().setup();
                  driver = new FirefoxDriver();
                  break;
              default:
                  //if browser type is wrong, throw and exception showing us browser will not be openned.
                  throw new RuntimeException("Wrong browser type!");
          }
      }
      return driver;
    }


    public static void close(){
        //if driver still exists, close all browsers
        if (driver!=null){
            driver.quit();
       //and destroy driver object.
            driver=null;
        }
    }

}
