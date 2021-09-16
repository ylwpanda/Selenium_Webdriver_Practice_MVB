package Pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {

    private WebDriver driver;
    private final By FULL_NAME_FIELD = By.xpath("//*[@id=\"userName\"]");
    private final By EMAIL_FIELD = By.xpath("//*[@id=\"userEmail\"]");
    private final By CURRENT_ADDRESS_FIELD = By.xpath("//*[@id=\"currentAddress\"]");
    private final By PERMANENT_ADDRESS_FIELD = By.xpath("//*[@id=\"permanentAddress\"]");
    private final By SUBMIT_BUTTON = By.xpath("//*[@id=\"submit\"]");


    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }


    public void writeOnFullName(String testDataFullName) {
        driver.findElement(FULL_NAME_FIELD).sendKeys(testDataFullName);
    }

    public void writeOnEmail(String testDataEmail){
        driver.findElement(EMAIL_FIELD).sendKeys(testDataEmail);
    }

    public void writeOnCurrentAddress(String testDataCurrentAddress){
        driver.findElement(CURRENT_ADDRESS_FIELD).sendKeys(testDataCurrentAddress);
    }

    public void writeOnPermanentAddress(String testDataPermanentAddress){
        driver.findElement(PERMANENT_ADDRESS_FIELD).sendKeys(testDataPermanentAddress);
    }

    public void clickSubmitButton(){
        driver.findElement(SUBMIT_BUTTON).click();
    }

}
