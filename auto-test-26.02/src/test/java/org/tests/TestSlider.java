package org.tests;

import org.locators.LocatorsSlider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSlider extends DriverSetup {

    private JavascriptExecutor js;
    LocatorsSlider locatorsSlider;

    @Test
    public void testSlider() throws InterruptedException {
        js = (JavascriptExecutor) driver;
        locatorsSlider = new LocatorsSlider(driver);
        locatorsSlider.getUrlSlider();
        locatorsSlider.checkValueSlider75();
        locatorsSlider.CheckValueSlider100();

    }
}







