package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")

public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade loginUsernameField;
    @FindBy(id = "password")
    private WebElementFacade loginPasswordField;
    @FindBy(id="rememberme")
    private WebElementFacade rememberMeBox;
    @FindBy(css="[name='login']")
    private WebElementFacade loginButton;

    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade missingUsernameError;

    @FindBy (css = "#post-7 > div > div > ul > li")
    private WebElementFacade signInErrorMessage;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p.woocommerce-LostPassword.lost_password > a")
    private WebElementFacade lostYourPasswordButton;

    @FindBy(id = "user_login")
    private WebElementFacade lostPasswordField;

    @FindBy(css = "#post-7 > div > div > form > p:nth-child(4) > button")
        private WebElementFacade resetPasswordButton;




    public void setLoginUsernameField(String value){
        typeInto(loginUsernameField, value);}
    public void setLoginPasswordField(String value){

        typeInto(loginPasswordField,value);
    }
    public void clickRememberMeBox(){

        clickOn(rememberMeBox);
    }
    public void clickLoginButton(){

        clickOn(loginButton);
    }

    public void verifySignInErrorMessage(String error) {

        signInErrorMessage.shouldContainOnlyText(error);
    }
    public void verifyLoginErrorMessage(String error){

        missingUsernameError.shouldContainOnlyText(error);
    }
    public void clickLostPasswordButton(){
        lostYourPasswordButton.click();
    }
}
