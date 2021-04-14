package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;


public class TourController {
    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<Tour> tours= tourdataFactory.getTours();
    private ObservableList<Tour> filteredTours = FXCollections.observableArrayList();


    public ObservableList<Tour> tourRegionSearch(String region) {
        ObservableList<Tour> result = FXCollections.observableArrayList();
        tours.forEach((tab) -> {
            if (tab.getTourRegion().equals(region)){
                result.add(tab);
            }
        });
        return  result;
    }




    public ArrayList<User> getTourEmailList(String tourID){
        ArrayList<User> users = new ArrayList<>();

        return users;
    }

    public ArrayList<Tour> findTourByName(String tourName){
        ArrayList<Tour> tours = new ArrayList<>();

        return tours;
    }

    public long localDateToMillis (LocalDate value){
        Instant i = value.atStartOfDay(ZoneId.systemDefault()).toInstant();
        long timeInMillis = i.toEpochMilli();

        return timeInMillis;
    }

    public LocalDate millisToLocalDate(long millis){
        LocalDate date = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDate();

        return date;
    }

    public void addTour(Tour tour) {
        tourdataFactory.insertTour( tour.getTourID(),tour.getTourName(),
                tour.getTourInfo(), tour.getAvailableSpots(),tour.getTourPrice(),
                tour.getTourRegion(), tour.getDuration(), tour.getServices(),
                tour.getTourDate());
    }

    public void deleteTour(int tourID) {
        tourdataFactory.deleteTour(tourID);
    }
    public Boolean isFullyBooked(int tourID){
        return false;
    }

    public ObservableList<Tour> tourRegionSearch(String region, ObservableList<Tour> full) {
        ObservableList<Tour> result = FXCollections.observableArrayList();
        for (Tour tour : full) {
            if (tour.getTourRegion().contains(region)) {
                result.add(tour);
            }
        }
        return result;
    }

    public ObservableList<Tour> tourDurationSearch(int duration1, int duration2, ObservableList<Tour> full) {
        ObservableList<Tour> result = FXCollections.observableArrayList();
        for (Tour tour : full) {
            if (tour.getDuration() >= duration1 && tour.getDuration() <= duration2 ) {
                result.add(tour);
            }
        }
        return result;
    }

    public ObservableList<Tour> tourServicesSearch(String service, ObservableList<Tour> full) {
        ObservableList<Tour> result = FXCollections.observableArrayList();
        for (Tour tour : full) {
            if (tour.getServices().contains(service)) {
                result.add(tour);
            }
        }
        return result;
    }

    public ObservableList<Tour> tourDateSearch(LocalDate startDate, LocalDate endDate, ObservableList<Tour> full) {
        ObservableList<Tour> result = FXCollections.observableArrayList();
        for (Tour tour : full) {
            if (tour.getTourDate().isAfter(startDate) && tour.getTourDate().isBefore(endDate)) {
                result.add(tour);
            }
        }
        return result;
    }



}

