package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage {

    @FindBy(xpath = "//div[@id='header_logo']/a/img")
    public WebElement logo;

    @FindBy(id="search_query_top")
    public WebElement searchBox;

    @FindBy(className = "shopping_cart")
    public WebElement cart;

    @FindBy(xpath = "//input[@id='layered_category_4'")
    public WebElement top2;
//    How can i reach parent from child
//    @FindBy(xpath = "//div[@id='categories_block_left']/h2")
//    WebElement titleWomenPAge;

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    //First We need to test the logo with id
    public void testLogo(){
        logo.isDisplayed();
        System.out.println("Logo is displayed");
    }

    public void testSearchBox() {
        searchBox.isDisplayed();
    }

    public void cart(){
        cart.isDisplayed();
    }

    public void top2() {
        searchBox.isDisplayed();
        System.out.println("Top2 is displayed");
    }

//    public void womenPage() {
//        PageFactory.initElements(Driver.get(), this);
//    }


}
