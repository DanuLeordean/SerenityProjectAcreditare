package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-64 > a")
    private WebElementFacade accountButton;

    @FindBy(css = "#menu-item-66 > a")
    private WebElementFacade shopButton;

    @FindBy(css = "#menu-item-65 > a")
    private WebElementFacade checkoutButton;

    @FindBy(css = "#masthead > div > div.header-top.cl > div.search-box > i")
    private WebElementFacade searchButton;

    @FindBy(css = "#masthead > div > div.header-top.cl > div.search-box > form > input[type=text]")
    private WebElementFacade searchField;

    @FindBy(css = "#masthead > div > div.header-top.cl > div.search-box > form > button > i")
    private WebElementFacade searchButton2;


    public void clickOnAccountButton(){
        clickOn(accountButton);
    }

    public void setSearchField(String keyword){
        clickOn(searchButton);
        typeInto(searchField,keyword);
    }

    public void clickSearchIcon(){
        waitFor(searchField);
        clickOn(searchButton2);
    }
}
