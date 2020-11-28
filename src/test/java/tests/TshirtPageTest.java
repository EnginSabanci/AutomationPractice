package tests;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.TshirtPage;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class TshirtPageTest extends TestBase{
    @Test
    public void tshirtlabelisdisplayed() throws InterruptedException {
        //objects
        HomePage homePage=new HomePage();
        BrowserUtils browserUtils=new BrowserUtils();
        TshirtPage tshirtPage=new TshirtPage();

        homePage.clickTshirt();
        browserUtils.wait(1000);
        tshirtPage.tshirtlabelcontrol();
        tshirtPage.clickAddChart();





    }


}
