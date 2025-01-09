package com.co.choucair.swag.stepdefinitions;

import com.co.choucair.swag.models.CheckoutLombokData;
import com.co.choucair.swag.questions.ValidateSuccesfulBuy;
import com.co.choucair.swag.task.AddProductToCart;
import com.co.choucair.swag.task.ClickToCheckout;
import com.co.choucair.swag.task.ClickToFinishBuy;
import com.co.choucair.swag.task.TypePersonalCheckoutInformation;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.choucair.swag.userinterfaces.Finish.CONFIRMATION_TITLE;
import static com.co.choucair.swag.userinterfaces.Products.SELECTED_PRODUCT_NAME;
import static com.co.choucair.swag.utils.Constantes.ACTOR;
import static org.hamcrest.Matchers.containsString;

public class BuyStepDefinitions {

    @When("adds some products to the cart")
    public void addsSomeProductsToTheCart() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                AddProductToCart.addToCart(SELECTED_PRODUCT_NAME)
        );
    }

    @When("checks that exactly chosen product is on the cart")
    public void checksThatExactlyChosenProductIsOnTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickToCheckout.toCheckout()
        );
    }

    @When("fills the checkout personal information fields")
    public void fillsTheCheckoutPersonalInformationFields(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TypePersonalCheckoutInformation.typeCheckoutInfo(CheckoutLombokData.setCheckoutData(table).get(0))
        );
    }

    @When("checks that exactly chosen product is on the checkout overview")
    public void checksThatExactlyChosenProductIsOnTheCheckoutOverview() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ClickToFinishBuy.finishBuy()
        );
    }

    @Then("^he will see the message (.*) on screen$")
    public void heWillSeeTheMessageMessageOnScreen(String message) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateSuccesfulBuy.validateBuy(CONFIRMATION_TITLE), containsString(message))
        );
    }

}
