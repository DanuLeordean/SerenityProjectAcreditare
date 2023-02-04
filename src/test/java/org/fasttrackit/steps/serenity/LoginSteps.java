package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.LoginPage;

public class LoginSteps extends ScenarioSteps {
    private LoginPage login;


    @Step

    public void navigateToLoginPage(){
        login.open();
        login.clickOnAccountButton();
    }
    @Step
    public void typeUsername(String username){
        login.setLoginUsernameField(username);
    }
    @Step
    public void typePassword(String password){
        login.setLoginPasswordField(password);
    }
    @Step
    public void clickOnRememberMe(){
        login.clickRememberMeBox();
    }
    @Step
    public void clickLoginButton(){
        login.clickLoginButton();
    }
}
