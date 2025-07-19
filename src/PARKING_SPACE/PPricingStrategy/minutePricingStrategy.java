package PARKING_SPACE.PPricingStrategy;

import PARKING_SPACE.ticket;

public class minutePricingStrategy implements pricingStrategy{
    @Override
    public int pay(ticket Ticket) {
        return (Ticket.EndTime-Ticket.StartTime)*20;
    }
}
