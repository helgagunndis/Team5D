package sample;

public class Booking {
    private int bookingID;
    private String tourName;
    private String userName;
    private boolean isPaid;

    public Booking(int bookingID, String tourName, String userName, boolean isPaid) {
        this.bookingID = bookingID;
        this.tourName = tourName;
        this.userName = userName;
        this.isPaid = isPaid;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
