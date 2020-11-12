package tests;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.WomenPage;
import org.testng.annotations.Test;

public class WomenPageTest extends TestBase {

    @Test
    public void test1(){
        WomenPage womenPage = new WomenPage();
        womenPage.testTitleWomenPage();

    }
}
