package org.example.abstract_factory.mediator;

public class HotelMediatorImpl implements HotelMediator{



    private ReceptionService receptionService;

    private CleaningService cleaningService;

    public HotelMediatorImpl(ReceptionService receptionService, CleaningService cleaningService) {
        this.receptionService = receptionService;
        this.cleaningService = cleaningService;
    }

    @Override
    public void reception(Integer roomNumber, Guest guest) {
        System.out.println("бронь к комнате номер " + roomNumber + " запрошена человеком " + guest.getName());
        receptionService.receptionAccept();
    }

    @Override
    public void cleaning(Integer roomNumber) {
        System.out.println("уборка комнаты запрошена, ее номер " + roomNumber);
        cleaningService.cleaningRoom();
    }
}
