package PARKING_SPACE.PParkingLot;


import PARKING_SPACE.PParkingSpot.parkingSpot;
import PARKING_SPACE.vehicleType;

import java.util.*;

public abstract class parkingLot {
   public vehicleType VehicleType;
   List<parkingSpot>ParkingSpots=new ArrayList<>();
   HashSet<parkingSpot>FreeParkingSpots=new HashSet<>();
   public parkingLot() {
   }
   public void AddParkingSpot(parkingSpot ParkingSpot)
   {
      ParkingSpots.add(ParkingSpot);
      FreeParkingSpots.add(ParkingSpot);
   }
   public void AddFreeParkingSpot(parkingSpot ParkingSpot)
   {
      FreeParkingSpots.add(ParkingSpot);
   }
   public parkingSpot AvailableParkingSpot()
   {
      if(!FreeParkingSpots.isEmpty())
      {
         Optional<parkingSpot> parkingSpot1=FreeParkingSpots.stream().findFirst();
         if(parkingSpot1.isPresent()) {
            FreeParkingSpots.remove(parkingSpot1.get());
            return parkingSpot1.get();
         }
      }
      return null;
   }


   public  void DeleteParkingSpot(parkingSpot ParkingSpot)
   {

   }



}
