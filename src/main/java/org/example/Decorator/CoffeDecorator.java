package org.example.Decorator;

public abstract class CoffeDecorator implements CoffeInter{

    protected CoffeInter coffeInter;

    public CoffeDecorator(CoffeInter coffeInter) {
        this.coffeInter = coffeInter;
    }

    @Override
    public void showInfo() {
        coffeInter.showInfo();
    }

    @Override
    public String description() {
        return "";
    }
}
