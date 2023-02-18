package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Locators {


    public long getH1Teg;
    public long getStudentName;
    WebDriver driver;

    public Locators(WebDriver driver) {
        this.driver = driver;
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

    public WebElement sendSubmit() {
        return driver.findElement(By.id("submit"));
    }

    public void submitClick() {
        sendSubmit().click();
    }

    public WebElement slider() {
        return driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
    }


    public WebElement newTab() {
        return driver.findElement(By.id("tabButton"));
    }

    public void newTabClick() {
        newTab().click();
    }

    public WebElement h1FirstTask() {
        return driver.findElement(By.id("sampleHeading"));
    }

    public void getH1Teg() {
        h1FirstTask().getText();

    }

    public WebElement newWindow() {
        return driver.findElement(By.id("windowButton"));
    }

    public void newWindowCl() {
        newWindow().click();
    }

    public WebElement studentName() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));
    }

    public void getStudentName() {
        studentName().getText();
    }

    public WebElement studentEmail() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[2]/td[2]"));
    }

    public void getstudentEmail() {
        studentEmail().getText();
    }

    public WebElement gender() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[3]/td[2]"));
    }


    public void getGenderTable() {
        gender().getText();
    }

    public WebElement mobileTable() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[4]/td[2]"));
    }
    public void getMobileTable(){
        mobileTable().getText();
    }

    public WebElement hobbiesTable() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[7]/td[2]"));
    }
    public void getHobbiesTable(){
        hobbiesTable().getText();
    }

    public WebElement addressTable() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr[9]/td[2]"));
    }
    public void getaddressTable(){
        addressTable().getText();
    }





}
