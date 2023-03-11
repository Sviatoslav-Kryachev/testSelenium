package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsSlider {
    public LocatorsSlider(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement slider() {
        return driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
    }

    WebDriver driver;
}
