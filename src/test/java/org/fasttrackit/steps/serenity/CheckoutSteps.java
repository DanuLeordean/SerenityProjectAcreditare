package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.bcel.generic.CHECKCAST;
import org.fasttrackit.pages.CheckoutPage;
import org.junit.Assert;
public class CheckoutSteps extends ScenarioSteps {

    private CheckoutPage checkoutPage;

    @Step
    public void completeCheckout(){
        checkoutPage.completeCheckoutFields();
    }

    @Step
    public void placeOrder(){
        checkoutPage.placeOrder();
    }

    @Step
    public void verifySuccessfulMessage(String message){
        checkoutPage.orderSuccessMessage(message);
        Assert.assertEquals("Order details", message);
    }

    @Step
    public void verifyCheckoutCouponMessage(){
        Assert.assertTrue(checkoutPage.checkoutCouponMessage());
    }

    @Step
    public void verifyReturningCostumerMessageBox(String message){
        checkoutPage.checkReturningCustomerBox(message);
        Assert.assertEquals("Returning customer? Click here to login", message);
    }

    @Step
    public void verifyMandatoryFieldAlert(){
        Assert.assertTrue(checkoutPage.checkRequiredFieldsAlert());
    }

    @Step
    public void clickShipToADifferentAddress(){
        checkoutPage.shipToADifferentAddress();
    }

    @Step
    public void completeCheckoutToADifferentAddress(){
        checkoutPage.completeShipToADifferentAddressFields();
    }
}
