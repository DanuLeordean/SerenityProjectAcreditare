package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private CheckoutPage checkoutPage;




    @Step

    public void navigateToAccountPage(){
        homePage.open();
        homePage.clickOnAccountButton();
    }

    @Step

    public void typeRegisterEmail (String email){
        homePage.clickOnRegisterEmailField(email);
    }
    public void typeRegisterPassword (String password){
        homePage.clickOnRegisterPasswordField(password);
    }

    @Step
    public void clickOnRegister(){
        homePage.clickOnRegisterButton();
    }
}
