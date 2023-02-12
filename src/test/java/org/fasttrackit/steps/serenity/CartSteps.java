package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;

public class CartSteps extends ScenarioSteps {

  //  private ShopPage shopPage;
    private HomePage homePage;
    private ProductPage productPage;



    @Step
    public void navigateToShopPage(){
        homePage.open();
   //     shopPage.clickOnShopButton();
    }
    @Step
    public void addProductToCart(){

   //     shopPage.addProductToCart();
    }


}
