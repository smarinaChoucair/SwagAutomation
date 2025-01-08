package com.co.choucair.swag.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Products {

    public static final Target BANNER_PRODUCTS = Target.the("products banner")
            .locatedBy("//div[@class=\"product_label\" and contains(text(), \"Products\")]");

    public static final Target SELECTED_PRODUCT_NAME = Target.the("selected product")
            .locatedBy(("//a[@id=\"item_4_title_link\"]/div"));

    public static final Target SELECTED_PRODUCT_BTN = Target.the("selected product btn")
            .locatedBy(("//div[@class=\"inventory_list\"]/div[@class=\"inventory_item\"][1]//button"));

    public static final Target CART_LINK = Target.the("cart link")
            .locatedBy("//div[@id=\"shopping_cart_container\"]");

}
