package tests;

import com.automationpractice.pages.TshirtPage;
import org.testng.annotations.Test;

public class TshirtPageTest extends TestBase{
    @Test(dependsOnMethods="HomePageTest.test1")
    public void tshirtlabelisdisplayed() throws InterruptedException {
        TshirtPage tshirtPage=new TshirtPage();

        tshirtPage.tshirtlabelcontrol();



    }


}
