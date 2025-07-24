package org.example.template_method;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}
