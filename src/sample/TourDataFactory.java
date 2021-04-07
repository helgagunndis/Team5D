package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class TourDataFactory{

    public ObservableList<Booking> getBookings(){
        ObservableList<Booking> bookings = FXCollections.observableArrayList();
        //TourBookingController bookingController= new TourBookingController();
        ObservableList<User> users = getUsers(); // án í alla notendur
        int bookingNum =1000;  // þarf að laga


       /* for (int i = 0; i <= users.size()-1; i++) {
            User eachUser = users.get( i );
            for (int j = 0; j <= eachUser.getBookings().size()-1; j++) {
                Booking data = eachUser.getBookings().get(j);
                bookingController.addBooking(data);
                Booking eachBooking = new Booking(data.getUser(),data.getTour(),data.getSpotsPerBooking());
                eachBooking.setBookingID(bookingNum);
                bookingNum++;
                bookings.add(data);
            }
        }*/
        return bookings;
    }

    public ObservableList<Tour> getTours(){
        ObservableList<Tour> tours = FXCollections.observableArrayList();

        LocalDate d1 = LocalDate.of(2021,4,01);
        LocalDate d2 = LocalDate.of(2021,4,05);
        LocalDate d3 = LocalDate.of(2021,5,11);
        LocalDate d4 = LocalDate.of(2021,5,21);
        LocalDate d5 = LocalDate.of(2021,6,04);
        LocalDate d6 = LocalDate.of(2021,6,16);
        LocalDate d7 = LocalDate.of(2021,7,10);
        LocalDate d8 = LocalDate.of(2021,7,11);
        LocalDate d9 = LocalDate.of(2021,8,07);
        LocalDate d10 = LocalDate.of(2021,8,24);


        Tour tour1 = (new Tour( "Horseriding in Eyjafjörður","Bring warm clothes",d1, 10,10000,
                "Akureyri",7,"Family friendly"));
        tour1.setTourID(1);
        tours.add(tour1);
        Tour tour2= (new Tour( "Buggy Tour in Rauðhólar","Children must be under parent supervision",
                d2,20,20000, "Reykjavík",5, "Action"));
        tour2.setTourID(2);
        tours.add(tour2);
        Tour tour3=(new Tour( "Kajaking in Lagarfljót","Bring warm clothes, you could get wet.",d3,10,15000,
                "Egilsstaðir", 3, "Family friendly"));
        tour3.setTourID(3);
        tours.add(tour3);
        Tour tour4=(new Tour( "Walk around Skaftafell","Bring warm clothes and packed lunch.",d4,50,20000,
                "Reykjavík", 15, "Family friendly"));
        tour4.setTourID(4);
        tours.add(tour4);
        Tour tour5=(new Tour( "Diving in Silfra","Bring dry clothes.",d5,25,18000,
                "Reykjavík", 6, "Action"));
        tour5.setTourID(5);
        tours.add(tour5);
        Tour tour6=(new Tour( "Snowmobil trip","Bring warm clothes.",d6,15,25000,
                "Ísafjörður", 6, "Action"));
        tour6.setTourID(6);
        tours.add(tour6);
        Tour tour7 = (new Tour( "Walk around Reykjavík","Come dressed according to weather.",d7, 25,7000,
                "Reykjavík",2, "Wheelchair accessible"));
        tour1.setTourID(7);
        tours.add(tour7);
        Tour tour8 = (new Tour( "Biking around Þingvellir","Bring warm clothes. Bikes are available for rent.",d8, 15,10000,
                "Reykjavík",8, "Family friendly"));
        tour1.setTourID(8);
        tours.add(tour8);
        Tour tour9 = (new Tour( "Skiing in Hlíðarfjall","Skiing accuipment is available for rent",d9, 20,15000,
                "Akureyri",5, "Action"));
        tour1.setTourID(9);
        tours.add(tour9);

        return tours;
    }


    public ObservableList<User> getUsers() {
        ObservableList<User> users = FXCollections.observableArrayList();
        User user1 = new User("1010942039","Sigurður Jónsson","siggi@gmail.com");
        User user2 = new User("1703817529","Andrea Ágústsdóttir","andrea90@hotmail.com");
        User user3 = new User("0201981719", "Guðrún Helga Traustadóttir","ghelga@gmail.com");

        ObservableList<Tour> tours = getTours(); // án í ferð

        ArrayList<Booking> bookings1= new ArrayList<>(); // tómur listi
        bookings1.add(new Booking(user1, tours.get(0),2));
        bookings1.add(new Booking(user1,tours.get(2),1));
        bookings1.add(new Booking(user1,tours.get(3),4));
        user1.setBookings(bookings1);

        ArrayList<Booking> bookings2 = new ArrayList<>(); // tómur listi
        bookings2.add(new Booking(user2,tours.get(1),6));
        bookings2.add(new Booking(user2,tours.get(6),2));
        user2.setBookings(bookings2);

        ArrayList<Booking> bookings3 = new ArrayList<>(); // tómur listi
        bookings3.add(new Booking(user3,tours.get(3),2));
        user3.setBookings(bookings3);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
