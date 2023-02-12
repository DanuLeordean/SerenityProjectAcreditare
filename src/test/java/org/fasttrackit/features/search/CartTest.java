package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private CartSteps addToCartSteps;

    @Before
    public void maximizeBrowser(){
        driver.manage().window().maximize();}

    @Test
    public void addToCartTest(){
        addToCartSteps.navigateToShopPage();
        addToCartSteps.addProductToCart();

    }
}
