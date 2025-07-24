package Uber;

import Uber.BookingManagementSystem.Booking;
import Uber.BookingManagementSystem.BookingManagementSystem;
import Uber.CabManagementSystem.CabManagementSystem;
import Uber.CabManagementSystem.CabManagementType;
import Uber.CabSystem.Cab;
import Uber.CabSystem.CabType;
import Uber.PaymentSystem.PaymentSystem;
import Uber.UserManagementSystem.User;
import Uber.UserManagementSystem.UserManagementSystem;

public class Uber {
    CabManagementFactory cabManagementFactory;
    CabManagementSystem cabManagementSystem;
    UserManagementSystem userManagementSystem;
    BookingManagementSystem bookingManagementSystem;
    PaymentSystem paymentSystem;
    public Uber(){
        cabManagementFactory=CabManagementFactory.getInstance();
        userManagementSystem=UserManagementSystem.getInstance();
        bookingManagementSystem=BookingManagementSystem.getInstance();

    }
    public Booking generateBooking(User user, String pickUpLocation, String dropLocation, CabType cabType)
    {
        cabManagementSystem=cabManagementFactory.getCabManagementSystem(CabManagementType.FourWheeler);
        Cab cab=cabManagementSystem.getCab(pickUpLocation,dropLocation);
        int amount=100;
        return bookingManagementSystem.generateBooking(user,cab,pickUpLocation,dropLocation,amount);

    }
    public void payment(Booking booking, PaymentSystem paymentSystem)
    {
        this.paymentSystem=paymentSystem;
        this.paymentSystem.pay(booking.amount);

    }
}
