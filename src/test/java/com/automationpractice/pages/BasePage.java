package com.automationpractice.pages;
import org.openqa.selenium.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utils.Driver;

public class PageBase {

    @FindBy(id = "header_logo")
    public WebElement logo;
    public void BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    //First We need to test the logo with id
    @Test
    public void testLogo(){
        logo.isDisplayed();
    }
}
