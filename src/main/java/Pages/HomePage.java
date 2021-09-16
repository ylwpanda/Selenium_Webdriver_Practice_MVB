package Pages;

import Pages.alfrwin.AlFrWinPage;
import Pages.bookstore.BookStorePage;
import Pages.elements.ElementsPage;
import Pages.forms.FormsPage;
import Pages.interactions.InteractionsPage;
import Pages.widgets.WidgetsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public ElementsPage clickElementsPage(){
        clickLink("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
        return new ElementsPage(driver);
    }

    public FormsPage clickFormPage(){
        clickLink("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5");
        return new FormsPage(driver);
    }

    public AlFrWinPage clickAlFrWinPage(){
        clickLink("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5");
        return new AlFrWinPage(driver);
    }

    public WidgetsPage clickWidgetsPage(){
        clickLink("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5");
        return new WidgetsPage(driver);
    }

    public InteractionsPage clickInteractionsPage(){
        clickLink("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5");
        return new InteractionsPage(driver);
    }

    public BookStorePage clickBookStorePage(){
        clickLink("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5");
        return new BookStorePage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.xpath(linkText)).click();
    }
}

