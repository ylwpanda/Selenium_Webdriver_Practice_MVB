package base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Test is Starting...");
        var ChromeOptions = new ChromeOptions();
        ChromeOptions.addArguments("--no-sandbox");
        ChromeOptions.addArguments("--disable-dev-shm-usage");
        //ChromeOptions.addArguments("--headless");
        ChromeOptions.addArguments("--disable-gpu");
        //ChromeOptions.addArguments("--disable-extensions");
        ChromeOptions.addArguments("--allow-insecure-localhost");
        ChromeOptions.addArguments("--user-agent=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36");
        ChromeOptions.addArguments("--window-size=2560,1600"); //mac(2560,1600)1920,1080
        ChromeOptions.addArguments("--incognito");
        ChromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(ChromeOptions);
        driver.get(TestData.URL);
        homePage = new HomePage(driver);
        System.out.println(driver.getTitle());
    }

    /*@AfterEach // closes all the browser windows opened by webdriver
    public void tearDown() {
        System.out.println("Test is Ending...");
        driver.manage().deleteAllCookies();
        driver.quit();
    }*/
}
