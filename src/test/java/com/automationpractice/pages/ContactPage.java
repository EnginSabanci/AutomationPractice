package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

public class ContactPage {

   //@FindBy(id = "id_contact")
   WebDriver driver = new ChromeDriver();
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsume\\IdeaProjects\\cb-testautomation-main\\java\\webdrivers.exe");
   WebElement subjectHeading = driver.findElement(By.id("id_contact"));
  //Select select = new Select(subjectHeading);

  //Select yy = new Select(driver.findElement(By.id("id_contact"‌​)));

   // select.("Customer service");

 //  Select drpHanding = new Select(driver.findElement(By.id("id_contact")));
 //  drpHanding.selectByVisibleText("Customer service")

    @FindBy(id ="email")
    public WebElement emailAddress;

    @FindBy(id= "id_order")
    public WebElement orderReference;

    @FindBy(xpath = "//div[@id='uniform-fileUpload']/span[2]")
    public WebElement attachFile;

    @FindBy(id= "message")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span/i")
    public WebElement sendButton;



    public void typeEmail(){
        emailAddress.sendKeys("codingbook@gmail.com");
    }
    public void typeOrderID(){
        orderReference.sendKeys("45");
    }
    public void attachFile(){
        attachFile.click();
    }
    public void typemessage(){
        messageBox.sendKeys("Hi");
    }
    public void sendButton(){
        sendButton.click();
    }






}
