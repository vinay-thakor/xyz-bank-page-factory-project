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

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());
    //location of elements
    By transactionTab = By.xpath("//button[contains(text(),'Transactions')]");
    By depositTab = By.xpath("");
    By withdrawTab = By.xpath("//button[contains(text(),'Withdrawl')]");
    By logoutBtn = By.xpath("//button[contains(text(),'Logout')]");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By depositBtn = By.xpath("//button[1][contains(text(),'Deposit')]");
    By depositSuccessText = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawBtn = By.xpath("//button[1][contains(text(),'Withdraw')]");
    By transactionsSuccessText = By.xpath("//span[contains(text(),'Transaction successful')]");

    @FindBy(xpath = "//button[contains(text(),'Transactions')]")
    WebElement _transactionTab;
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement _depositTab;
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement _withdrewTab;
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement _logoutBtn;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amoutField;
    @FindBy (xpath = "//button[1][contains(text(),'Deposit')]")
    WebElement _depositBtn;
    @FindBy(xpath = "//button[1][contains(text(),'Deposit')]")
    WebElement _depositSuccessTex;
    @FindBy(xpath = "//button[1][contains(text(),'Withdraw')]")
    WebElement _withdrewBtn;
    @FindBy(xpath = "/span[contains(text(),'Transaction successful')]")
    WebElement _transactionsSuccessTex;


    //actions performed on elements
    public void verifyLogoutTabDisplayed(String str) {
        waitUntilElementToBeClickable(logoutBtn,5);
        verifyTextAssertMethod(logoutBtn,str);
    }

    public void clickOnLogout() {
        Reporter.log("Clicking on Logout button : " + _logoutBtn.toString() +"<br>");
        clickOnElement(logoutBtn);
        log.info("Clicking on Logout button : " + _logoutBtn.toString());
    }

    public void clickOnDepositTab() {
        Reporter.log("Clicking on Deposit button :" + _depositBtn.toString() +"<br>");
        clickOnElement(depositTab);
        log.info("Clicking on Deposit Tab  :" + _depositBtn.toString());
    }

    public void clickOnWithdrawlTab() {
        Reporter.log("Clicking on Withdraw button" +_withdrewBtn.toString() + "<br>");
        clickOnElement(withdrawTab);
        log.info("Clicking on Withdraw button" +_withdrewBtn.toString());
    }

    public void enterAmount50(String amout) {
        Reporter.log("Enter the amount :" + amout + " to amount field " +_amoutField.toString()+"<br>");
        sendTextToElement(amountField,amout);
        log.info("Enter the amount :\" + amout + \" to amount field \" +_amoutField.toString()");
    }
//    public void enterAmount100(String amount100) {
//        Reporter.log("Enter the amount  :" + amount100 + " to amount field " + _ );
//        sendTextToElement(amountField,str);
//
//    }

    public void clickOnDepositButton() {
        Reporter.log("Clicking on Deposit button : " + _depositBtn.toString() + "<br>");
        clickOnElement(_depositBtn);
        log.info("Clicking on Deposit button : " + _depositBtn.toString());
    }

    public void clickOnWithdrawButton() {
        Reporter.log("Clicking on Withdraw button :" + _withdrewBtn.toString() + "<br>");
        clickOnElement(withdrawBtn);
        log.info("Clicking on Withdraw button :" + _withdrewBtn.toString());
    }

    public void verifyMessageDepositSuccessful(String verimessage) {
        Reporter.log("Verify  deposit message  : " + verimessage + " with " + _depositSuccessTex.toString() +"<br>" );
        verifyTextAssertMethod(depositSuccessText,verimessage);
        log.info("Verify  deposit message  : " + verimessage + " with " + _depositSuccessTex.toString());
    }

    public void verifyMessageTransactionSuccessful(String veriTrans) {

        verifyTextAssertMethod(transactionsSuccessText,veriTrans);
    }

}
