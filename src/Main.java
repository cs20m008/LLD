import ATM.atmContext;
import PARKING_SPACE.PParkingLot.fourWheelerParkingLot;
import PARKING_SPACE.PParkingLot.parkingLot;
import PARKING_SPACE.PParkingLot.sixWheelerParkingLot;
import PARKING_SPACE.PParkingLot.twoWheelerParkingLot;
import PARKING_SPACE.PParkingSpot.parkingSpot;
import PARKING_SPACE.PParkingSpot.parkingSpotFactory;
import PARKING_SPACE.PPaymentStrategy.creditCard;
import PARKING_SPACE.PPricingStrategy.hourlyPricingStrategy;
import PARKING_SPACE.PPricingStrategy.pricingStrategy;
import PARKING_SPACE.PVehicle.*;
import PARKING_SPACE.*;
import TicTacToe.Game;

import static ATMDispenser.App.ATMDispenserMain;
import static AmazonNotificationSystem.App.amazonNotificationSystemMain;
import static AuctionManagementSystem.App.auctionManagementSystemMain;
import static CoffeeShopSystem.App.coffeeShopSystemMain;
import static CouponSystem.App.CouponSystemMain;
import static DirectorySystem.App.directorySystemMain;
import static InventoryManagementSystem.App.inventoryManagementSystemMain;
import static MultipleProducerConsumer.App.multipleProducerConsumerMain;
import static PizzaFactory.app.PizzaMain;
import static SimpleProducerConsumer.App.simpleProducerConsumerMain;
import static SnakeAndLadderGame.App.snakeAndLadderGameMain;
import static Uber.App.UberAppMain;
import static VendingMachine.App.vendingMachineMain;

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
//        parkingSpotFactory ParkingSpotFactory =new parkingSpotFactory();
//        parkingLot ParkingLot1=new twoWheelerParkingLot();
//        parkingLot ParkingLot2=new fourWheelerParkingLot();
//        parkingLot ParkingLot3=new sixWheelerParkingLot();
//        ParkingLot1.VehicleType=vehicleType.twoWheeler;
//        ParkingLot2.VehicleType=vehicleType.fourWheeler;
//        ParkingLot3.VehicleType=vehicleType.sixWheeler;
//        ParkingLot1.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.twoWheeler));
//        ParkingLot1.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.twoWheeler));
//        ParkingLot1.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.twoWheeler));
//        ParkingLot2.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.fourWheeler));
//        ParkingLot2.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.fourWheeler));
//        ParkingLot2.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.fourWheeler));
//        ParkingLot3.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.sixWheeler));
//        ParkingLot3.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.sixWheeler));
//        ParkingLot3.AddParkingSpot(ParkingSpotFactory.GenerateParkingSpot(vehicleType.sixWheeler));
//        parkingManager ParkingManager=new parkingManager();
//        ParkingManager.AddParkingLot(ParkingLot1);
//        ParkingManager.AddParkingLot(ParkingLot2);
//        ParkingManager.AddParkingLot(ParkingLot3);
//        entryGate EntryGate=new entryGate(ParkingManager);
//        vehicle alto=new car("1");
//        pricingStrategy PricingStrategy=new hourlyPricingStrategy();
//        ticket Ticket=EntryGate.GenerateTicket(alto,PricingStrategy);
//        exitGate ExitGate=new exitGate(ParkingManager);
//        Integer amount=ExitGate.SubmitTicket(Ticket);
//        Boolean status=ExitGate.pay(amount,new creditCard());
//        System.out.println(status);

        //TicTacToe
//        Game game=Game.GetInstance();
//        game.play();
        //Pizza
//        PizzaMain();
       //CouponSystem
//        CouponSystemMain();
        //AmazonNotificationSystem
//        amazonNotificationSystemMain();
        //VendingMachine
//          vendingMachineMain();
        //InventoryManagementSystem
//        inventoryManagementSystemMain();
//        snakeAndLadderGame
//        snakeAndLadderGameMain();
        //ATMDispenser
//        ATMDispenserMain();
        //directorySystem
//        directorySystemMain();
        //auctionManagementSystem
//        auctionManagementSystemMain();
        //simpleProducerConsumer
       // simpleProducerConsumerMain();
        //CoffeeShopSystem
//        coffeeShopSystemMain();
        //simpleProducerConsumerMain
        // simpleProducerConsumerMain();
//        multipleProducerConsumerMain();
        //GPay
        UberAppMain();








    }
}