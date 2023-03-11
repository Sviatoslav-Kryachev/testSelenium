package org.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DriverSetup {
    public static WebDriver getDriver() {

        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webDriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }

    @BeforeTest
    public void setUp() {
        driver = DriverSetup.getDriver();
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
    }

    @AfterTest
    public void tearDown() {
        driver.quit();

    }


    public WebDriver driver;
}
