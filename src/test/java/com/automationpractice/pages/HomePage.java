package com.automationpractice.pages;
//import org.openqa.selenium.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
import utils.Driver;

public class HomePage {

    @FindBy(xpath = "//div[@id='header_logo']/a/img")
    public WebElement logo;

    @FindBy(id="search_query_top")
    public WebElement searchBox;

    @FindBy(className = "shopping_cart")
    public WebElement cart;

    @FindBy(className = "login")
    public WebElement login;

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

    public void login(){
        login.isDisplayed();
    }
}
