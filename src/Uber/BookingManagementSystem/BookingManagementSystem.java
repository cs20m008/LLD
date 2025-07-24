package Uber.BookingManagementSystem;

import Uber.CabSystem.Cab;
import Uber.UserManagementSystem.User;

import java.util.List;

public class BookingManagementSystem {
    List<Booking>bookingList;
    private static volatile BookingManagementSystem instance;
    private BookingManagementSystem() {

    }
    public static BookingManagementSystem getInstance(){
        if(instance==null)
        {
            synchronized (BookingManagementSystem.class)
            {
                if(instance==null)
                    instance=new BookingManagementSystem();
            }
        }
        return instance;
    }
    public void addBookings(Booking booking)
    {
        bookingList.add(booking);
    }
    public Booking generateBooking(User user, Cab cab, String pickUp, String drop,int amount)
    {
        return new Booking(user,cab,pickUp,drop,amount);
    }
}
