package Pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {

    private WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public TextBoxPage clickTextBoxPage() {
        clickLink("//*[@id=\"item-0\"]/span");
        return new TextBoxPage(driver);
    }

        private void clickLink(String linkText){
            driver.findElement(By.xpath(linkText)).click();
        }
    }
