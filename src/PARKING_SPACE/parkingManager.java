package PARKING_SPACE;

import PARKING_SPACE.PParkingLot.parkingLot;
import PARKING_SPACE.PParkingSpot.parkingSpot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class parkingManager {
    List<parkingLot> ParkingLots=new ArrayList<>();
    HashMap<parkingSpot,parkingLot>twoWheelerFreeSpots=new HashMap<>();
    HashMap<parkingSpot,parkingLot>fourWheelerFreeSpots=new HashMap<>();
    HashMap<parkingSpot,parkingLot>sixWheelerFreeSpots=new HashMap<>();

    public void AddParkingLot(parkingLot ParkingLot)
    {
        ParkingLots.add(ParkingLot);
    }
    public void DeleteParkingLot(parkingLot ParkingLot)
    {
        ParkingLots.remove(ParkingLot);
    }

}
