package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.AccountSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private AccountSteps accountSteps;
    @Before
    public void maximizeBrowser(){
        driver.manage().window().maximize();}



    @Test
    public void validLoginTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials("danuwenthome@gmail.com", "Sserenity!123");
        loginSteps.clickOnRememberMe();
        loginSteps.clickLoginButton();
        loginSteps.verifyUsernameMessage("danuwenthome");
    }

    @Test
    public void loginWithInvalidCredentials(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials("danuwenthome@gmail.com", "1234567");
        loginSteps.clickLoginButton();
        loginSteps.verifySignInErrorMessage("ERROR: The password you entered for the email address danuwenthome@gmail.com is incorrect. Lost your password?");
    }

    @Test
    public void loginWithoutCredentials(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.clickLoginButton();
        loginSteps.verifyMissingUsernameError("Error: Username is required.");
    }

    @Test
    public void verifyPasswordResetTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.resetPassword();
        accountSteps.inputResetPasswordField();
        accountSteps.verifyPasswordResetSuccessMessage("Password reset email has been sent.");

    }
}
