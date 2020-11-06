package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigurationReader;
import utils.Driver;

public abstract class TestBase {


    @BeforeMethod
    public void setup(){
        //read url value from the properties file.
        String url = ConfigurationReader.getProperty("url");
        //Driver.get() method return WebDriver object and then the second get() method is WebDriver method
        Driver.get().get(url);
    }

    @AfterMethod
    public void teardown(){
        Driver.close();
    }

}
