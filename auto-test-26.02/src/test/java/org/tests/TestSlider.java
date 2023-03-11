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

    @Test
    public void testSlider() throws InterruptedException {
        js = (JavascriptExecutor) driver;
        LocatorsSlider locatorsSlider = new LocatorsSlider(driver);
        Actions moveSlider = new Actions(driver);
        driver.get("https://demoqa.com/slider");
        locatorsSlider.slider();
        //   Assert.assertTrue(locatorsSlider.slider().isDisplayed());

        // Получим значение слайдера до перемещения
        int oldValue = Integer.parseInt(locatorsSlider.slider().getAttribute("value"));
        // Переместим слайдер на новое значение
        int newValue = 75;
        js.executeScript("arguments[0].value = " + newValue + ";", locatorsSlider.slider());
        Action action = moveSlider.dragAndDropBy(locatorsSlider.slider(), 130, 0).build();
        action.perform();
        // Проверка, что значение слайдера изменилось
        int actualValue = Integer.parseInt(locatorsSlider.slider().getAttribute("value"));
        Assert.assertEquals(actualValue, newValue);
        // Проверка, что значение на странице соответствует новому значению слайдера
        WebElement valueLabel = driver.findElement(By.id("sliderValue"));
        String actualLabel = valueLabel.getAttribute("value");
        Assert.assertEquals(actualLabel, Integer.toString(newValue));
    }
}
//todo: проверка на значения слайдера на брекпоинтах, работают, но что-то я наколхозил, так как изначально у меня
// ползунок слайдера двигался, однако, значение слайдера не менялось, потом добавил кода с гугл поиска, и заработало.
// разбираюсь с тем что намутил!






