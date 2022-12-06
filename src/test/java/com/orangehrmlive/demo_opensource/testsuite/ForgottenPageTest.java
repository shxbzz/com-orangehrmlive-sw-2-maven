package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.ForgottenPasswordPage;
import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgottenPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ForgottenPasswordPage forgottenPasswordPage = new ForgottenPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPage.clickForgotPasswordButton();
        String expectedMessage = "Reset Password";
        String actualMessage = forgottenPasswordPage.getForgotPasswordText();
        Assert.assertEquals(expectedMessage, actualMessage, "The text does not match the expected text");
    }
}
