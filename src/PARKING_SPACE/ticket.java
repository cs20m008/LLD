package PARKING_SPACE;

import PARKING_SPACE.PParkingSpot.parkingSpot;
import PARKING_SPACE.PPricingStrategy.pricingStrategy;
import PARKING_SPACE.PVehicle.vehicle;

import java.sql.Time;

public class ticket {
   public int StartTime;
   public int EndTime;
   public parkingSpot ParkingSpot;
   public vehicle Vehicle;
   public pricingStrategy PricingStrategy;

   public ticket(parkingSpot parkingSpot, vehicle vehicle, pricingStrategy pricingStrategy) {
      StartTime = 0;
      ParkingSpot = parkingSpot;
      Vehicle = vehicle;
      PricingStrategy=pricingStrategy;
   }
   public int price()
   {
      return PricingStrategy.pay(this);
   }
}
