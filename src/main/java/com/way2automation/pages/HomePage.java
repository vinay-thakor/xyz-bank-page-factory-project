package com.way2automation.pages;/*
 *Vinay Creation
 *Date of Creation
 */

import com.way2automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //location of elements
//    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
//    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
//    By homeBtn = By.xpath("//button[contains(text(),'Home')]");

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginLink;
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLoginLink;
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement _homeBtn;

    //
    public void clickOnHomeButton() {
        Reporter.log("Clicking on home button" + _homeBtn.toString() + "<br>");
        clickOnElement(_homeBtn);
        log.info("Clicking on home button" + _homeBtn.toString());
    }

    public void clickOnBankManagerLoginTab() {
        Reporter.log("Clicking on Bank Manager button :" + _bankManagerLoginLink.toString() + "<br>");
        clickOnElement(_bankManagerLoginLink);
    }

    public void clickOnCustomerLoginTab() {
        Reporter.log("Clicking on Customer Login button :" + _customerLoginLink.toString() + "<br>");
        clickOnElement(_customerLoginLink);
        log.info("Clicking on Customer Login button :" + _customerLoginLink.toString());
    }
}





