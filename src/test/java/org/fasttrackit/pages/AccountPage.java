package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PageObject {

    @FindBy(css = "#menu-item-64 > a")
    private WebElementFacade accountButton;
    @FindBy (css = "#post-7 > div > div > div > p:nth-child(1) > strong:nth-child(1)")
    private WebElementFacade welcomeMessage;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p.woocommerce-LostPassword.lost_password > a")
    private WebElementFacade lostYourPasswordButton;
    @FindBy(id = "user_login")
    private WebElementFacade lostPasswordField;

    @FindBy(css = "#menu-item-65 > a")
    private WebElementFacade checkoutButton;

    @FindBy(css = "#post-7 > div > div > form > p:nth-child(4) > button")
    private WebElementFacade resetPasswordButton;

    @FindBy(css = "#post-7 > div > div > div")
    private WebElementFacade passwordResetAlert;

    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout > a")
    private WebElementFacade logoutButton;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > h2")
    private WebElementFacade logoutAssertion;

    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--orders > a")
    private WebElementFacade ordersButton;

    @FindBy(css = "#menu-item-66 > a")
    private WebElementFacade shopButton;

    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--downloads > a")
    private WebElementFacade downloadsButton;

    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-address > a")
    private WebElementFacade addressesButton;

    @FindBy(css = "#post-7 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-account > a")
    private WebElementFacade accountDetailsButton;

    public void verifyWelcomeMessage(String userName) {
        welcomeMessage.shouldContainOnlyText(userName);
    }
    public void setLostPasswordField(String email) {
        typeInto(lostPasswordField, email);
    }
    public void verifyPasswordResetAlert(String alert) {
        passwordResetAlert.shouldContainOnlyText(alert);
    }
    public void clickCheckoutButton(){clickOn(checkoutButton);}
    public void clickOnShopButton(){clickOn(shopButton);}

    public void clickResetPasswordButton(){clickOn(resetPasswordButton);}

    public boolean logOutAssertion(){
        if(logoutAssertion.isCurrentlyVisible())
            return true;
        else {
            return false;
        }
    }
    public boolean checkAccountButtonsAreInteractible(){
        if(ordersButton.isClickable()&& ordersButton.isCurrentlyVisible()
        &&downloadsButton.isClickable() &&downloadsButton.isCurrentlyVisible()
        &&addressesButton.isClickable()&&addressesButton.isCurrentlyVisible()
        &&accountDetailsButton.isClickable()&&accountDetailsButton.isCurrentlyVisible()
        &&logoutButton.isClickable()&& logoutButton.isCurrentlyVisible())
            return true;
        else {
            return false;
        }
    }
}
