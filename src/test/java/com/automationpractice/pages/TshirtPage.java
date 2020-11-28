package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

public class TshirtPage extends HomePage {


    @FindBy(xpath = "//span[@class='cat-name']")
    public WebElement Tshirtlabel;

    @FindBy(xpath = "//a[@title='Add to cart']")
    public WebElement sleeveTshirt;

    public void tshirtlabelcontrol() throws InterruptedException {
        if (Tshirtlabel.isDisplayed()){

            System.out.println("tshirt goruldu");
        }

    }
    public void clickAddChart() throws InterruptedException {
        Thread.sleep(2000);

        sleeveTshirt.click();

    }
}


