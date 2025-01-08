package com.co.choucair.swag.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target FIELD_USER = Target.the("field for username")
            .locatedBy("//input[@id=\"user-name\"]");
    public static final Target FIELD_PASS = Target.the("field for password")
            .locatedBy("//input[@id=\"password\"]");
    public static final Target BTN_LOGIN = Target.the("button to login")
            .locatedBy("//input[@id=\"login-button\"]");

}
