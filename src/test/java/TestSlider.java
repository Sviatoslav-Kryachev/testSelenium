import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.example.Locators;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestSlider {

    WebDriver driver;
    Locators locators;

    @BeforeClass
    public void preConditions() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webDriver.chrome.driver", path);

        driver = new ChromeDriver();
        Locators locators = new Locators(driver);
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
    }

    @org.testng.annotations.Test
    public void testSlider() {
        driver.navigate().to("https://demoqa.com/slider");
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
        Assert.assertTrue(slider.isDisplayed());
        String getValueSlider = driver.findElement(By.id("sliderValue")).getAttribute("value");

        Actions moveSlider = new Actions(driver);
        Action action = moveSlider.dragAndDropBy(slider, 3, 0).build();
        //       Assert.assertEquals(getValueSlider, "50", "Wrong Value Slider");
        Action action2 = moveSlider.dragAndDropBy(slider, 130, 0).build();
        Action action3 = moveSlider.dragAndDropBy(slider, 260, 0).build();

        action.perform();
        action2.perform();
        action3.perform();
//      Assert.assertEquals(getValueSlider, "100", "Wrong Value Slider");

    }

/*    @Test
    public String textH1() {
        driver.get("https://demoqa.com/sample");
        WebElement some = driver.findElement(By.id("sampleHeading"));
        String h1 = some.getText();
//        System.out.println(h1);
        return h1;
    }*/


}
