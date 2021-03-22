package sample;

import java.util.Date;

public class Tour {
    private int tourID;
    private String tourName;
    private String tourInfo;
    private Date startDate;
    private Date endDate;
    private int availableSpots;
    private int bookedSpots;
    private int tourPrice;
    private boolean fullyBooked;
    private String tourRegion;

    @Override
    public String toString() {
        return tourName;
    }

    /// ATH ég eyddi út date því ég vissi ekki hvernig ég átti að ská það í database-inn
    public Tour(int tourID, String tourName, String tourInfo, int availableSpots, int bookedSpots, int tourPrice, boolean fullyBooked, String tourRegion, int duration) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.tourInfo = tourInfo;
        this.availableSpots = availableSpots;
        this.bookedSpots = bookedSpots;
        this.tourPrice = tourPrice;
        this.fullyBooked = fullyBooked;
        this.tourRegion = tourRegion;
        this.duration = duration;
    }

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourInfo() {
        return tourInfo;
    }

    public void setTourInfo(String tourInfo) {
        this.tourInfo = tourInfo;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }

    public int getBookedSpots() {
        return bookedSpots;
    }

    public void setBookedSpots(int bookedSpots) {
        this.bookedSpots = bookedSpots;
    }

    public int getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(int tourPrice) {
        this.tourPrice = tourPrice;
    }

    public boolean isFullyBooked() {
        return fullyBooked;
    }

    public void setFullyBooked(boolean fullyBooked) {
        this.fullyBooked = fullyBooked;
    }

    public String getTourRegion() {
        return tourRegion;
    }

    public void setTourRegion(String tourRegion) {
        this.tourRegion = tourRegion;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private int duration;
}

