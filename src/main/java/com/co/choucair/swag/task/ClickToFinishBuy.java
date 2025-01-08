package com.co.choucair.swag.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.choucair.swag.userinterfaces.CheckoutOverview.BTN_FINISH;
import static com.co.choucair.swag.userinterfaces.CheckoutOverview.SELECTED_PRODUCT_NAME;
import static com.co.choucair.swag.utils.Constantes.PRODUCT_NAME_COMPARATOR;

public class ClickToFinishBuy implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(SELECTED_PRODUCT_NAME).textContent().contains(PRODUCT_NAME_COMPARATOR),
                Click.on(BTN_FINISH)
        );
    }

    public static ClickToFinishBuy finishBuy() {
        return Instrumented.instanceOf(ClickToFinishBuy.class).withProperties();
    }

}
