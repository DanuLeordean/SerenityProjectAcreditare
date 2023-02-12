package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.bcel.Constants;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.junit.Assert;

public class AccountSteps extends ScenarioSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Step
    public void verifyPasswordResetSuccessMessage(String alert){
        accountPage.verifyPasswordResetAlert(alert);
        Assert.assertTrue(alert.equals("Password reset email has been sent."));
    }

    @Step
    public void inputResetPasswordField(){
        accountPage.setLostPasswordField("danuwenthome@gmail.com");
        accountPage.clickResetPasswordButton();
    }

    @Step
    public void goToCheckout(){
        accountPage.clickCheckoutButton();
    }

    @Step
    public void logOutAssertion(){
        Assert.assertTrue(accountPage.logOutAssertion());
    }

    @Step
    public void goToShop(){
        accountPage.clickOnShopButton();
    }
    public void verifyIfAccountButtonsAreInteractible(){
        Assert.assertTrue(accountPage.checkAccountButtonsAreInteractible());
    }


}
