package Uber.BookingManagementSystem;

import Uber.CabSystem.Cab;
import Uber.UserManagementSystem.User;

public class Booking {
     User user;
     Cab cab;
     String  pickUpLocation;
     String dropLocation;
     public int amount;
    public Booking(User user, Cab cab, String pickUpLocation, String dropLocation,int amount) {
        this.user = user;
        this.cab = cab;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.amount=amount;
    }
}
