package tests;


import com.automationpractice.pages.BasePage;
import org.testng.annotations.Test;

public class MainPageTests extends TestBase {

    @Test
    public void test1(){
        BasePage basePage = new BasePage();
        //create a page object

        basePage.testLogo();
}
}
