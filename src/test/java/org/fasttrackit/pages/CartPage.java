package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = "main > div.woocommerce-message")
    private WebElementFacade successMessage;

    @FindBy(css = ".product-remove a.remove")
    private WebElementFacade removeButton;

    @FindBy(css = "#post-5 > div > div.woocommerce-message")
    private WebElementFacade productRemovedAlert;

    @FindBy(css = "main div a.button.wc-forward")
    private WebElementFacade viewCartButton;

    @FindBy(css = ".product-subtotal > span.woocommerce-Price-amount.amount")
    private List<WebElementFacade> listOfProductsSubtotalSpan;

    @FindBy(css = ".cart-subtotal")
    private WebElementFacade cartSubtotalPriceSpan;

    @FindBy(css = ".input-text.qty.text")
    private WebElementFacade cartQuantityField;

    @FindBy(css = "div input.button")
    private WebElementFacade couponButton;

    @FindBy(css = "ul.woocommerce-error")
    private WebElementFacade couponAlertMessage;

    @FindBy(css = "input#coupon_code.input-text")
    private WebElementFacade couponCodeTextField;

    @FindBy (css = "#post-11 > div > div > div")
    private WebElementFacade emptyCartAlertMessage;

    public CartPage() {
    }

    public void verifySuccessMessage(String alertMessage){
        viewCartButton.shouldContainOnlyText("View cart");
    }
    public void removeProductFromCheckout(){
        removeButton.click();
    }
    public void verifyProductRemovalMessage(String productName){
        productRemovedAlert.shouldContainOnlyText("“" + productName + "”" + " removed. Undo?");
    }

    public int getSubtotalPriceFromProducts() {
        int sum = 0;
        for (WebElementFacade element : listOfProductsSubtotalSpan) {
            sum += getPriceFromString(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCalculatedCorrectly(){
        int subtotalPrice = getPriceFromString(cartSubtotalPriceSpan.getText());
        int expected = getSubtotalPriceFromProducts();
        System.out.println("ok");
        return subtotalPrice == expected;
    }

    public int getCartQuantity(){
        int a = Integer.parseInt(cartQuantityField.getValue());
        System.out.println(a);
        System.out.println("Cart");
        return a;
    }

    public void clickCouponButton(){
        couponButton.click();
    }

    public void verifyEmptyCouponMessage(String alertMessage){
        couponAlertMessage.getText();
        couponAlertMessage.shouldContainOnlyText("Please enter  coupon code.");
    }

    public void useFakeCouponCode(String fakeCouponCode){
        couponCodeTextField.select();
        typeInto(couponCodeTextField, fakeCouponCode);
    }

    public void couponAlertMessage(String couponAlert){
        couponAlertMessage.shouldContainOnlyText(couponAlert);
    }

    public boolean checkEmptyCartMessageIsDisplayed(){
        System.out.println(emptyCartAlertMessage.getText());
        if (emptyCartAlertMessage.isCurrentlyVisible()
                && emptyCartAlertMessage.getText().equals("Checkout is not available whilst your cart is empty."))
            return true;
        else{
            return false;
        }
    }
}
