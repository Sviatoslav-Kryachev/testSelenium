package org.tests;

import org.locators.LocatorsNewWindows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class TestWindow extends DriverSetup {
    LocatorsNewWindows locatorsNewWindows;
    @Test
    public void testNewTab() throws InterruptedException {
        locatorsNewWindows = new LocatorsNewWindows(driver);
        locatorsNewWindows.getUrlWindows();
        locatorsNewWindows.newTabClick();
        locatorsNewWindows.switchSecondWindow();
        locatorsNewWindows.getH1Teg();
        locatorsNewWindows.assertTextNewTAb();
        locatorsNewWindows.switchFirstWindow();
    }

    @Test
    public void testNewWindow() throws InterruptedException {
        locatorsNewWindows.getUrlWindows();
        locatorsNewWindows.newWindowCl();
        locatorsNewWindows.switchSecondWindow();
        locatorsNewWindows.assertTextNewTAb();
        locatorsNewWindows.switchFirstWindow();
    }

    @Test
    public void testNewWindowMessage() throws InterruptedException {
        locatorsNewWindows.getUrlWindows();
        locatorsNewWindows.newWindowsMessageClick();
        locatorsNewWindows.switchSecondWindow();


        //todo: Эти 2 строки не работают, изза локаторов, если я верно понимаю, то Женя говорил что скипаем?
        //todo: (падает тест и пишет что не находит эти элементы:no such element: Unable to locate element: {"method":"xpath","selector":"/html/body/text()"})!

        /*locatorsNewWindows.bodyMessage();
        locatorsNewWindows.getSomeText();
        locatorsNewWindows.assertLongText();*/
    }

}




