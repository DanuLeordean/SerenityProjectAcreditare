package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage extends BasePage {

    @FindBy (id ="billing_first_name")
    private WebElementFacade billingFirstName;
    @FindBy (id = "billing_last_name")
    private WebElementFacade billingLastName;
    @FindBy (id = "billing_company")
    private WebElementFacade billingCompanyName;
    @FindBy (id = "billing_address_1")
    private WebElementFacade billingAddress1;
    @FindBy (id = "billing_address_2")
    private WebElementFacade billingAddress2;
    @FindBy (id = "billing_city")
    private WebElementFacade billingCity;
    @FindBy(id = "billing_country")
    private WebElementFacade billingCountrySelector;
    @FindBy(id = "#select2-billing_country-container")
    private WebElementFacade countySelector;
    @FindBy (id = "billing_postcode")
    private WebElementFacade billingPostcode;
    @FindBy (id = "billing_phone")
    private WebElementFacade billingPhone;
    @FindBy (id = "billing_email")
    private WebElementFacade billingEmail;
    @FindBy (id = "order_comments")
    private WebElementFacade orderComments;
    @FindBy (id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(className = "woocommerce-order-details__title")
    private WebElementFacade orderSuccessMessage;
    @FindBy(css = ".cart-subtotal")
    private WebElementFacade checkoutTotal;
    @FindBy(css = "tr.order-total")
    private WebElementFacade orderTotal;
    @FindBy(css = "#post-6 > div > div > div:nth-child(1)")
    private WebElementFacade returningCostumerMessage;
    @FindBy(css = "#post-6 > div > div > div:nth-child(3)")
    private WebElementFacade clickToEnterCouponMessage;
    @FindBy(css = "#post-6 > div > div > form.checkout.woocommerce-checkout > div.woocommerce-NoticeGroup.woocommerce-NoticeGroup-checkout > ul")
    private WebElementFacade emptyRequiredFieldAlert;
    @FindBy (id = "ship-to-different-address-checkbox")
    private WebElementFacade shipToADifferentAddressButton;
    @FindBy (id = "shipping_first_name")
    private WebElementFacade shippingFirstName;
    @FindBy (id = "shipping_last_name")
    private WebElementFacade shippingLastName;
    @FindBy (id = "shipping_company")
    private WebElementFacade shippingCompanyName;
    @FindBy (id = "shipping_address_1")
    private WebElementFacade shippingAddress1;
    @FindBy (id = "shipping_address_2")
    private WebElementFacade shippingAddress2;
    @FindBy (id = "shipping_city")
    private WebElementFacade shippingCity;
    @FindBy (id = "shipping_postcode")
    private WebElementFacade shippingPostcode;
    @FindBy (id ="order_comments")
    private WebElementFacade orderComments2;

    public void completeCheckoutFields(){
        billingFirstName.type("Danut Ilie");
        billingLastName.type("Leordean");
        billingCompanyName.type("Danu's Company");
        billingCountrySelector.selectByValue("ET");
        billingAddress1.type("Strada Dunarii");
        billingAddress2.type("Cartier Intre Lacuri");
        billingCity.type("Cluj-Napoca");
        countySelector.type("Cluj");
        billingPostcode.type("400436");
        billingPhone.type("0756907181");
        billingEmail.type("danuwenthome@gmail.com");
        orderComments.type("Please call ahead");
    }

    public void placeOrder(){
        placeOrderButton.click();
    }

    public void shipToADifferentAddress(){
        shipToADifferentAddressButton.click();
    }

    public void completeShipToADifferentAddressFields(){
        shippingFirstName.type("Vasile");
        shippingLastName.type("Leordean");
        shippingCompanyName.type("Vasile's Company");
        shippingAddress1.type("Str Principala");
        shippingAddress2.type("");
        shippingCity.type("Leordina");
        shippingPostcode.type("562258");
        orderComments2.type("Thank you!");
    }

    public void orderSuccessMessage(String message){
        waitFor(orderSuccessMessage);
        orderSuccessMessage.shouldContainOnlyText(message);
    }

    public boolean checkoutCouponMessage(){
        if(clickToEnterCouponMessage.isCurrentlyVisible())
            return true;
        else{
            return false;
        }
    }

    public boolean checkCheckoutPriceAndFinalOrderPrice(){
        int checkoutPrice = getPriceFromString(checkoutTotal.getText());
        System.out.println(checkoutTotal.getText());
        int expected = getPriceFromString(orderTotal.getText());
        System.out.println(orderTotal.getText());
        return checkoutPrice==expected;
    }
    public void checkReturningCustomerBox (String message){
        returningCostumerMessage.shouldContainOnlyText(message);
    }

    public boolean checkRequiredFieldsAlert(){
        if (emptyRequiredFieldAlert.isCurrentlyVisible())
            return true;
        else{
            return false;
        }
    }
}
