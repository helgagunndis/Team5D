package sample;

import java.util.Date;

public class Tour {
    private int tourID;
    private int prufa;
    private String tourName;
    private String tourInfo;
    private int availableSpots;
    private int bookedSports;
    private int tourPrice;
    private boolean fullyBooked;
    private String tourRegion;

/// ATH ég eyddi út date því ég vissi ekki hvernig ég átti að ská það í database-inn
    public Tour(int tourID, String tourName, String tourInfo, int availableSpots, int bookedSports, int tourPrice, boolean fullyBooked, String tourRegion, int duration) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.tourInfo = tourInfo;
        this.availableSpots = availableSpots;
        this.bookedSports = bookedSports;
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

    public int getBookedSports() {
        return bookedSports;
    }

    public void setBookedSports(int bookedSports) {
        this.bookedSports = bookedSports;
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

