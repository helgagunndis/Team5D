package sample;

import java.util.ArrayList;

public class User {
    private long userID;
    private String userName;
    private String userEmail;
    private String userAdress;
    private ArrayList<Booking> bookings;

    @Override
    public String toString() {
        return userName;
    }
    public User(long userID, String userName, String userEmail, String userAdress) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAdress = userAdress;
        this.bookings = new ArrayList<>();
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}