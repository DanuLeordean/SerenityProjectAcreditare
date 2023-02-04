package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.RegisterSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Before
    public void maximizeBrowser(){
    driver.manage().window().maximize();}

    @Test
    public void registerTest(){
        registerSteps.navigateToAccountPage();
        registerSteps.typeRegisterEmail("danuwenthome@gmail.com");
        registerSteps.typeRegisterPassword("Sserenity!123");
        registerSteps.clickOnRegister();
    }
}
