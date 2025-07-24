package org.example.template_method;

public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding a lemon...");
    }
}
