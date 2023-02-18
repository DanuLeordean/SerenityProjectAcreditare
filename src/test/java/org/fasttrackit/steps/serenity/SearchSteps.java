package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void doSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }
    @Step
    public void verifyProductInResults(String productName){
        Assert.assertTrue(searchResultsPage.checkListForProduct(productName));
    }
    @Step
    public void changeItemSorting(String label){
        searchResultsPage.selectSortBy(label);
    }
    @Step
    public void verifyCorrectSortingOptionIsSelected(String label){
        searchResultsPage.verifyCorrectItemOrderIsSelected(label);
        Assert.assertTrue(searchResultsPage.verifyCorrectItemOrderIsSelected(label));
    }


}
