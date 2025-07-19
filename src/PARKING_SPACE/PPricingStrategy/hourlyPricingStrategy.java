package PARKING_SPACE.PPricingStrategy;

import PARKING_SPACE.ticket;

public class hourlyPricingStrategy implements pricingStrategy{
    @Override
    public int pay(ticket Ticket) {
        return (Ticket.EndTime-Ticket.StartTime)*10;
    }
}
