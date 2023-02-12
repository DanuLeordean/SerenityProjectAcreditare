package org.fasttrackit.features.search;

import io.cucumber.java.it.Ma;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CheckoutSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Before
    public void maximizeBrowser(){
        driver.manage().window().maximize();}

    @Test
    public void checkoutTest(){
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.typeBillingFirstName("Danut Ilie");
        checkoutSteps.typeBillingLastName("Leordean");
        checkoutSteps.typeBillingCompanyName("Danu's Company");
        checkoutSteps.typeBillingAddress1("Main Street, nr 3");
        checkoutSteps.typeBillingAddress2("Ap 23, 1D");
        checkoutSteps.typeBillingCity("Cluj Napoca");
        checkoutSteps.typeBillingPostcode("256846");
        checkoutSteps.typeBillingPhone("0754907181");
        checkoutSteps.typeBillingEmail("danuwenthome@gmail.com");
        checkoutSteps.typeBillingNotes("Multumesc");
        checkoutSteps.placeOrder();


    }

    @Test
    public void checkoutTestShipToADifferentAddress(){
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.shipToADifferentAddress();
        checkoutSteps.typeShippingFirstName("Danu");
        checkoutSteps.typeShippingLastName("Ilie");
        checkoutSteps.typeShippingCompanyName("Ilie's Company");
        checkoutSteps.typeShippingAddress1("Second St, 38");
        checkoutSteps.typeShippingAddress2("Bld 3, 1D");
        checkoutSteps.typeShippingCity("Zalau");
        checkoutSteps.typeShippingPostcode("558445");
        checkoutSteps.typeOrderNotesDifferentAddress("Multumesc");


    }

}
