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
import java.util.Date;
import java.util.ResourceBundle;

public class TourDataFactory{

    public ArrayList<Booking> getBookings(){
        ArrayList<Booking> bookings = new ArrayList<>();

        return bookings;
    }

    public ObservableList<Tour> getTours(){
        ObservableList<Tour> tours = FXCollections.observableArrayList();

        Date startD1 = new Date(2021, 4, 05);
        Date endD1 = new Date(2021, 8, 21);
        Date startD2 = new Date(2021, 2, 15);
        Date endD2 = new Date(2021, 12, 20);
        Date startD3 = new Date(2021, 5, 25);
        Date endD3 = new Date(2021, 9, 21);


        Tour tour1 = (new Tour( "Hestaferð","Komið með hlý föt",10, 5000,startD1,endD1,
                "North",0));
        Tour tour2= (new Tour( "Fjórhjóla skemmtun","Ef einstaklingur er yngri en 18 ára þarf að vera í fylgt með forráðarmanni",
                20,7000,startD2,endD2, "South",0));
        Tour tour3=(new Tour( "Kajakferð og fjör","Komið með hlý föt og nesti",22,10000,startD3,endD3,
                "East", 3));
        tours.add(tour1);
        tours.add(tour2);
        tours.add(tour3);
        return tours;
    }


    public ObservableList<User> getUsers() {
        ObservableList<User> users = FXCollections.observableArrayList();
        User user1 = new User("1010942039","Sigurður Jónsson","siggi@gmail.com");
        User user2 = new User("1703817529","Andrea Ágústsdóttir","andrea90@hotmail.com");
        User user3 = new User("0201981719", "Guðrún Helga Traustadóttir","ghelga@gmail.com");

        /*ObservableList<Tour> tours = getTours(); // án í ferð

        ArrayList<Booking> bookings1 = new ArrayList<>(); // tómur listi
        bookings1.add(new Booking(4020423,user1,tours.get(1)));
        bookings1.add(new Booking(4025321,user1,tours.get(2)));
        bookings1.add(new Booking(2341234,user1,tours.get(3)));
        user1.setBookings(bookings1);

        ArrayList<Booking> bookings2 = new ArrayList<>(); // tómur listi
        bookings2.add(new Booking(3012314,user2,tours.get(1)));
        bookings2.add(new Booking(2231024,user2,tours.get(3)));
        user2.setBookings(bookings2);

        ArrayList<Booking> bookings3 = new ArrayList<>(); // tómur listi
        bookings3.add(new Booking(3214982,user3,tours.get(2)));
        user3.setBookings(bookings3);
         */
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
