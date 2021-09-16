package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public class FileUtils {

        public WebDriver driver;

        public String[] readUserDatas() {
            String[] result = new String[2];
            try {
                File myUser = new File("User.txt");
                Scanner scanner = new Scanner(myUser);
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    String[] temp = data.split(" = ");
                    if (temp[0].equals("email")) {
                        result[0] = temp[1];
                    } else {
                        result[1] = temp[1];
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
            return result;
        }

        public void saveToFile(String filename, String text) {


            try {
                FileWriter myWriter = new FileWriter(filename);
                myWriter.append(text +"\n" );
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }


        }
    }

    public void scrollDown(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 15000)");
    }

    public void refresh(WebDriver driver){
        driver.navigate().refresh();
    }

    public void waitForXMillis(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public void clickGoogleAds(WebDriver driver){
        final By GOOGLE_AD_BUTTON = By.xpath("//*[@id=\"close-fixedban\"]/img");
        List<WebElement> googleAds = driver.findElements(GOOGLE_AD_BUTTON);
        if(googleAds.size() != 0){
            driver.findElement(GOOGLE_AD_BUTTON).click();
        }
        else{
            //System.out.println("Element not present");
        }
    }

    /*public class SeleniumTakeScreenshot {
        public static void main(String args[]) throws IOException {
            WebDriver driver = new getDriver();
            driver.get("http://www.example.com");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("./image.png"));
            driver.quit();
        }
    }*/
}
