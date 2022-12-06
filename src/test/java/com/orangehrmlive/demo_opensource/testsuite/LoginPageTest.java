package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.pages.LoginPage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginInButton();
        String expectedMessage = "Dashboard";
        String actualMessage = homePage.getWelcomeText();
        String requiredActualText =actualMessage.substring(0,7);
        System.out.println(requiredActualText);
        Assert.assertEquals("Dashboard",expectedMessage, requiredActualText);
    }
}