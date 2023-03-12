package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LocatorsSlider {

    public LocatorsSlider(WebDriver driver) {
        this.driver = driver;
    }

    public void getUrlSlider() {
        driver.get("https://demoqa.com/slider");

    }

    public void checkValueSlider75(){
        Actions moveSlider = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int oldValue = Integer.parseInt(slider().getAttribute("value"));
        int newValue = 75;
        js.executeScript("arguments[0].value = " + newValue + ";", slider());
        Action action = moveSlider.dragAndDropBy(slider(), 130, 0).build();
        action.perform();
        int actualValue = Integer.parseInt(slider().getAttribute("value"));
        Assert.assertEquals(actualValue, newValue);
        slider();
        String actualLabel = slider().getAttribute("value");
        Assert.assertEquals(actualLabel, Integer.toString(newValue));
    }

    public void CheckValueSlider100(){
        Actions moveSlider = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        int oldValue = Integer.parseInt(slider().getAttribute("value"));
        int newValue1 = 100;
        js.executeScript("arguments[0].value = " + newValue1 + ";", slider());
        Action action1 = moveSlider.dragAndDropBy(slider(), 260, 0).build();
        action1.perform();
        int actualValue1 = Integer.parseInt(slider().getAttribute("value"));
        Assert.assertEquals(actualValue1, newValue1);
        slider();
        String actualLabel1 = slider().getAttribute("value");
        Assert.assertEquals(actualLabel1, Integer.toString(newValue1));
    }
    public WebElement slider() {
        return driver.findElement(By.id("sliderValue"));
    }

    WebDriver driver;
}
