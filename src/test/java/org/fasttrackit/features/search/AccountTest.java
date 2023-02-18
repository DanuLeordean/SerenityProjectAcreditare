package org.fasttrackit.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class AccountTest extends BaseTest{

    @Test
    public void verifySuccessfulLogoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        accountSteps.logOut();
        accountSteps.logOutAssertion();
    }

    @Test
    public void verifyAccountButtonTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        accountSteps.verifyIfAccountButtonsCanInteract();
    }
}
