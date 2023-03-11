package org.tests;

import org.locators.LocatorsForm;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestForm extends DriverSetup {
    //   private WebDriver driver;


    @Test
    public void testForm() throws InterruptedException {
        LocatorsForm locatorsForm = new LocatorsForm(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/automation-practice-form");
        locatorsForm.firstNameFieldSK();
        locatorsForm.lastNameFieldSK();
        locatorsForm.emailFieldSK();
        locatorsForm.genderClick();
        locatorsForm.mobileSk();
        js.executeScript("window.scrollBy(0,600)");
        locatorsForm.hobbieSportClick();
        locatorsForm.getTextArea().sendKeys("SomeText");
        Dimension dm = new Dimension(762, 730);
        driver.manage().window().setSize(dm);
        js.executeScript("window.scrollBy(0,1400)");
        locatorsForm.submitClick();
        driver.manage().window().maximize();
        locatorsForm.getStudentName();
        //todo: перенести ассёрты в методы класса LocatorsForm!
        Assert.assertEquals(locatorsForm.studentName().getText(), "Sviatoslav Kryachev", "Wrong Student Name");
        locatorsForm.getstudentEmail();
        Assert.assertEquals(locatorsForm.studentEmail().getText(), "same92121@gmail.com", "Wrong Student Email");
        locatorsForm.getGenderTable();
        Assert.assertEquals(locatorsForm.gender().getText(), "Male", "Wrong Gender");
        locatorsForm.getMobileTable();
        Assert.assertEquals(locatorsForm.mobileTable().getText(), "0508007736", "Wrong Mobile");
        locatorsForm.getHobbiesTable();
        Assert.assertEquals(locatorsForm.hobbiesTable().getText(), "Sports", "Wrong Hobbies");
        locatorsForm.getaddressTable();
        Assert.assertEquals(locatorsForm.addressTable().getText(), "SomeText", "Wrong Address");


    }


}