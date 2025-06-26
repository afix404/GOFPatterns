package org.example.singleton;

public class Weather {
    private Logger logger = Logger.getInstance();

    public void temp(City city) {
        checkCity(city);
        System.out.println("Температура города " + city.getName() + " равна: " + city.getTemp());
        logger.info("Получена информация о погоде города: " + city.getName() );
    }

    public void osadki(City city) {
        checkCity(city);
        System.out.println("Осадки города " + city.getName() + " равны: " + city.getOsadki());
        logger.info("Получена информация о осадках города: " + city.getName() );
    }

    public void cloudy(City city) {
        checkCity(city);
        System.out.println("Облачность города " + city.getName() + ": " + city.getCloudy());
        logger.info("Получена информация о облачности города: " + city.getName() );
    }

    private void checkCity(City city) {
        if(city.getName() != "Москва" && city.getName() != "Питер"){
            logger.error("Сервис не работает с этим городом");
        }
    }

}
