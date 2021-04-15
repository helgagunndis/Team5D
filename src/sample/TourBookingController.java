package sample;

import javafx.collections.ObservableList;
import java.util.ArrayList;

public class TourBookingController{
    private TourDataFactory tourdataFactory = new TourDataFactory();

    public ObservableList<Booking> getAllBooking(){
        return tourdataFactory.getBookings();
    }

    public void addBooking(Booking booking) {
        tourdataFactory.insertBooking(booking.getUser().getUserID(),
                booking.getTour().getTourID(),
                booking.getSpotsPerBooking());
    }

    public ArrayList<Booking> getBooking(int tourID){
        ArrayList<Booking> bookings = new ArrayList<>();
        ObservableList<Booking> allBookings =getAllBooking();
        for (Booking booking :allBookings){
            if(booking.getTour().getTourID()==tourID){
                bookings.add(booking);
            }
        }
        return bookings;
    }

    public void deleteBooking(int bookingID){
        tourdataFactory.deleteBooking(bookingID);
    }

    public int totalBookings(int tourID) {
        ObservableList<Booking> allBookings =getAllBooking();
        int total=0;
        for (Booking booking :allBookings){
            if(booking.getTour().getTourID()==tourID){
                total++;
            }
        }
        return total;
    }
}
