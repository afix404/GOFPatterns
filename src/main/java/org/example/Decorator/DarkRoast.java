package org.example.Decorator;

public class DarkRoast implements  CoffeInter{
    private String sostav;

    private Integer price;




    public void addSmth(String name, Integer cost){
        sostav +=  "\n" + name + "-" + cost;
        price += cost;
    }

    @Override
    public void showInfo() {
        System.out.println(sostav + " " + price);
    }

    @Override
    public String description() {
        return sostav;
    }
}
