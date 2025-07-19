package PARKING_SPACE;

import PARKING_SPACE.PParkingLot.parkingLot;
import PARKING_SPACE.PParkingSpot.parkingSpot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class parkingManager {
    List<parkingLot> ParkingLots=new ArrayList<>();
    HashMap<vehicleType,parkingLot>Mapping=new HashMap<>();
    public parkingManager() {
    }

    public void AddParkingLot(parkingLot ParkingLot)
    {
        ParkingLots.add(ParkingLot);
        Mapping.put(ParkingLot.VehicleType,ParkingLot);
    }
    public void AddFreeParkingSpot(vehicleType VehicleType,parkingSpot ParkingSpot)
    {
        Mapping.get(VehicleType).AddFreeParkingSpot(ParkingSpot);
    }
    public void DeleteParkingLot(parkingLot ParkingLot)
    {
        ParkingLots.remove(ParkingLot);
    }
    public parkingSpot AvailableParkingSpot(vehicleType VehicleType)
    {
        return Mapping.get(VehicleType).AvailableParkingSpot();
    }

}
