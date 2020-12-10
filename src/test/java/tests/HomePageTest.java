package tests;


import com.automationpractice.pages.ContactPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.TshirtPage;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {



    @Test(groups={"cls1","other"})
    public void test1() throws InterruptedException {
        extentTest=extentReports.createTest("verifying test logo  and cart");
        HomePage homePage = new HomePage();
        TshirtPage tshirtPage=new TshirtPage();
        //create a page object.
        //use testLogo() method in HomePage class.
        homePage.testLogo();
        homePage.testSearchBox();
        homePage.cart();
        extentTest.pass("verified logo is displayed");
     }


    @Test(groups={"cls1","other"}, dependsOnMethods="test1",alwaysRun = true)
    public void tshirtpagetest() throws InterruptedException {
        TshirtPage tshirtPage=new TshirtPage();
        //tshirtPage.tshirtlabelcontrol();
        Thread.sleep(3000);
        tshirtPage.clickAddChart();

    }

}
 
