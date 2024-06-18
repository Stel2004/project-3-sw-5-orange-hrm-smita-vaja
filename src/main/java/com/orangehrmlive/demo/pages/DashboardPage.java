package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

@Listeners(CustomListeners.class)
public class DashboardPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOut;


    public void clickOnUserLogo(){
        Reporter.log("clicking on user link"+ userLogo.toString());
        CustomListeners.test.log(Status.PASS,"CLicking on userlogo"+userLogo);
        clickOnElement(userLogo);
    }
    public void clickOnLogout(){
        Reporter.log("clicking on logout button" + logOut.toString());
        CustomListeners.test.log(Status.PASS,"Clicking on logout "+ logOut);
        mouseHoverToElementAndClick(logOut);
    }
}
