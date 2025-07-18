package PARKING_SPACE.PVehicle;

import PARKING_SPACE.vehicleType;

public class bike implements vehicle {
    vehicleType type=vehicleType.twoWheeler;
    String vehicleNo;
    public bike(String vehicleNo)
    {
         this.vehicleNo=vehicleNo;
    }

    public vehicleType getType() {
        return type;
    }

    public void setType(vehicleType type) {
        this.type = type;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
}
