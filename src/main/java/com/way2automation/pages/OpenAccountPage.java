package com.way2automation.pages;/*
 *Vinay Creation
 *Date of Creation
 */

import com.way2automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.nio.file.Watchable;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    //location of elements
//    By customerNameField = By.id("userSelect");
//    By currencyField = By.id("currency");
//    By processBtn = By.xpath("//button[contains(text(),'Process')]");

    @FindBy(id = "userSelect")
    WebElement _customerNameField;

    @FindBy(id = "currency")
    WebElement _currencyField;

    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement _processBtn;

    public void searchCustomerCreatedInFirstTest(String str) {
        Reporter.log("Select name from first from " + _customerNameField.toString() + "<br>");
        selectByVisibleTextFromDropDown(_customerNameField, str);
    }

    public void selectCurrencyPound(int index) {
        Reporter.log("Select Currency from drop down : " + _currencyField.toString()+ "<br>");
        selectByIndexFromDropDown(_currencyField, index);
        log.info("Select Currency from drop down : " + _currencyField.toString());
    }

    public void clickOnProcessButton() {
        Reporter.log("Clicking on process button :  " + _processBtn.toString()+"<br>");
        clickOnElement(_processBtn);
        log.info("Clicking on process button :  " + _processBtn.toString());
    }

    public void verifyMessageFromPopupAndAcceptPopup(String str) {
//        String actualMessage = alertGetText();
//        String expectedMessage = "Account created successfully with account Number :";
//        Assert.assertTrue(actualMessage.contains(expectedMessage), str);

        verifyTextAssertMethodForAlert(str);
        alertAccept();
    }
}


