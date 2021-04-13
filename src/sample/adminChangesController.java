package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class adminChangesController implements Initializable {

    private TourDataFactory tourdataFactory = new TourDataFactory();
   //private ObservableList<Tour> tours = tourdataFactory.getTours();
   private ObservableList<Tour> tours = FXCollections.observableArrayList();

    @FXML
    private Button buttonDeleteTour;
    @FXML
    private Button buttonAddTour;
    @FXML
    private TextField textTourName;
    @FXML
    private TextField textTourDate;
    @FXML
    private TextField textTourPrice;
    @FXML
    private TextField textMaxBooking;
    @FXML
    private TextField textTourInfo;
    @FXML
    private TextField textTourID;
    @FXML
    private TextField textTourServices;
    @FXML
    private TextField textTourRegion;
    @FXML
    private TextField textTourDuration;
   // @FXML
    //private ListView tourListView;



    public void backToMainPageButtonAdminCOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        Scene tableViewScene = new Scene(root);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    public void buttonAddTourOnAction(ActionEvent event) {
        String tourPrice = textTourPrice.getText();
        String maxBooking = textMaxBooking.getText();
        String tourDuration = textTourDuration.getText();
        int price = Integer.parseInt(tourPrice);
        int spots = Integer.parseInt(maxBooking);
        int duration = Integer.parseInt(tourDuration);
        tours.add(new Tour(textTourName.getText(), textTourInfo.getText(), LocalDate.of(2021,5,6),spots,price,textTourRegion.getText(),duration,textTourServices.getText()));
    }

    public void buttonDeleteTourOnAction(ActionEvent event) {
        String s = textTourID.getText();
        int enteredTourID = Integer.parseInt(s);
        tours.forEach((tour) -> {
            if (enteredTourID == tour.getTourID()) {
                tours.remove(tour);
            }
        });
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tours = tourdataFactory.getTours();
        //tourListView.setItems(tours);
    }
}
