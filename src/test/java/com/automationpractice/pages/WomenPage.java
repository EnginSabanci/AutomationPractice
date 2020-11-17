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

    @FindBy(xpath = "//*[@id=\"informations_block_left_1\"]/p/a")
        WebElement infoHeading;
    @FindBy(xpath = "//*[@id=\"informations_block_left_1\"]/div/ul/li[1]/a")
        WebElement delivery;
    @FindBy(xpath =" //a[@title='Legal Notice']")
        WebElement legalNotice;
    @FindBy(css = "#informations_block_left_1 > div > ul > li:nth-child(3) > a")
        WebElement terms;
    @FindBy(xpath = "//*[@id=\"informations_block_left_1\"]/div/ul/li[4]/a")
        WebElement aboutUs;
    @FindBy(xpath = "//*[@id=\"informations_block_left_1\"]/div/ul/li[5]/a")
        WebElement securePayment;
    @FindBy(xpath = "//*[@id=\"informations_block_left_1\"]/div/ul/li[6]/a")
        WebElement ourStores;
    @FindBy(xpath = "//div[@id=\"manufacturers_block_left\"]/p/a")
        WebElement manufacturers;
    @FindBy(xpath = "//div[@id=\"manufacturers_block_left\"]/div/ul/li/a")
        WebElement fashionManufacturers;
    @FindBy(xpath = "//*[@id=\"manufacturers_block_left\"]/div/form/div/div/select")
        WebElement selectManufacturer;
    @FindBy(css = "#special_block_right > p > a")
        WebElement specials;

    @FindBy(css = "#special_block_right > div > ul > li > div > h5 > a")
        WebElement printedChiffonDress;
    @FindBy(xpath = "//*[@id=\"special_block_right\"]/div/ul/li/div/p")
        WebElement productDescription;
    @FindBy(css = "#special_block_right > div > ul > li > a > img")
        WebElement getPrintedChiffonDress;
    @FindBy(xpath = "//*[@id=\"special_block_right\"]/div/div/a/span")
        WebElement allSpecials;
    @FindBy(css = "#stores_block_left > p > a")
        WebElement getOurStores;
    @FindBy(css = "#stores_block_left > div > p > a > img")
        WebElement getOurStoresImage;
    @FindBy(xpath = "//*[@id=\"stores_block_left\"]/div/div/a/span")
        WebElement discoverOurStores;
    @FindBy(css = "#suppliers_block_left > p > a")
        WebElement suppliers;
    @FindBy(xpath = "//*[@id=\"suppliers_block_left\"]/div/ul/li/a")
        WebElement fashionSuppliers;
    @FindBy(css = "#suppliers_block_left > div > form > div > div > select")
        WebElement selectSupplier;
    @FindBy(xpath = "//*[@id=\"viewed-products_block_left\"]/p")
        WebElement viewedProducts;











    public void testTitleWomenPage(){
        titleWomenPage.isDisplayed();
    }
    public void testTops(){
        tops.isDisplayed();
    }
    public void testDresses(){
        dresses.isDisplayed();
    }
    public void testCatalog(){ catalog.isDisplayed(); }
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



    public void testInfoHeading() {
        infoHeading.isDisplayed();
    }
    public void testDelivery() {
        delivery.isDisplayed();
    }
    public void testLegalNotice() {
        legalNotice.isDisplayed();
    }
    public void testTerms(){
        terms.isDisplayed();
    }
    public void testAboutUs(){
        aboutUs.isDisplayed();
    }
    public void testSecurePayment(){
        securePayment.isDisplayed();
    }
    public void testOurStores(){
        ourStores.isDisplayed();
    }
    public void testManufacturers(){
        manufacturers.isDisplayed();
    }
    public void testFashionManufacturers(){
        fashionManufacturers.isDisplayed();
    }
    public void testSelectManufacturer(){
        selectManufacturer.isDisplayed();
    }
    public void testSpecials(){
        specials.isDisplayed();
    }
    public void testPrintedChiffonDress(){
        printedChiffonDress.isDisplayed();
    }
    public void testProductDescription(){
        productDescription.isDisplayed();
    }
    public void testGetPrintedChiffonDress(){
        getPrintedChiffonDress.isDisplayed();
    }
    public void testAllSpecials(){
        allSpecials.isDisplayed();
    }
    public void testGetOurStores(){
        getOurStores.isDisplayed();
    }
    public void testGetOurStoresImage(){
        getOurStoresImage.isDisplayed();
    }
    public void testDiscoverOurstores(){
        discoverOurStores.isDisplayed();
    }
    public void testSuppliers(){
        suppliers.isDisplayed();
    }
    public void testFashionSuppliers(){
        fashionSuppliers.isDisplayed();
    }
    public void testSelectSupplier(){
        selectSupplier.isDisplayed();
    }
    public void testViewedProducts(){
        viewedProducts.isDisplayed();
    }













}
