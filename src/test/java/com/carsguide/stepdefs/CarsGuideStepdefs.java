package com.carsguide.stepdefs;

import com.carsguide.pages.Homepage;
import com.carsguide.pages.SearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CarsGuideStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        new Homepage();

    }

    @And("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() {
        new Homepage().mouseHoverOnBuyPlusSellTab();
    }

    @When("^I click on Search cars tab$")
    public void iClickOnSearchCarsTab() {
        new Homepage().clickOnSearchCars();
    }

    @Then("^I should navigate and see \"([^\"]*)\" page$")
   public void iShouldNavigateAndSeePage(String searchpgmsg) {
        Assert.assertEquals(searchpgmsg,new Homepage().getTextFromSearchCarsPage());
   }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
        new SearchPage().selectCarMakeFromDropDown(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)  {
        new SearchPage().selectCarModelFromDropDown(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location){
        new SearchPage().selectLocationOfTheCarFromDropDown(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price){

        new SearchPage().selectPriceOfTheCarFromDropDown(price);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SearchPage().findMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\"in results$")
    public void iShouldSeeTheMakeInResults(String makemessage)  {
        Assert.assertTrue(makemessage,new SearchPage().verifyCarMakeInTheResults().contains(makemessage));

    }
}
