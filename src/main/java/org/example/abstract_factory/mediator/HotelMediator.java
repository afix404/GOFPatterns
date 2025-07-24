package org.example.abstract_factory.mediator;

public interface HotelMediator {

    void reception(Integer roomNumber, Guest guest);

    void cleaning(Integer roomNumber);


}
