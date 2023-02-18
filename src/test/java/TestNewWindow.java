import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.example.Locators;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static javax.swing.text.html.HTML.Tag.H1;

public class TestNewWindow {

    WebDriver driver;
    Locators locators;


    @BeforeClass
    public void preConditions() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webDriver.chrome.driver", path);

        driver = new ChromeDriver();
        locators = new Locators(driver);
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);

    }

    @Test
    public void testNewWindow(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            driver.get("https://demoqa.com/browser-windows");
            Thread.sleep(5000);
            String window1 = driver.getWindowHandle();

            js.executeScript("window.open()");

            Set<String> currentWindows = driver.getWindowHandles();

            String window2 = null;

            for (String window: currentWindows){
                if (!window.equals(window1)) {
                    window2 = window;
                    break;
                }
            };


            locators.newWindowCl();
//            driver.switchTo().window(window2);
//            driver.get("https://demoqa.com/sample");
            WebElement textH1 = driver.findElement(By.id("messageWindowButton"));
            String someText = textH1.getText();
            System.out.println(someText);
//            driver.switchTo().window(window2);
            Assert.assertEquals(someText, "New Window Message", "Wrong Text");
//            Assert.assertEquals(someText, "This is a sample page", "Wrong Text");
 //                      locators.getH1Teg();
 //           Assert.assertEquals(locators.getH1Teg, "This is a sample page", "Wrong H1 TExt");
 //                   System.out.println(locators.getH1FirstTask());


       /*     driver.switchTo().window(window1);
            Thread.sleep(15000);
            driver.get("https://demoqa.com/browser-windows");*/


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } ;











    }






}
