package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.HomePage;

public class CheckoutSteps extends ScenarioSteps {

    private HomePage homePage;
    private CheckoutPage checkoutPage;


    @Step
    public void navigateToCheckoutPage(){
        homePage.open();
        checkoutPage.clickOnCheckoutButton();
    }

    @Step
    public void typeBillingFirstName(String value){checkoutPage.setBillingFirstName(value);}
    public void typeBillingLastName(String value){checkoutPage.setBillingLastName(value);}
    public void typeBillingCompanyName(String value){checkoutPage.setBillingCompanyName(value);}
    public void typeBillingAddress1(String value){checkoutPage.setBillingAddress1(value);}
    public void typeBillingAddress2(String value){checkoutPage.setBillingAddress2(value);}
    public void typeBillingCity(String value){checkoutPage.setBillingCity(value);}
    public void typeBillingPostcode(String value){checkoutPage.setBillingEmail(value);}
    public void typeBillingPhone(String value){checkoutPage.setBillingPhone(value);}
    public void typeBillingEmail(String value){checkoutPage.setBillingEmail(value);}
    public void typeBillingNotes(String value){checkoutPage.setOrderNotes(value);}

    @Step
    public void placeOrder(){
        checkoutPage.clickOnPlaceButton();
    }

    @Step
    public void shipToADifferentAddress(){
        checkoutPage.clickOnShipToADifferentAddress();
    }

    @Step
    public void typeShippingFirstName(String value){checkoutPage.setShippingFirstName(value);}
    public void typeShippingLastName(String value){checkoutPage.setShippingLastName(value);}
    public void typeShippingCompanyName(String value){checkoutPage.setShippingCompanyName(value);}
    public void typeShippingAddress1(String value){checkoutPage.setShippingAddress1(value);}
    public void typeShippingAddress2(String value){checkoutPage.setShippingAddress2(value);}
    public void typeShippingCity(String value){checkoutPage.setShippingCity(value);}
    public void typeShippingPostcode(String value){checkoutPage.setShippingPostcode(value);}
    public void typeOrderNotesDifferentAddress(String value){checkoutPage.setOrderCommentsForDifferentAddress(value);}

}
