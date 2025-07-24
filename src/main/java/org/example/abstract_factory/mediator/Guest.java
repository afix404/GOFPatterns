package org.example.abstract_factory.mediator;

public class Guest {

    private HotelMediatorImpl hotelMediator;

    private Integer room;
    private String name;

    public Guest(HotelMediatorImpl hotelMediator, String name) {
        this.hotelMediator = hotelMediator;
        this.name = name;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cleaning() {
        hotelMediator.cleaning(room);
    }

    public void reception(Integer room) {

        hotelMediator.reception(room, this);
        this.room = room;

    }




}
