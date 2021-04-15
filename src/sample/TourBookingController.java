package sample;

import javafx.collections.ObservableList;
import java.util.ArrayList;

public class TourBookingController{
    private TourDataFactory tourdataFactory = new TourDataFactory();
    private TourController tourController= new TourController();
    private TourUserController userController= new TourUserController();

    public ObservableList<Booking> getAllBooking(){
        ObservableList<Booking> booking=tourdataFactory.getBookings();
        return booking;
    }
    public Booking getThisBooking(int bookingID){
        ObservableList<Booking> booking =getAllBooking();
        Booking thisBooking =null;
        for (Booking allBooking: booking){
            if (allBooking.getBookingID()==bookingID){
                System.out.println(allBooking.getTour().getTourID());
                thisBooking = new Booking(allBooking.getUser(),allBooking.getTour(),allBooking.getSpotsPerBooking());
            }
        }
        return thisBooking;
    }

    public void addBooking(Booking booking) {
        tourdataFactory.insertBooking(booking.getUser().getUserID(),
                booking.getTour().getTourID(),
                booking.getSpotsPerBooking());
    }

    public void deleteBooking(int bookingID){
        tourdataFactory.deleteBooking(bookingID);
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
