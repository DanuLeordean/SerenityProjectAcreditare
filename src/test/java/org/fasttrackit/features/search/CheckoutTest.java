package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;


public class CheckoutTest extends BaseTest {


    @Test
    public void verifySuccessfulPurchaseTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        productSteps.clickAddToCart();
        accountSteps.goToCheckout();
        checkoutSteps.completeCheckout();
        checkoutSteps.placeOrder();
        checkoutSteps.verifySuccessfulMessage("Order details");
    }

    @Test
    public void verifyShippingToADifferentAddress(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        productSteps.clickAddToCart();
        accountSteps.goToCheckout();
        checkoutSteps.clickShipToADifferentAddress();
        checkoutSteps.completeCheckoutToADifferentAddress();
        checkoutSteps.placeOrder();
        checkoutSteps.verifySuccessfulMessage("Order details");
    }

    @Test
    public void verifyCheckoutCouponMessageTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        accountSteps.goToCheckout();
        checkoutSteps.verifyCheckoutCouponMessage();
    }

    @Test
    public void verifyMandatoryFieldsAlertTest(){
        loginSteps.navigateToHomepage();
        searchSteps.doSearch("Beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        productSteps.clickAddToCart();
        accountSteps.goToCheckout();
        checkoutSteps.placeOrder();
        checkoutSteps.verifyMandatoryFieldAlert();
    }

    @Test
    public void verifyReturningCostumerTest(){
        loginSteps.navigateToHomepage();
        searchSteps.doSearch("Beanie");
        productSteps.selectProductFromList("Beanie with logo");
        productSteps.clickAddToCart();
        accountSteps.goToCheckout();
        checkoutSteps.verifyReturningCostumerMessageBox("Returning customer? Click here to login");
    }
}
