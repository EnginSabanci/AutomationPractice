package tests;


import com.automationpractice.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        //create a page object

        homePage.testLogo();
}
}
