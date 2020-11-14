package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class WomenPage {

    // How can I reach parent from child
    @FindBy(xpath = "//div[@id='categories_block_left']/h2")
    public WebElement titleWomenPage;

    public WomenPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=4&controller=category")
    WebElement tops;
    @FindBy(linkText = " http://automationpractice.com/index.php?id_category=8&controller=category")
    WebElement dresses;
    @FindBy(xpath = "//div[@id='layered_block_left']/p")
    WebElement catalog;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#categories-tops")
    WebElement categoriesTops;

    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#categories-dresses")
    WebElement categoriesDresses;

    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#size-s")
    WebElement sizeSmall;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#size-m")
    WebElement sizeMedium;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#size-l")
    WebElement sizeLarge;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#color-beige")
    WebElement colorBeige;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#color-black")
    WebElement colorBlack;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#color-blue")
    WebElement colorBlue;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#color-yellow")
    WebElement colorYellow;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#color-white")
    WebElement colorWhite;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#color-orange")
    WebElement colorOrange;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#color-green")
    WebElement colorGreen;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#color-pink")
    WebElement colorPink;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#compositions-cotton")
    WebElement compositionsCotton;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#compositions-viscose")
    WebElement compositionsViscose;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#compositions-polyester")
    WebElement compositionsPolyester;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#styles-casual")
    WebElement stylesCasual;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#styles-casual")
    WebElement stylesGirly;
    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=3&controller=category#styles-casual")
    WebElement stylesDressy;






    public void testTitleWomenPage(){
        titleWomenPage.isDisplayed();
    }
    public void testTops(){
        tops.isDisplayed();
    }
    public void testDresses(){
        dresses.isDisplayed();
    }
    public void testCatalog(){
        catalog.isDisplayed();

    }
    public void testCatalogText(){
        System.out.println(catalog.getText());
    }
    public void testCategoriesTops(){
        categoriesTops.isDisplayed();
    }
    public void testCategoriesDresses(){
        categoriesDresses.isDisplayed();
    }
    public void testSizeSmall(){
        sizeSmall.isDisplayed();
    }
    public void testSizeMedium(){
        sizeMedium.isDisplayed();
    }
    public void testSizeLarge(){
        sizeLarge.isDisplayed();
    }
    public void testColorBlack(){
        colorBlack.isDisplayed();
    }
    public void testColorBlue(){
        colorBlue.isDisplayed();
    }
    public void testColorYellow(){
        colorYellow.isDisplayed();
    }
    public void testColorWhite(){
        colorWhite.isDisplayed();
    }
    public void testColorOrange(){
        colorOrange.isDisplayed();
    }
    public void testColorGreen(){
        colorBeige.isDisplayed();
    }
    public void testColorPink(){
        colorBeige.isDisplayed();
    }

    public void testCompositionsCotton(){
        compositionsCotton.isDisplayed();
    }
    public void testCompositionsViscose(){
        compositionsViscose.isDisplayed();
    }
    public void testCompositionsPolyester(){
        compositionsPolyester.isDisplayed();
    }
    public void testStylesCasual(){
        stylesCasual.isDisplayed();
    }
    public void testStylesGirly(){
        stylesGirly.isDisplayed();
    }
    public void testStylesDressy(){
        stylesDressy.isDisplayed();
    }








}
