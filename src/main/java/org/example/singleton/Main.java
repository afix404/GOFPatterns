package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Weather weather = new Weather();
        Logger logger2 = Logger.getInstance();
        City city = new City("Питер" ,"10мм" , "20", "облачно");
        City city2 = new City("НеПитер" ,"10мм" , "20", "облачно");
        System.out.println(logger==logger2);
        weather.cloudy(city);
        weather.cloudy(city2);
      

    }




}
