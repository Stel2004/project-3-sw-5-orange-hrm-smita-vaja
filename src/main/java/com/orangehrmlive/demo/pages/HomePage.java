package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logofield;

    public String getWelcomeText(){
        Reporter.log("Get welcome text");
        CustomListeners.test.log(Status.PASS,"get welcom text");
        String message=getTextFromElement(welcomeText);
        return message;
    }
    public boolean getlogo(){
        Reporter.log("Get orangehrm logo");
        CustomListeners.test.log(Status.PASS,"get logo ");
       return verifyThatElementIsDisplayed(logofield);
    }
}
