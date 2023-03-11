package org.tests;

import org.locators.LocatorsNewWindows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class TestWindow extends DriverSetup {

    @Test
    public void testNewTab() throws InterruptedException {
        LocatorsNewWindows locatorsNewWindows = new LocatorsNewWindows(driver);
        driver.get("https://demoqa.com/browser-windows");
        locatorsNewWindows.newTabClick();
        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        locatorsNewWindows.getH1Teg();
        Assert.assertEquals(locatorsNewWindows.h1FirstTask().getText(), "This is a sample page", "Wrong H1 TEXT");
        driver.switchTo().window(newTab.get(0));
    }

    @Test
    public void testNewWindow() throws InterruptedException {
        LocatorsNewWindows locatorsNewWindows = new LocatorsNewWindows(driver);
        driver.get("https://demoqa.com/browser-windows");
        locatorsNewWindows.newWindowCl();
        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        Assert.assertEquals(locatorsNewWindows.h1FirstTask().getText(), "This is a sample page", "Wrong H1 TEXT");
        driver.switchTo().window(newTab.get(0));
    }

    @Test
    public void testNewWindowMessage() throws InterruptedException {
        LocatorsNewWindows locatorsNewWindows = new LocatorsNewWindows(driver);
        driver.get("https://demoqa.com/browser-windows");
        /*То для себя проверял урлу
        String url1 = driver.getCurrentUrl();
        Assert.assertEquals(url1, "https://demoqa.com/browser-windows", "Wrong URL testNewWindowMessage");*/
        locatorsNewWindows.newWindowsMessageClick();
        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        //todo: Эти 2 строки не работают, доделать!
        //       locatorsNewWindows.bodyMessage();
        //       Assert.assertEquals(locatorsNewWindows.bodyMessage(), "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.", "Wrong text from body");;

    }

}




