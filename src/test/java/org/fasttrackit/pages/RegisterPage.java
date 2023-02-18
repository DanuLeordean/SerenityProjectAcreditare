package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class RegisterPage extends PageObject {

    @FindBy(id = "reg_email")
    private WebElementFacade registerEmailField;
    @FindBy(id = "reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(css = "[name='register']")
    private WebElementFacade registerButton;

    @FindBy(css = "#post-7 > div > div > ul > li")
    private WebElementFacade registrationErrorMessage;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(2) > div")
    private WebElementFacade weakPasswordAlert;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(2) > small")
    private WebElementFacade weakPasswordHint;

    public void setEmailField(String email){
        typeInto(registerEmailField, email);
    }
    public void setPasswordField(String password){
        waitFor(registerPasswordField);
        withTimeoutOf(Duration.ofSeconds(30)).waitFor(registerPasswordField);
        typeInto(registerPasswordField, password);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }
    public void verifyRegistryErrorMessage(String error){
        registrationErrorMessage.shouldContainOnlyText(error);
    }
    public boolean checkWeakPassAndHintareVisible(){
        System.out.println(weakPasswordHint.getText());
        System.out.println(weakPasswordAlert.getText());
        if (weakPasswordAlert.isCurrentlyVisible()
                &&weakPasswordHint.isCurrentlyVisible()
                &&weakPasswordAlert.getText().equals
                ("Very weak - Please enter a stronger password.")
                &&weakPasswordHint.getText().equals
                ("Hint: The password should be at least twelve characters long." +
                        " To make it stronger, use upper and lower case letters, numbers, and symbols like ! \" ? $ % ^ & )."))
            return true;
        else{
            return false;
        }
    }
}
