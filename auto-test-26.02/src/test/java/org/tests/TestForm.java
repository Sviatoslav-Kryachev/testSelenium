package org.tests;

import org.locators.LocatorsForm;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestForm extends DriverSetup {
    //   private WebDriver driver;
    LocatorsForm locatorsForm;

    @Test
    public void testForm() throws InterruptedException {
        locatorsForm = new LocatorsForm(driver);
        locatorsForm.getUrlTestForm();
        locatorsForm.firstNameFieldSK();
        locatorsForm.lastNameFieldSK();
        locatorsForm.emailFieldSK();
        locatorsForm.genderClick();
        locatorsForm.mobileSk();
        locatorsForm.scrollHobbiesSport();
        locatorsForm.hobbieSportClick();
        locatorsForm.textAreaSk();
        locatorsForm.setDisplayForAccessSubmitButton();
        locatorsForm.scrollForSubmit();
        locatorsForm.submitClick();
        locatorsForm.setFullDisp();
        locatorsForm.checkStudentName();
        locatorsForm.checkStudentEmail();
        locatorsForm.checkGenderTable();
        locatorsForm.checkMobileTable();
        locatorsForm.checkHobbiesTable();
        locatorsForm.checkAddressTable();

    }
}