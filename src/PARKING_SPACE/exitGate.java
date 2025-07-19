package PARKING_SPACE;

import PARKING_SPACE.PPaymentStrategy.paymentStrategy;

public class exitGate {
    //paymentStrategy PaymentStrategy;
    parkingManager ParkingManager;
    public exitGate(parkingManager ParkingManager) {
     this.ParkingManager=ParkingManager;
    }
    public int SubmitTicket(ticket Ticket)
    {
        Ticket.EndTime=5;
        ParkingManager.AddFreeParkingSpot(Ticket.Vehicle.getType(),Ticket.ParkingSpot);
        return Ticket.price();
    }
    public Boolean pay(Integer amount,paymentStrategy PaymentStrategy)
    {
        PaymentStrategy.pay(amount);

        return true;

    }
}
