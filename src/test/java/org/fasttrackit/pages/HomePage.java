package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-64 > a")
    private WebElementFacade accountButton;

    @FindBy(id = "reg_email")
    private WebElementFacade registerEmailField;

    @FindBy(id = "reg_password")
    private WebElementFacade registerPasswordField;

    @FindBy(css = "[name='register']")
    private WebElementFacade registerButton;

    public HomePage() {
    }

    public void clickOnAccountButton(){
        clickOn(accountButton);
    }
    public void clickOnRegisterEmailField (String value){
        typeInto(registerEmailField, value);
    }
    public void clickOnRegisterPasswordField(String value){
        typeInto(registerPasswordField, value);
    }
    public void clickOnRegisterButton (){
        clickOn(registerButton);
    }




}
