package elementsTest;

import Pages.HomePage;
import Pages.elements.ElementsPage;
import Pages.elements.TextBoxPage;
import Utils.Utils;
import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static base.TestData.*;

public class ElementsTest extends BaseTest {

    @Test
    @DisplayName("")
    public void testTextBoxPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ElementsPage elementsPage = new ElementsPage(driver);
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        Utils utils = new Utils(driver);
        utils.waitForXMillis(20);
        utils.clickGoogleAds(driver);
        homePage.clickElementsPage();
        elementsPage.clickTextBoxPage();
        textBoxPage.writeOnFullName(testDataFullName);
        textBoxPage.writeOnEmail(testDataEmail);
        textBoxPage.writeOnCurrentAddress(testDataCurrentAddress);
        textBoxPage.writeOnPermanentAddress(testDataPermanentAddress);
        utils.scrollDown(driver);
        textBoxPage.clickSubmitButton();
    }
}
