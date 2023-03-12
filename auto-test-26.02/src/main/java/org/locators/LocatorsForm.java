package org.locators;
// import org.testng.Assert;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LocatorsForm {


    public LocatorsForm(WebDriver driver) {
        this.driver = driver;
    }

    public long getH1Teg;
    public long getStudentName;


    public void getUrlTestForm() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));

    }

    public void firstNameFieldSK() {
        getFirstName().sendKeys("Sviatoslav");
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));

    }

    public void lastNameFieldSK() {
        getLastName().sendKeys("Kryachev");
    }

    public WebElement getInputEmail() {
        return driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));

    }

    public void emailFieldSK() {
        getInputEmail().sendKeys("same92121@gmail.com");
    }

    public WebElement getGender() {
        return driver.findElement(By.xpath("//label[@for='gender-radio-1']"));

    }

    public void genderClick() {
        getGender().click();
    }

    public WebElement getMobile() {
        return driver.findElement(By.xpath("//input[@id='userNumber']"));

    }

    public void mobileSk() {
        getMobile().sendKeys("0508007736");
    }

    public WebElement getDateOfBirth() {
        return driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
    }

    public WebElement getHobbiesSport() {
        return driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));

    }

    public void hobbieSportClick() {
        getHobbiesSport().click();
    }

    public WebElement getTextArea() {
        return driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));

    }

    public void textAreaSk() {
        getTextArea().sendKeys("SomeText");
    }

    public WebElement sendSubmit() {
        return driver.findElement(By.id("submit"));
    }

    public void submitClick() {
        sendSubmit().click();
    }


    public WebElement studentName() {
        return driver.findElement(By.xpath("//tbody/tr[1]/td[2]"));
    }

    public void getStudentName() {
        studentName().getText();
    }

    public void checkStudentName() {
        Assert.assertEquals(studentName().getText(), "Sviatoslav Kryachev", "Wrong Student Name");
    }


    public WebElement studentEmail() {
        return driver.findElement(By.xpath("//tbody/tr[2]/td[2]"));
    }

    public void getstudentEmail() {
        studentEmail().getText();
    }

    public void checkStudentEmail() {
        Assert.assertEquals(studentEmail().getText(), "same92121@gmail.com", "Wrong Student Email");
    }

    public WebElement gender() {
        return driver.findElement(By.xpath("//tbody/tr[3]/td[2]"));
    }

    public void getGenderTable() {
        gender().getText();
    }

    public void checkGenderTable() {
        Assert.assertEquals(gender().getText(), "Male", "Wrong Gender");
    }

    public WebElement mobileTable() {
        return driver.findElement(By.xpath("//tbody/tr[4]/td[2]"));
    }

    public void getMobileTable() {
        mobileTable().getText();
    }

    public void checkMobileTable() {
        Assert.assertEquals(mobileTable().getText(), "0508007736", "Wrong Mobile");
    }

    public WebElement hobbiesTable() {
        return driver.findElement(By.xpath("//tbody/tr[7]/td[2]"));
    }

    public void getHobbiesTable() {
        hobbiesTable().getText();
    }

    public void checkHobbiesTable() {
        Assert.assertEquals(hobbiesTable().getText(), "Sports", "Wrong Hobbies");
    }

    public WebElement addressTable() {
        return driver.findElement(By.xpath("//tbody/tr[9]/td[2]"));
    }


    public void getaddressTable() {
        addressTable().getText();
    }

    public void checkAddressTable() {
        Assert.assertEquals(addressTable().getText(), "SomeText", "Wrong Address");
    }

    public void setDisplayForAccessSubmitButton() {
        Dimension dm = new Dimension(762, 730);
        driver.manage().window().setSize(dm);

    }

    public void scrollForSubmit() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean elementFound = false;
        while (!elementFound) {
            js.executeScript("window.scrollBy(0,1400)");
            WebElement sendSubmit = driver.findElement(By.id("submit"));
            if (sendSubmit.isDisplayed()) {
                elementFound = true;
            }
        }
    }

    public void scrollHobbiesSport() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean elementFound = false;
        while (!elementFound) {
            js.executeScript("window.scrollBy(0,500)");
            WebElement getHobbiesSport = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
            if (getHobbiesSport.isDisplayed()) {
                elementFound = true;
            }
        }
    }

    public void setFullDisp() {
        driver.manage().window().maximize();
    }


    WebDriver driver;
}
