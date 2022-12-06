package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgottenPasswordPage extends Utility {

    By forgotPasswordText = By.xpath("//h6[contains(@class,'forgot-password-title')]");

    public String getForgotPasswordText() {
        return getTextFromElement(forgotPasswordText);
    }
}
