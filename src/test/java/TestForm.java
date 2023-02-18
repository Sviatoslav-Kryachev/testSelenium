import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.example.Locators;

import java.util.concurrent.TimeUnit;

public class TestForm {
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

    @org.testng.annotations.Test
    public void test() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        locators.firstNameFieldSK();
        locators.lastNameFieldSK();
        locators.emailFieldSK();
        locators.genderClick();
        locators.mobileSk();
        locators.hobbieSportClick();
//      js.executeScript("arguments[0].scrollIntoView();", getTextArea);
        js.executeScript("window.scrollBy(0,600)");
        locators.getTextArea().sendKeys("SomeText");
        Dimension dm = new Dimension(762, 730);
        driver.manage().window().setSize(dm);
        js.executeScript("window.scrollBy(0,1300)");
        locators.submitClick();
        driver.manage().window().maximize();
        locators.getStudentName();
        Assert.assertEquals(locators.studentName().getText(), "Sviatoslav Kryachev", "Wrong Student Name");
        locators.getstudentEmail();
        Assert.assertEquals(locators.studentEmail().getText(), "same92121@gmail.com", "Wrong Student Email");
        locators.getGenderTable();
        Assert.assertEquals(locators.gender().getText(), "Male", "Wrong Gender");
        locators.getMobileTable();
        Assert.assertEquals(locators.mobileTable().getText(), "0508007736", "Wrong Mobile");
        locators.getHobbiesTable();
        Assert.assertEquals(locators.hobbiesTable().getText(), "Sports", "Wrong Hobbies");
        locators.getaddressTable();
        Assert.assertEquals(locators.addressTable().getText(), "SomeText", "Wrong Address");





    }


}







