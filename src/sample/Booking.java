package sample;


public class Booking {
    private int bookingID;
    private User user;
    private Tour tour;


    public Booking(int bookingID, User user, Tour tour) {
        this.bookingID = bookingID;
        this.user = user;
        this.tour = tour;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
}
