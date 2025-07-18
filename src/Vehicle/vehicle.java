package Vehicle;

public class vehicle {
    String numberPlate;
    String vehicleType;

    public vehicle(String vehicleType, String numberPlate) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
