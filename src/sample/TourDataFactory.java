package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TourDataFactory{

    public ArrayList<Booking> getBookings(){
        ArrayList<Booking> bookings = new ArrayList<>();

        return bookings;
    }

    public ObservableList<Tour> getTours(){
        ObservableList<Tour> tours = FXCollections.observableArrayList();
        tours.add(new Tour(1, "Hestaferð","Komið með hlý föt",10,
                0, 5000,false,"North",1));
        tours.add(new Tour(2, "Fjórhjóla skemmtun","Ef einstaklingur er yngri en 18 ára þarf að vera í fylgt með forráðarmanni",10,
                0, 6000,false,"South",2));
        tours.add(new Tour(3, "Kajakferð og fjör","Komið með hlý föt og nesti",8,
                0, 1000,false,"East",3));
        return tours;
    }


    public ObservableList<User> getUsers() {
        ObservableList<User> users = FXCollections.observableArrayList();
        User user1 = new User("1010942039","Sigurður Jónsson","siggi@gmail.com");
        User user2 = new User("1703817529","Andrea Ágústsdóttir","andrea90@hotmail.com");
        User user3 = new User("0201981719", "Guðrún Helga Traustadóttir","ghelga@gmail.com");

        ObservableList<Tour> tours = getTours(); // án í ferð

        ArrayList<Booking> bookings1 = new ArrayList<>(); // tómur listi
        bookings1.add(new Booking(4020423,user1,tours.get(1)));
        bookings1.add(new Booking(4025321,user1,tours.get(2)));
        bookings1.add(new Booking(2341234,user1,tours.get(3)));
        user1.setBookings(bookings1);

        ArrayList<Booking> bookings2 = new ArrayList<>(); // tómur listi
        bookings2.add(new Booking(3012314,user2,tours.get(1)));
        bookings2.add(new Booking(2231024,user2,tours.get(3)));
        user2.setBookings(bookings1);

        ArrayList<Booking> bookings3 = new ArrayList<>(); // tómur listi
        bookings3.add(new Booking(3214982,user3,tours.get(2)));
        user3.setBookings(bookings1);

        return users;
    }
}
