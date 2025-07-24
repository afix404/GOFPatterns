package org.example.abstract_factory.mediator;

public class Main {
    public static void main(String[] args) {
        CleaningService cleaningService = new CleaningService();
        ReceptionService receptionService = new ReceptionService();
        HotelMediatorImpl hotelMediator = new HotelMediatorImpl(receptionService, cleaningService);
        Guest guest = new Guest(hotelMediator, "Name");

        guest.reception(13);
        guest.cleaning();
        System.out.println(guest.getRoom());

    }
}
