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
        Date startD4 = new Date(2021, 6, 01);
        Date endD4 = new Date(2021, 7, 31);
        Date startD5 = new Date(2021, 1, 15);
        Date endD5 = new Date(2021, 4, 15);


        Tour tour1 = (new Tour( "Hestaferð","Komið með hlý föt",10, 5000,startD1,endD1,
                "Akureyri",0));
        tour1.setTourID(1);
        tours.add(tour1);
        Tour tour2= (new Tour( "Fjórhjóla skemmtun","Ef einstaklingur er yngri en 18 ára þarf að vera í fylgd með forráðarmanni.",
                20,7000,startD2,endD2, "Reykjavík",0));
        tour2.setTourID(2);
        tours.add(tour2);
        Tour tour3=(new Tour( "Kajakferð og fjör","Komið með hlý föt og nesti.",22,10000,startD3,endD3,
                "Egilsstaðir", 3));
        tour3.setTourID(3);
        tours.add(tour3);
        Tour tour4=(new Tour( "Gönguferð um Skaftafell","Komið með hlý föt og nesti.",12,10000,startD2,endD2,
                "Reykjavík", 5));
        tour4.setTourID(4);
        tours.add(tour4);
        Tour tour5=(new Tour( "Kafað í Silfru","Komið með föt til skiptanna.",6,25000,startD1,endD1,
                "Reykjavík", 4));
        tour5.setTourID(5);
        tours.add(tour5);
        Tour tour6=(new Tour( "Vélsleðaferð uppá Snæfellsjökul","Koma þarf með hlý útivistarföt.",10,25000,startD2,endD2,
                "Vestfirðir", 6));
        tour6.setTourID(6);
        tours.add(tour6);
        Tour tour7 = (new Tour( "Skoðunarferð um miðbæinn","Komið klædd eftir veðri.",30, 1000,startD1,endD1,
                "Reykjavík",2));
        tour1.setTourID(7);
        tours.add(tour7);
        Tour tour8 = (new Tour( "Hjólaferð á Þingvelli","Vinsamlegast mætið í viðeigandi klæðnaði. Hægt er að leigja hjól fyrir þá sem ekki eiga.",10, 15000,startD4,endD4,
                "Reykjavík",8));
        tour1.setTourID(8);
        tours.add(tour8);
        Tour tour9 = (new Tour( "Skíðaferð í Hlíðarfjall","Hægt er að leigja skíði og skíðaskó á staðnum.",20, 10000,startD5,endD5,
                "Akureyri",5));
        tour1.setTourID(9);
        tours.add(tour9);

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
