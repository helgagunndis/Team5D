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
    public ArrayList<Tour> getTours(){
        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(100, "Hestaferð","Komið með hlý föt",10,
                0, 5000,false,"North",1));
        tours.add(new Tour(110, "Fjörhjólar skemmtun","Ef einstaklingur er yngri en 18 ára þarf að vera í fylgt með forráðarmanni",10,
                0, 6000,false,"South",2));
        tours.add(new Tour(200, "Kajakferð og fjör","Komið með hlý föt og nesti",8,
                0, 1000,false,"East",3));
        return tours;

    }

    public ObservableList<User> getUsers() {
        ObservableList<User> users = FXCollections.observableArrayList();
        User user1 = new User(1,"Sigurður Jónsson","siggi@gmail.com","Furugrund 20 Kópavogur");
        User user2 = new User(2,"Andrea Ágústsdóttir","andrea90@hotmail.com","Geitland 15 Reykjavík");
        User user3 = new User(3, "Guðrún Helga Traustadóttir","ghelga@gmail.com","Sjónarhóll 2 Garðabær");

        ArrayList<Tour> tours = getTours(); // án í ferð

        ArrayList<Booking> bookings1 = new ArrayList<>(); // tómur listi
        bookings1.add(new Booking(100, "Hestaferð",user1.getUserName(),true));
        bookings1.add(new Booking(110, "Fjörhjólar skemmtun", user1.getUserName(),false));
        user1.setBookings(bookings1);

        ArrayList<Booking> bookings2 = new ArrayList<>(); // tómur listi
        bookings2.add(new Booking(100, "Hestaferð",user2.getUserName(),true));
        bookings2.add(new Booking(200, "Kajakferð og fjör", user2.getUserName(),false));
        user2.setBookings(bookings1);

        ArrayList<Booking> bookings3 = new ArrayList<>(); // tómur listi
        bookings3.add(new Booking(100, "Hestaferð",user2.getUserName(),true));
        user3.setBookings(bookings1);
        return users;
    }
}
