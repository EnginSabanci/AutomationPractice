package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.ConfigurationReader;
import utils.Driver;

public abstract class TestBase {

    protected ExtentReports extentReports;
    //ExtentHtmlreporter creates a rich standalone HTML file
    protected ExtentHtmlReporter extentHtmlReporter;
    //Define a test. You add logs, snapshots, assign author and categories to the test. Report is regression, smoke or functional test and module of the test.
    protected ExtentTest extentTest;

    @BeforeTest
    public void beforeTest(){
        String filePath = System.getProperty("user.dir") + "test - output/report.html";
        extentReports = new ExtentReports();
        extentHtmlReporter = new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setReportName("Automation Practice");
        //system information

        extentReports.setSystemInfo( "Environment", "QA");
        extentReports.setSystemInfo("Browser",ConfigurationReader.getProperty("browser") );
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));

    }


    @BeforeTest
    public void setup(){
        //read url value from the properties file.
        String url = ConfigurationReader.getProperty("url");
        //Driver.get() method return WebDriver object and then the second get() method is WebDriver method
        Driver.get().get(url);
    }



        }
    }

}
