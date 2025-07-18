import ATM.atmContext;
import PARKING_SPACE.PParkingLot.parkingLot;
import PARKING_SPACE.PParkingLot.twoWheelerParkingLot;
import PARKING_SPACE.PParkingSpot.parkingSpot;
import PARKING_SPACE.PParkingSpot.parkingSpotFactory;
import PARKING_SPACE.PVehicle.*;
import PARKING_SPACE.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //ATM
//        System.out.println("Hello world!");
//        atmContext sbiAtm=new atmContext();
//        sbiAtm.insertCard();
//        sbiAtm.insertPin();
//        sbiAtm.cashWithraw();
//        sbiAtm.collectMoney();
        //Parking Spot
        parkingSpotFactory ParkingSpotFactory =new parkingSpotFactory();
        parkingLot ParkingLot1=new twoWheelerParkingLot();
        ParkingLot1.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.twoWheeler));
        ParkingLot1.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.twoWheeler));
        ParkingLot1.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.twoWheeler));

        vehicle Splender=new bike("1");
        Boolean x=ParkingLot1.GenerateParkingSpot();
        vehicle Bmw =new bike("2");
        Boolean y=ParkingLot1.GenerateParkingSpot();
        vehicle Ktm =new bike("3");
        Boolean z=ParkingLot1.GenerateParkingSpot();
        vehicle Passion =new bike("4");
        Boolean a=ParkingLot1.GenerateParkingSpot();





    }
}