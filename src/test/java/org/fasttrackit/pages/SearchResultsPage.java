package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(id = "primary")
    private List<WebElementFacade> productsList;

    @FindBy(css = "select.orderby")
    private WebElementFacade sortByDropdownMenu;

    @FindBy(css = "nav.woocommerce-pagination > ul")
    private WebElementFacade pageNumbers;

    public boolean checkListForProduct(String productName){
        for (WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector("#post-36 > header > h2")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }

    public void selectProductFromList(String product){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector("#post-36 > header > h2")).getText().equalsIgnoreCase(product)){
                element.findElement(By.cssSelector("#post-36 > header > h2")).click();
                break;
            }
        }
    }

    public void selectSortBy(String label){
        selectFromDropdown(sortByDropdownMenu,label);
    }

    public boolean verifyCorrectItemOrderIsSelected(String label){
        if(sortByDropdownMenu.getFirstSelectedOptionVisibleText().equals(label))
            return true;
        else{
            return false;
        }
    }
}
