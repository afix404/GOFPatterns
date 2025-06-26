package org.example.abstract_factory.a;

public interface SupportHandler {

    void setNext(SupportHandler next);

    void requestHandle(String request);


}
