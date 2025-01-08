package com.co.choucair.swag.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateSuccesfulBuy implements Question<String> {

    protected Target element;

    public ValidateSuccesfulBuy(Target element){
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static Question<String> validateBuy(Target element){
        return new ValidateSuccesfulBuy(element);
    }

}
