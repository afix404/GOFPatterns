package org.example.abstract_factory.a;

public class Main {
    public static void main(String[] args) {
        Settings settings = new Settings();

        String request= "payment";

        Settings.authenficationSupportHandler.requestHandle(request);

    }
}
