package com.co.choucair.swag.stepdefinitions;

import com.co.choucair.swag.models.CheckoutLombokData;
import com.co.choucair.swag.models.LoginLombokData;
import com.co.choucair.swag.questions.ValidateSuccesfulBuy;
import com.co.choucair.swag.questions.VerifySuccessfulLogin;
import com.co.choucair.swag.task.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.choucair.swag.userinterfaces.Finish.*;
import static com.co.choucair.swag.userinterfaces.Products.*;
import static com.co.choucair.swag.utils.Constantes.*;
import static org.hamcrest.Matchers.containsString;

public class LoginOnSwagSiteStepdefinitions {

    //@Login
    @Given("that the user was on the website")
    public void thatTheUserWasOnTheWebsite() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(
                Open.url(URL_SWAGLABS)
        );
    }

    @When("attempts to login with the correct credentials")
    public void attempsToLoginWithTheCorrectCredentials(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TypeLoginCredentials.login(LoginLombokData.setLoginData(table).get(0))
        );
    }

    @Then("^he will see the title (.*) on screen$")
    public void heWillSeeTheTitleProductsOnScreen(String title) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(VerifySuccessfulLogin.login(BANNER_PRODUCTS), containsString(title))
        );
    }

    //@Buy
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
