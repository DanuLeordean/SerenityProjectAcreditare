package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(css = "button.single_add_to_cart_button.button,alt")
    private WebElementFacade addToCartButton;

    @FindBy(css = "a.cart-control")
    private WebElementFacade viewCartButton;

    @FindBy(css = ".input-text.qty.text")
    private WebElementFacade inputProductQuantity;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void viewCart(){
        viewCartButton.click();
    }

    public void adjustProductQuantity(){
        waitFor(inputProductQuantity).waitUntilClickable();
        inputProductQuantity.select();
        typeInto(inputProductQuantity,"5");
    }

    public int getProductQuantity(){
        int a = Integer.parseInt(inputProductQuantity.getValue());
        System.out.println(a);
        System.out.println("ProductPage");
        return a;
    }

}
