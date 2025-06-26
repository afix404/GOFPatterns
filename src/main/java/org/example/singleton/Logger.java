package org.example.singleton;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static  Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
    void info(String message){
        System.out.println("[INFO] " + LocalDateTime.now() + " " + message);
    }
    void error(String errorMessage){
        throw new Error(errorMessage);
    }


}
