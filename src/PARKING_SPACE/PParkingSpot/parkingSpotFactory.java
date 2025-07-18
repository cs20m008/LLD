package PARKING_SPACE.PParkingSpot;

import PARKING_SPACE.vehicleType;

public class parkingSpotFactory {
    public parkingSpotFactory() {
    }
    public parkingSpot GenerateParkingSpot(vehicleType VehicleType)
    {

        if(VehicleType.equals(vehicleType.twoWheeler))
        {
            return new twoWheelerParkingSpot();
        }
        else if(VehicleType.equals(vehicleType.fourWheeler))
        {
            return new fourWheelerParkingSpot();
        }
        else if(VehicleType.equals(vehicleType.sixWheeler))
        {
            return new sixWheelerParkingSpot();
        }
        else
        {
           return null;
        }
    }
}
