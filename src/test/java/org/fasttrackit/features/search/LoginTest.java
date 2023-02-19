package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;


public class LoginTest extends BaseTest{

    @Test
    public void validLoginTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(Constants.USER_EMAIL,Constants.USER_PASS);
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
