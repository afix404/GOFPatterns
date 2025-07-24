package org.example.template_method;

public class Main {
    public static void main(String[] args) {
        Beverage tea1 = new Tea();
        System.out.println("Делаем чай: ");
        tea1.prepareBeverage();

        Beverage coffee1 = new Coffee();
        System.out.println("Делаем кофе: ");
        coffee1.prepareBeverage();
    }
}
