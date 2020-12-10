package tests;

import com.automationpractice.pages.ContactPage;
import com.automationpractice.pages.HomePage;
import org.testng.annotations.Test;

public class ContactPageTest {
    @Test
    public void testContactUs(){
        HomePage homePage = new HomePage();
        homePage.clickContactUs();

        ContactPage contactPage = new ContactPage();
        contactPage.typeEmail();
        contactPage.typeOrderID();
        contactPage.attachFile();
        contactPage.typemessage();
        contactPage.sendButton();

    }

}
