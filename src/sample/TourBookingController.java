package sample;


import javafx.collections.ObservableList;
import java.util.ArrayList;

public class TourBookingController{
    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<Booking> bookings= tourdataFactory.getBookings();


    public void addBooking(Booking booking) {
        tourdataFactory.insertBooking(booking.getUser().getUserID(),
                booking.getTour().getTourID(),
                booking.getSpotsPerBooking());

        System.out.println(booking.getTour().getTourID());
    }

    public ArrayList<Booking> getBooking(int tourID){
        ArrayList<Booking> bookings = new ArrayList<>();
        bookings.forEach((tab) -> {
             if (tab.getTour().getTourID() == tourID){
                 bookings.add(tab);
             }
        });
        return bookings;
    }
    public void deleteBooking(int bookingID){
        tourdataFactory.deleteBooking(bookingID);

    }
    public int totalBookings(int tourID) {
        int total= bookings.stream().filter(tab -> tab.getTour().getTourID() == tourID)
                .mapToInt(Booking::getSpotsPerBooking).sum();
        return total;
    }
}
