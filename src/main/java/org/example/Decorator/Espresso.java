package org.example.Decorator;

public class Espresso implements CoffeInter{

    private String sostav;

    private Integer price;

    @Override
    public void showInfo() {
        System.out.println(sostav + " " + price);
    }

    @Override
    public String description() {
        return sostav;
    }




    /*public void addSmth(String name, Integer cost){
        sostav +=  "\n" + name + "-" + cost;
        price += cost;
    }*/


}
