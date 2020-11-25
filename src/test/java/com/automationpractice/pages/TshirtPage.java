package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

public class TshirtPage extends HomePage {


    @FindBy(xpath = "//span[@class='cat-name']")
    public WebElement Tshirtlabel;

    @FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']")
    public WebElement sleeveTshirt;

    public void tshirtlabelcontrol() throws InterruptedException {
        if (Tshirtlabel.isDisplayed()){
            Thread.sleep(5000);
            System.out.println("tshirt goruldu");
        }

    }
    public void clickAddChart() throws InterruptedException {
        Thread.sleep(5000);
        sleeveTshirt.click();
        Thread.sleep(3000);
    }
}


