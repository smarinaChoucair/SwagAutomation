package com.co.choucair.swag.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.choucair.swag.userinterfaces.Cart.*;
import static com.co.choucair.swag.utils.Constantes.*;

public class ClickToCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Ensure.that(SELECTED_PRODUCT_NAME_CART).textContent().contains(PRODUCT_NAME_COMPARATOR),
            Click.on(TO_CHECKOUT_BTN)
        );
    }

    public static ClickToCheckout toCheckout(){
        return Instrumented.instanceOf(ClickToCheckout.class).withProperties();
    }
}
