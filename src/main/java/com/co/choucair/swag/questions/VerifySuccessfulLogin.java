package com.co.choucair.swag.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class VerifySuccessfulLogin implements Question<String> {
    protected Target element;

    public VerifySuccessfulLogin(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static Question<String> login(Target element) {
        return new VerifySuccessfulLogin(element);
    }
}
