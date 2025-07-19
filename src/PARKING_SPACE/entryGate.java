package PARKING_SPACE;

import PARKING_SPACE.PParkingSpot.parkingSpot;
import PARKING_SPACE.PPricingStrategy.pricingStrategy;
import PARKING_SPACE.PVehicle.vehicle;

public class entryGate {
    parkingManager ParkingManager;

    public entryGate(parkingManager parkingManager) {
        ParkingManager = parkingManager;
    }

    public ticket GenerateTicket(vehicle Vehicle, pricingStrategy PricingStrategy)
    {
        parkingSpot ParkingSpot=ParkingManager.AvailableParkingSpot(Vehicle.getType());
        return new ticket(ParkingSpot,Vehicle,PricingStrategy);
    }

}
