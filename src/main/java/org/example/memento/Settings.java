package org.example.memento;

public class Settings {

    String theme;

    Integer shriftSize;

    String language;

    public Settings(String theme, Integer shriftSize, String language) {
        this.theme = theme;
        this.shriftSize = shriftSize;
        this.language = language;
    }

    void SwitchTheme(String theme){
        if(theme.equals("dark")){
            this.theme = "light";
        }
        if(theme.equals("light")){
            this.theme = "dark";
        }
    }
    void shriftSetSize(Integer size){
        this.shriftSize = size;
    }
    void changeLanguage(String language){
        this.language = language;
    }

}
