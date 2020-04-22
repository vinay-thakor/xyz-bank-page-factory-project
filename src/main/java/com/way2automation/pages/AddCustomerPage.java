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

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());


    //location of elements
//    By firstNameField = By.xpath("//input[@placeholder='First Name']");
//    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
//    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
//    By addCustomerBtn = By.cssSelector("button.btn.btn-default");

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement _firstNameField;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement _lastNameField;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement _postCodeField;
    @FindBy(css = "button.btn.btn-default")
    WebElement _addCustomerBtn;


    //actions performed on elements
    public void enterFirstName(String firstName) {
        waitUntilElementToBeClickable(By.xpath("//input[@placeholder='First Name']"), 10);
        Reporter.log("Enter First Name : " + firstName + " to first name field " +_firstNameField.toString() + "<br>");
        sendTextToElement(_firstNameField, firstName);
        log.info("Enter First Name : " + firstName + " to first name field " +_firstNameField.toString());
    }

    public void enterLastName(String lastName) {
        waitUntilElementToBeClickable(By.xpath("//input[@placeholder='Last Name']"), 10);
        Reporter.log("Enter last name : " + lastName + "to last name field " + _lastNameField.toString()+"<br>");
        sendTextToElement(_lastNameField, lastName);
        log.info("Enter last name : " + lastName + "to last name field " + _lastNameField.toString());
    }

    public void enterPostCode(String postCode) {
        waitUntilElementToBeClickable(By.xpath("//input[@placeholder='Post Code']"), 10);
        Reporter.log("Enter postcode : " + postCode + "to postcode field " + _postCodeField.toString() + "<br>" );
        sendTextToElement(_postCodeField,postCode );
        log.info("Enter postcode : " + postCode + "to postcode field " + _postCodeField.toString());
    }

    public void clickOnAddCustomerButton() {
        Reporter.log("Clicking on Add to Customer :" + _addCustomerBtn.toString() + "<br>");
        clickOnElement(_addCustomerBtn);
        log.info("Clicking on Add to Customer :" + _addCustomerBtn.toString());
    }

    public void verifyMessageFromPopupAndAcceptPopup(String verifypopUpMesg) {
//        String actualMessage = alertGetText();
//        String expectedMessage = "Customer added successfully with customer id :";
//        Assert.assertTrue(actualMessage.contains(expectedMessage), str);
       // verifyTextAssertMethodForAlert(verifypopUpMesg);
        alertAccept();
    }

}
