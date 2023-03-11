package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsNewWindows {
    WebDriver driver;

    public LocatorsNewWindows(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement newTab() {
        return driver.findElement(By.xpath("//button[@id='tabButton']"));
        ////button[@id='tabButton']
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
        return driver.findElement(By.id("messageWindowButton"));

    }

    public void newWindowsMessageClick() {
        newWindowMessage().click();
    }

    public WebElement bodyMessage() {
        return driver.findElement(By.xpath("/html/body/text()"));
    }
    public void checkSomeText(){
        bodyMessage().getText();
 //       equals("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.")
    }

}
