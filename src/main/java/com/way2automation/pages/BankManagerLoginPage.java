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

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());
//
//    //location of elements
//    By addCustomer = By.xpath("//button[contains(text(),'Add Customer')]");
//    By openAccount = By.xpath("//button[contains(text(),'Open Account')]");
//    By customers   = By.xpath("//button[contains(text(),'Customers')]");

    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement _addCutomer;
    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement _openAccount;
    @FindBy(xpath = "//button[contains(text(),'Customers')]")
    WebElement _customers;

    //actions performed on elements
    public void clickOnAddCustomerTab() {
        waitUntilElementToBeClickable(By.xpath("//button[contains(text(),'Add Customer')]"), 10);
        Reporter.log("Clicking on Add customer : " + _addCutomer.toString() + "<br>");
        clickOnElement(_addCutomer);
        log.info("Clicking on Add customer : " + _addCutomer.toString());
    }

    public void clickOnOpenAccountTab() {
        waitUntilElementToBeClickable(By.xpath("//button[contains(text(),'Open Account')]"), 10);
        Reporter.log("Clicking on Open Account Tab : " + _openAccount.toString() + "<br>");
        clickOnElement(_openAccount);
        log.info("Clicking on Open Account Tab : " + _openAccount.toString());

    }

    public void clickOnCustomersTab() {
        waitUntilElementToBeClickable(By.xpath("//button[contains(text(),'Customers')]"), 10);
        Reporter.log(" Click on Customer Tab " + _customers.toString() + "<br>");
        clickOnElement(_customers);
        log.info("Click on Customer Tab " + _customers.toString());
    }

}
