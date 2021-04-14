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
        bookings.forEach((booking) -> {
            if (booking.getBookingID()== bookingID){

                //bæta við sætum í ferð sem er afbókuð
                Tour theTour =booking.getTour();
                //System.out.println(totalBookings(theTour.getTourID()));
                int spots= theTour.getAvailableSpots();
                theTour.setAvailableSpots(spots + booking.getSpotsPerBooking());

                // Eyða bókunarnúmeri á User
                User theUser =booking.getUser();
                System.out.println(theUser.toString());
                ArrayList<Booking> theUserBookings = theUser.getBookings();
                //theUserBookings.remove(booking);

                //Eyða Bókun
                //bookings.remove(booking);
            }
        });

    }
    public int totalBookings(int tourID) {
        int total= bookings.stream().filter(tab -> tab.getTour().getTourID() == tourID)
                .mapToInt(Booking::getSpotsPerBooking).sum();
        return total;
    }
}
