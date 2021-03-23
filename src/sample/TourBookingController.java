package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class TourBookingController{

    public void addBooking(User user) {
        String bookingID= getRandomNum();
        String name= user.getUserName();
        String SSN= user.getUserID();
        String email= user.getUserEmail();
        // nú þarf að setja þetta inn í data base-inn hjá User og bookingdafd
        System.out.println(name);
    }
    public ArrayList<Booking> getBooking(Booking booking){
        ArrayList<Booking> bookings = new ArrayList<>();

        return bookings;
    }
    public void deleteBooking(Booking booking){

    }
    public ArrayList<Booking> totalBookings(Tour tour) {
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
