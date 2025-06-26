package org.example.intepritator;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Parcer parcer = new Parcer();
        parcer.parcerMethod("вверх вверх вверх", robot);
        System.out.println(robot.getY());
    }
}
