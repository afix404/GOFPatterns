package org.example.abstract_factory.a;

import org.example.Facade.PaymentFacade;

public class Settings {

    static AuthenficationSupportHandler authenficationSupportHandler = new AuthenficationSupportHandler();

    static PaymentSupportHandler paymentSupportHandler = new PaymentSupportHandler();

    static  GeneralSupportHandler generalSupportHandler = new GeneralSupportHandler();

    public Settings() {
        authenficationSupportHandler.setNext(paymentSupportHandler);
        paymentSupportHandler.setNext(generalSupportHandler);
    }
}
