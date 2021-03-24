package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.Instant;
import java.util.ArrayList;


public class TourController {
    private TourDataFactory tourdataFactory = new TourDataFactory();
    ObservableList<Tour> tours= tourdataFactory.getTours();

    public ArrayList<User> getTourEmailList(String tourID){
        ArrayList<User> users = new ArrayList<>();

        return users;
    }

    public ArrayList<Tour> findTourByName(String tourName){
        ArrayList<Tour> tours = new ArrayList<>();

        return tours;
    }
    public void addTour(Tour tour) {

    }
    public void deleteTour(int tourID) {

    }
    public Boolean isFullyBooked(int tourID){
        return false;
    }


}
