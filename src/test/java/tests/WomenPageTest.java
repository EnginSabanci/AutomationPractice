package tests;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.WomenPage;
import org.testng.annotations.Test;

public class WomenPageTest extends TestBase {

    @Test
    public void test1(){
        WomenPage womenPage = new WomenPage();
        womenPage.testTitleWomenPage();
        womenPage.testTops();
        womenPage.testDresses();
        womenPage.testCatalog();
        womenPage.testCategoriesTops();
        womenPage.testCategoriesDresses();
        womenPage.testSizeSmall();
        womenPage.testSizeMedium();
        womenPage.testSizeLarge();
        womenPage.testColorBlack();
        womenPage.testColorBlue();
        womenPage.testColorGreen();
        womenPage.testColorOrange();
        womenPage.testColorPink();
        womenPage.testColorWhite();
        womenPage.testColorYellow();
        womenPage.testCompositionsCotton();
        womenPage.testCompositionsViscose();
        womenPage.testCompositionsPolyester();
        womenPage.testStylesCasual();
        womenPage.testStylesGirly();
        womenPage.testStylesDressy();
        womenPage.testCatalogText();

    }
}
