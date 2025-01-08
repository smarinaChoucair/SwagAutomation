package com.co.choucair.swag.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutOverview {

    public static final Target SELECTED_PRODUCT_NAME = Target.the("selected product in checkout overview page")
            .locatedBy(("//a[@id=\"item_4_title_link\"]/div"));

    public static final Target BTN_FINISH = Target.the("finish button")
            .locatedBy("//A[text()=\"FINISH\"]");

}
