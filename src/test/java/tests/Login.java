
package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.Driver;

import java.sql.SQLOutput;


public class Login extends TestBase {

    @Test(description = "Verifying the title of the webpage")
    public void testTitle(){
      System.out.println(Driver.get().getTitle());

        String expectedTitle = "My Store";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle,"");

        BrowserUtils.wait(3);
    }

//    @Test(priority = 1, groups = {"sanity","regression", "smoke"})
//    public void testZero (){
//        System.out.println("Test 1");
//    }
//
//    @Test(priority = 2 , dependsOnMethods = {"testTwo"}, alwaysRun = true) //Can we use more than one test method?
//    public void testOne (){
//        System.out.println("Test 2");
//    }
//
//    @Test(priority = 3)
//    public void testTwo(){
//        System.out.println("Test 3");
//    }
//
//    @Test(priority = 4, enabled = false)
//    public void testThree (){
//        System.out.println("Test 4");
//    }

    /*
    * Test Case: User should verify that Logo is displayed.              ||  Feature: Main Page
    *            User open Chrome browser and enter the URL              ||  Background: user is on the landing page
    *            User should land on the main page.                      ||  Given user on the home page
    *            User should verify that logo is displayed on the left,  ||  User should verify that logo is displayed.
    *            search box in the middle,
    *            and Cart on the right below the navigation menu.
    *
    * We want to be sure that the element (Logo, search box and the cart) is visible to user.
    * Because, element can be present but not visible to user.
    * If there is no element with this locator, we will get NoSuchElementException.
    * and our program would stop pn the find element line.
    * If the element is there but not visible, we would get the message.
    * */
 //   @Test(description = "Verify that Logo is displayed")
    public void TestLogo(){
        WebElement logo = Driver.get().findElement(By.cssSelector(".logo.img-responsive"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
    }
}
