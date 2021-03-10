package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Database {
    public Database() {
    }
    public ObservableList<User> getUsers(){
        ObservableList<User> users = FXCollections.observableArrayList();
        return users;
    }
    public ArrayList<Tour> getTours(){
        ArrayList<Tour> tours = new ArrayList<>();
        return tours;

    }
    public ArrayList<User> getUser(){
        ArrayList<User> users = new ArrayList<>();
        return users;

    }
}
