package sample;


import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class TourBookingController{

    public void addBooking(Booking booking) {
        String bookingID= getRandomNum();

    }
    public ArrayList<Booking> getBooking(String tourID){
        ArrayList<Booking> bookings = new ArrayList<>();

        return bookings;
    }
    public void deleteBooking(String bookingID){

    }
    public ArrayList<Booking> totalBookings(String tourID) {
        ArrayList<Booking> bookings = new ArrayList<>();
        return bookings;
    }


    private String getRandomNum() {
        int length = 8;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";
        String str = new Random().ints(length, 0, chars.length())
                .mapToObj(i -> "" + chars.charAt(i))
                .collect(Collectors.joining());
        return str;
    }
}
