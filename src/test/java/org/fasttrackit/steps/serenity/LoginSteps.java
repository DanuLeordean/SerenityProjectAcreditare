package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {
    private LoginPage loginPage;
    private HomePage homePage;
    private AccountPage accountPage;

    @Step
    public void navigateToHomepage(){homePage.open();}

    @Step
    public void navigateToLoginPage(){homePage.clickOnAccountButton();}


    @Step
    public void setCredentials (String email, String password){
        loginPage.setLoginUsernameField(email);
        loginPage.setLoginPasswordField(password);
    }

    @Step
    public void clickOnRememberMe(){loginPage.clickRememberMeBox();}
    @Step
    public void clickLoginButton(){loginPage.clickLoginButton();}

    @Step
    public void verifyUsernameMessage(String username){
        accountPage.verifyWelcomeMessage(username);
    }
    @Step
    public void doLogin (String email, String password) {
        navigateToHomepage();
        navigateToLoginPage();
        setCredentials(email,password);
        clickOnRememberMe();
        clickLoginButton();
    }

    @Step
    public void verifySignInErrorMessage(String error){
        loginPage.verifySignInErrorMessage(error);
    }
    @Step
    public void verifyMissingUsernameError(String error){
        loginPage.verifyLoginErrorMessage(error);
    }
    @Step
    public void resetPassword(){
        loginPage.clickLostPasswordButton();
    }
}
