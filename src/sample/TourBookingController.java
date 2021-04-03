package sample;


import javafx.collections.ObservableList;
import java.util.ArrayList;


public class TourBookingController{
    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<Booking> bookings= tourdataFactory.getBookings();
    private ObservableList<Tour> tours= tourdataFactory.getTours();
    private int numForBooking=2000; // þarf að breyta!


    public void addBooking(Booking booking) {
        booking.setBookingID(numForBooking);
        numForBooking++;
        bookings.add(booking);
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
        bookings.forEach((tab) -> {
            if (tab.getBookingID()== bookingID){
                // bæta við sætum í ferð sem er afbókuð
                Tour theTour =tab.getTour();
                int spots= theTour.getAvailableSpots();
                theTour.setAvailableSpots(spots + tab.getSpotsPerBooking());

                // Eyða bókunarnúmeri á User
                User theUser =tab.getUser();
                ArrayList<Booking> theUserBookings = theUser.getBookings();
                theUserBookings.remove(bookingID);

                bookings.remove(bookingID);
            }
        });
    }
    public int totalBookings(int tourID) {
        int total= bookings.stream().filter(tab -> tab.getTour().getTourID() == tourID)
                .mapToInt(Booking::getSpotsPerBooking).sum();
        return total;
    }



}
