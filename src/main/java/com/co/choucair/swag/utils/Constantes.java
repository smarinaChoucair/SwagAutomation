package com.co.choucair.swag.utils;

import net.serenitybdd.screenplay.actors.OnStage;

public class Constantes {

    public static final String ACTOR = "user";
    public static final String URL_SWAGLABS = "https://www.saucedemo.com/v1/";

    public static String PRODUCT_NAME_COMPARATOR = OnStage.theActorInTheSpotlight().recall("productName");
}
