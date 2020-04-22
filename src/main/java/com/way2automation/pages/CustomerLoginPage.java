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

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());
    //location of elements
//    By yourNameField  = By.id("userSelect");
//    By loginBtn = By.xpath("//button[contains(text(),'Login')]");
//    By yourNameText = By.xpath("//label[contains(text(),'Your Name')]");

    @FindBy(id = "userSelect")
    WebElement _yourNameField;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement _loginBtn;
    @FindBy(xpath = "//label[contains(text(),'Your Name')]")
    WebElement _yourNameText;

    //actions performed on elements
    public void searchCustomer(String serchCustomer) {
        Reporter.log("Serch Customer : " + serchCustomer + "from the field " + _yourNameField.toString() + "<br>");
        selectByVisibleTextFromDropDown(_yourNameField,serchCustomer);
        log.info("Serch Customer : " + serchCustomer + "from the field " + _yourNameField.toString());
       //selectByIndexFromDropDown(yourNameField,1);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on the customer Login Button : " + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("Clicking on the customer Login Button : " + _loginBtn.toString());
    }

    public void verifyYourNameTextDisplayed(String nameTextDisplay) {
        Reporter.log("");

        verifyTextAssertMethod(yourNameText,str);
    }
}
