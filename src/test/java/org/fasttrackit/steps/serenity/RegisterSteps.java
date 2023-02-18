package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class RegisterSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private RegisterPage registerPage;


    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToRegister(){
        homePage.clickOnAccountButton();
    }
    @Step
    public void setCredentials(String email, String password){
        registerPage.setEmailField(email);
        registerPage.setPasswordField(password);
    }
    @Step
    public void clickOnRegister(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void verifyUsernameMessage(String userName){
        accountPage.verifyWelcomeMessage(userName);
    }
    @Step
    public void verifyRegistryErrorMessage(String Error){
        registerPage.verifyRegistryErrorMessage(Error);
    }
    @Step
    public void verifyWeakPasswordAndHintAreVisible(){
        Assert.assertTrue(registerPage.checkWeakPassAndHintareVisible());
    }
}
