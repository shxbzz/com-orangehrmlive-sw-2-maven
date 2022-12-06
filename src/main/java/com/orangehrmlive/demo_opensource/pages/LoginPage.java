package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By forgotPasswordButton = By.xpath("//p[contains(@class,'-forgot-header')]");


    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickLoginInButton() {
        clickOnElement(loginButton);
    }

    public void clickForgotPasswordButton() {
        clickOnElement(forgotPasswordButton);
    }

}
