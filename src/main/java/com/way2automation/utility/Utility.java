package com.way2automation.utility;/*
 *Vinay Creation
 *Date of Creation
 */

import com.way2automation.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utility extends BasePage {

    /*
     Variable js declared globally to enable using
      JavascriptExecutor method for window scrolling
      */
    private JavascriptExecutor js;


    /*
     * This method will set drivers for the browser
     */
    public void chromeBrowserDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    /*
     * This method will set drivers for the browser
     */
    public void fireFoxBrowserDriver() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    /*
     * This method will set drivers for the browser
     */
    public void operaBrowserDriver() {
        System.setProperty("webdriver.opera.driver", "drivers/operadriver.exe");
        driver = new OperaDriver();
    }

    /*
     * This method will generate implicit wait
     */
    public void implicitlyWaitSeconds(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    /*
     * This method will generate explicit wait
     */
    public void explicitWaitSeconds(int seconds, By by) {
        driver.findElement(by);
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /*
     * This method will used to wait web driver until element become clickable
     */
    public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

    /*
     * This method will used to wait web driver until presence of element located by locator
     */
    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /*
     * This method will used to wait web driver until visibility of element located by locator
     */
    public void waitUntilVisibilityOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /*
     *  This method will maximize browser window
     */
    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    /*
     *This method will get string
     */
    public void getMethod(String string) {
        driver.get(string);
    }

    /*
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    /*
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /*
     * This method will send text to an element
     */
    public void sendTextToElement(By by, String string) {
        driver.findElement(by).sendKeys(string);
    }

    /*
     * This method will send text to an element
     */
    public void sendTextToElement(WebElement element, String string) {
        element.sendKeys();
    }

    /*
     * This method will get text from an element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /*
     * This method will get text from an element
     */
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /*
     * This method will get size of an element
     */
    public void getSizeFromElement(By by) {
        driver.findElement(by).getSize();
    }

    /*
     * This method will get size of an element
     */
    public void getSizeFromElement(WebElement element) {
        element.getSize();
    }

    /*
     * This method will perform mouseHover on an element
     */
    public void mouseHover(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    /*
     * This method will perform mouseHover on an element
     */
    public void mouseHover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /*
     * This method will perform mouseHover and click on an element
     */
    public void mouseHoverClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    /*
     * This method will perform mouseHover and click on an element
     */
    public void mouseHoverClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by INDEX
     */
    public void selectByIndexFromDropDown(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by INDEX
     */
    public void selectByIndexFromDropDown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VISIBLE TEXT
     */
    public void selectByVisibleTextFromDropDown(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VISIBLE TEXT
     */
    public void selectByVisibleTextFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByVisibleText(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VALUE
     */
    public void selectByValueFromDropDown(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VALUE
     */
    public void selectByValueFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByValue(string);
    }


    /*
     * This method will verify that an element is displayed
     */
    public boolean elementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is displayed
     */
    public boolean elementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


    /*
     * This method will verify that an element is selected
     */
    public boolean elementIsSelected(By by) {
        WebElement element = driver.findElement(by);
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is selected
     */
    public boolean elementIsSelected(WebElement element) {
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }


    /*
     * This method will verify that an element is enabled
     */
    public boolean elementIsEnabled(By by) {
        WebElement element = driver.findElement(by);
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is enabled
     */
    public boolean elementIsEnabled(WebElement element) {
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /*
     *This method will perform a click on a radio Button
     */
    public void radioButtonClick(By by) {
        driver.findElement(by).click();
    }

    /*
     *This method will perform a click on a radio Button
     */
    public void radioButtonClick(WebElement element) {
        element.click();
    }

    /*
     *This method will verify if a radio Button is selected
     */
    public void radioButtonIsSelected(By by) {
        driver.findElement(by).isSelected();
    }

    /*
     *This method will verify if a radio Button is selected
     */
    public void radioButtonIsSelected(WebElement element) {
        element.isSelected();
    }

    /*
     *This method will verify if a radio Button is displayed
     */
    public void radioButtonIsDisplayed(By by) {
        driver.findElement(by).isDisplayed();
    }

    /*
     *This method will verify if a radio Button is displayed
     */
    public void radioButtonIsDisplayed(WebElement element) {
        element.isDisplayed();
    }

    /*
     *This method will verify if  a radio Button is enabled
     */
    public void radioButtonIsEnabled(By by) {
        driver.findElement(by).isEnabled();
    }

    /*
     *This method will verify if a radio Button is enabled
     */
    public void radioButtonIsEnabled(WebElement element) {
        element.isEnabled();
    }

    /*
     *This method will perform a click on a check Box
     */
    public void checkBoxClick(By by) {
        driver.findElement(by).click();
    }

    /*
     *This method will perform a click on a check Box
     */
    public void checkBoxClick(WebElement element) {
        element.click();
    }

    /*
     *This method will verify if a check Box is selected
     */
    public void checkBoxIsSelected(By by) {
        driver.findElement(by).isSelected();
    }

    /*
     *This method will verify if a check Box is selected
     */
    public void checkBoxIsSelected(WebElement element) {
        element.isSelected();
    }

    /*
     *This method will verify if a check Box is enabled
     */
    public void checkBoxIsEnabled(By by) {
        driver.findElement(by).isEnabled();
    }

    /*
     *This method will verify if a check Box is enabled
     */
    public void checkBoxIsEnabled(WebElement element) {
        element.isEnabled();
    }

    /*
     *This method will verify if a check Box is displayed
     */
    public void checkBoxIsDisplayed(By by) {
        driver.findElement(by).isDisplayed();
    }

    /*
     *This method will verify if a check Box is displayed
     */
    public void checkBoxIsDisplayed(WebElement element) {
        element.isDisplayed();
    }

    /*
     * This method will Accept an Alert
     */
    public void alertAccept() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    /*
     * This method will Dismiss an Alert
     */
    public void alertDismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    /*
     * This method will GetText from an Alert
     */
    public void alertGetText() {
        Alert alert = driver.switchTo().alert();
        alert.getText();
    }

    /*
     * This method will SendText to an Alert
     */
    public void alertSendText(String string) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(string);
    }

    /*
     * This method will verify Text using Assert.assertEquals function
     */
    public void verifyTextAssertMethod(By by, String str) {
        String actualText = driver.findElement(by).getText();
        String expectedText = str;
        Assert.assertEquals(actualText, expectedText);
    }

    /*
     * This method will verify Text using Assert.assertEquals function
     */
    public void verifyTextAssertMethod(WebElement element, String str) {
        String actualText = element.getText();
        String expectedText = str;
        Assert.assertEquals(actualText, expectedText);
    }

    /*
     * This method will returns list of web elements
     */
    public List<WebElement> webElementList(By by) {

        return driver.findElements(by);
    }



    /*
     * This method will generate Random number
     */
    public int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    /*
     * This method will generate Random Int
    public int generateRandomInt() {
        Random randomGenerator = new Random();
        return (int) (randomGenerator.nextInt(1000)) ;
    }
    */

    /*
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /*
     * This method will stop the programme execution on a given element for milliseconds
     */
    public void sleepMethod(int millisec) throws InterruptedException {
        Thread.sleep(millisec);
    }

    /*
     * This method will enable scrolling the browser window up, down & sideways
     */
    public void windowScrollUpOrDown(int x, int y) {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ");");
    }

    /*
     * This method will only close the current or a current or the browser in focus
     */
    public void closeMethod() {
        driver.close();
    }

    /*
     *This method will quit all the browser instances related to the driver session
     */
    public void quitMethod() {
        driver.quit();
    }

}



