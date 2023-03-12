package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

public class LocatorsNewWindows {
    WebDriver driver;

    public LocatorsNewWindows(WebDriver driver) {
        this.driver = driver;
    }

    public void getUrlWindows() {
        driver.get("https://demoqa.com/browser-windows");
    }

    public void switchFirstWindow() {
        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(0));
    }

    public void switchSecondWindow() {
        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
    }

    public WebElement newTab() {
        return driver.findElement(By.xpath("//button[@id='tabButton']"));

    }

    public void newTabClick() {
        newTab().click();
    }

    public WebElement h1FirstTask() {
        return driver.findElement(By.id("sampleHeading"));
    }

    public void getH1Teg() {
        h1FirstTask().getText();

    }

    public WebElement newWindow() {
        return driver.findElement(By.id("windowButton"));
    }

    public void newWindowCl() {
        newWindow().click();
    }

    public WebElement newWindowMessage() {
        return driver.findElement(By.xpath("//button[@id='messageWindowButton']"));

    }

    public void newWindowsMessageClick() {
        newWindowMessage().click();
    }

    public WebElement bodyMessage() {
        return driver.findElement(By.xpath("/html/body/text()"));
//      //body[starts-with(text(),'Knowledge increases by sharing')]
//       /html/body/text()
    }

    public void assertTextNewTAb() {
        Assert.assertEquals(h1FirstTask().getText(), "This is a sample page", "Wrong H1 TEXT");
    }

    public void assertLongText() {
        Assert.assertEquals(bodyMessage(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");

    }
}

