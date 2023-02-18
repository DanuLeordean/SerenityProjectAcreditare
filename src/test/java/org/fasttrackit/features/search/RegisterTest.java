package org.fasttrackit.features.search;

import org.fasttrackit.features.search.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;
import org.openqa.selenium.By;
import org.fasttrackit.pages.RegisterPage;


public class RegisterTest extends BaseTest {

    @Test
    public void registerWithValidCredentialsTest(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegister();
        String USER = Constants.USER_RANDOM_EMAIL;
        registerSteps.setCredentials(USER, Constants.USER_RANDOM_PASSWORD);
        registerSteps.clickOnRegister();
        registerSteps.verifyUsernameMessage(USER.substring(0, USER.length() -10));
    }

    @Test
    public void registerWithEmailAlreadyUsedTest(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegister();
        registerSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        registerSteps.clickOnRegister();
        registerSteps.verifyRegistryErrorMessage("Error: An account is already registered with your email address. Please log in.");
    }

    @Test
    public void verifyWeakPasswordAndHintAreVisibleTest(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToRegister();
        registerSteps.setCredentials(Constants.USER_RANDOM_EMAIL, "abc");
        registerSteps.verifyWeakPasswordAndHintAreVisible();
    }

}
