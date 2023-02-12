package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class CheckoutPage extends PageObject {

    @FindBy (css = "[id='menu-item-65']")
    private WebElementFacade checkoutButton;

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

    public void clickOnCheckoutButton() {
        clickOn(checkoutButton);
    }
    public void setBillingFirstName(String value){
        typeInto(billingFirstName, value);
    }
    public void setBillingLastName (String value){
        typeInto(billingLastName, value);
    }

    public void setBillingCompanyName(String value){
        typeInto(billingCompanyName, value);
    }
    public void setBillingAddress1 (String value){
        typeInto(billingAddress1, value );
    }
    public void setBillingAddress2 (String value){
        typeInto(billingAddress2, value);
    }
    public void setBillingCity(String value){
        typeInto(billingCity, value);
    }
    public void setBillingPostcode (String value){
        typeInto(billingPostcode, value);
    }
    public void setBillingPhone (String value){
        typeInto(billingPhone, value);
    }
    public void setBillingEmail(String value){
        typeInto(billingEmail, value);
    }
    public void clickOnPlaceButton(){
        clickOn(placeOrderButton);
    }
    public void setOrderNotes(String value){
        typeInto(orderComments, value);
    }
    public void clickOnShipToADifferentAddress(){
        clickOn(shipToADifferentAddressButton);
    }
    public void setShippingFirstName(String value){
        typeInto(shippingFirstName,value);
    }
    public void setShippingLastName(String value){
        typeInto(shippingLastName, value);
    }
    public void setShippingCompanyName(String value){
        typeInto (shippingCompanyName, value);
    }
    public void setShippingAddress1(String value){
        typeInto(shippingAddress1, value);
    }
    public void setShippingAddress2(String value){
        typeInto(shippingAddress2, value);
    }
    public void setShippingCity(String value){
        typeInto(shippingCity, value);
    }
    public void setShippingPostcode (String value){
        typeInto(shippingPostcode,value);
    }
    public void setOrderCommentsForDifferentAddress(String value){
        typeInto(orderComments2, value);
    }

}
