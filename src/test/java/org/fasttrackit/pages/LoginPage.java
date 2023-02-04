package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")

public class LoginPage extends PageObject {

    @FindBy(css = "#menu-item-64 > a")
    private WebElementFacade accountButton;

    @FindBy(id = "username")
    private WebElementFacade loginUsernameField;

    @FindBy(id = "password")
    private WebElementFacade loginPasswordField;

    @FindBy(id="rememberme")
    private WebElementFacade rememberMeBox;

    @FindBy(css="[name='login']")
    private WebElementFacade loginButton;

    public void clickOnAccountButton (){
        clickOn(accountButton);
    }
    public void setLoginUsernameField(String value){
        typeInto(loginUsernameField, value);
    }
    public void setLoginPasswordField(String value){
        typeInto(loginPasswordField,value);
    }
    public void clickRememberMeBox(){
        clickOn(rememberMeBox);
    }
    public void clickLoginButton(){
        clickOn(loginButton);
    }


}
