package com.co.choucair.swag.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Cart {

    public static final Target SELECTED_PRODUCT_NAME_CART = Target.the("selected product")
            .locatedBy(("//a[@id=\"item_4_title_link\"]/div"));

    public static final Target TO_CHECKOUT_BTN = Target.the("checkout button")
            .locatedBy("//a[@class=\"btn_action checkout_button\"]");

}
