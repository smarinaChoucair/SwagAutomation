package com.co.choucair.swag.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInfo {

    public static final Target FIELD_FIRST_NAME = Target.the("first name text field")
            .locatedBy("//input[@id=\"first-name\"]");

    public static final Target FIELD_LAST_NAME = Target.the("last name text field")
            .locatedBy("//input[@id=\"last-name\"]");

    public static final Target POSTAL_CODE = Target.the("postal code text field")
            .locatedBy("//input[@id=\"postal-code\"]");

    public static final Target BTN_CONTINUE = Target.the("checkout continue button")
            .locatedBy("//input[@class=\"btn_primary cart_button\"]");
}
