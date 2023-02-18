package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

    public int getPriceFromString(String price) {
        String priceFinal = price.replace("lei", "")
                .replace(",", "")
                .replace("Subtotal", "")
                .replace(" \"\" ", "")
                .trim()
                .replace("Total", "")
                .trim();

        try {
            int a = Integer.parseInt(priceFinal);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        }
        System.out.println("Continuing execution...");
        return Integer.parseInt(priceFinal);
    }

}
