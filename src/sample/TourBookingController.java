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
            }
        });
        //Eyða út bókunarnúmeri í bókununum.
        for (int i = 0; i <= bookings.size()-1; i++) {
            if(bookings.get(i).getBookingID()==bookingID){
                bookings.remove(i); // veit ekki alveg hvernig á að eyða
            }
        }
    }
    public int totalBookings(int tourID) {
        int total= bookings.stream().filter(tab -> tab.getTour().getTourID() == tourID)
                .mapToInt(Booking::getSpotsPerBooking).sum();
        return total;
    }
}
