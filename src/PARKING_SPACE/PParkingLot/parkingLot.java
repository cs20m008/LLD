package PARKING_SPACE.PParkingLot;


import PARKING_SPACE.PParkingSpot.parkingSpot;

import java.util.*;

public abstract class parkingLot {
   List<parkingSpot>ParkingSpots=new ArrayList<>();
   HashSet<parkingSpot>FreeParkingSpots=new HashSet<>();
   public parkingLot() {
   }
   public void AddParkingSpot(parkingSpot ParkingSpot)
   {
      ParkingSpots.add(ParkingSpot);
      FreeParkingSpots.add(ParkingSpot);
   }
   public Boolean GenerateParkingSpot()
   {
      if(!FreeParkingSpots.isEmpty())
      {
         Optional<parkingSpot> parkingSpot1=FreeParkingSpots.stream().findFirst();
         if(parkingSpot1.isPresent()) {
            FreeParkingSpots.remove(parkingSpot1.get());
            return true;
         }
      }
      return false;
   }


   public  void DeleteParkingSpot(parkingSpot ParkingSpot)
   {

   }



}
