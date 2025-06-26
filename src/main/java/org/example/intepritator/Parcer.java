package org.example.intepritator;

public class Parcer {

    public void  parcerMethod(String string, Robot robot){
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals("вверх")){
                robot.moveUp();
            }


        }
    }


}
