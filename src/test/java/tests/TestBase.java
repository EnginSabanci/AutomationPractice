package tests;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import utils.BrowserUtils;

import utils.ConfigurationReader;
import utils.Driver;

import java.io.IOException;

public abstract class TestBase {
    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    //Define a test you add logs snapshots assign autor  and categories to test report is regression smoke or functional test and module of test
    protected static ExtentTest extentTest;

    @BeforeTest
    public void beforeTest(){

        String filePath=System.getProperty("user.dir")+"test-out/report.html";
        extentReports=new ExtentReports();
        extentHtmlReporter=new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setReportName("AUTOMATION Practice");
        //system information
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser",ConfigurationReader.getProperty("browser"));
        extentReports.setSystemInfo("OS",System.getProperty("os.name"));
    }



    
    @BeforeTest
    public void setup(){
        //read url value from the properties file.

        String url = ConfigurationReader.getProperty("url");
        //String url = ConfigurationReader.getProperty("url");
        //Driver.get() method return WebDriver object and then the second get() method is WebDriver method
        Driver.get().get(url);
    }

    @AfterMethod
    public void teardown(ITestResult result) {
        //last comment
        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.fail(result.getName());
            extentTest.fail(result.getThrowable());
            try {
                extentTest.addScreenCaptureFromPath(BrowserUtils.getScreenShot(result.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(result.getStatus()==ITestResult.SKIP)
            {
                extentTest.skip("Test case was skipped: " + result.getName());
            }
        }

        Driver.close();
    }
}

