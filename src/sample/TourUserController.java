package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class TourUserController extends User implements Initializable{


    public TourUserController(String userID, String userName, String userEmail) {
        super(userID, userName, userEmail);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
