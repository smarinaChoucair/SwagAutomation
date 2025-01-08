package com.co.choucair.swag.task;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static com.co.choucair.swag.userinterfaces.Products.*;

public class AddProductToCart implements Task {

    protected Target producto;
    protected String productName;

    public AddProductToCart(Target producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        productName = producto.resolveFor(actor).getText();
        actor.remember("productName", productName);
        actor.attemptsTo(
                Click.on(SELECTED_PRODUCT_BTN),
                Click.on(CART_LINK)
        );
    }

    public static AddProductToCart addToCart(Target producto) {
        return Instrumented.instanceOf(AddProductToCart.class).withProperties(producto);
    }
}
