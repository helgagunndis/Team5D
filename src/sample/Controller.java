package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ListView tourListView;
    @FXML
    private TextField searchTextField;
    @FXML
    private Button searchButton;
    @FXML
    private Date dateFrom;
    @FXML
    private Date dateTo;
        /*filterNorthRegion;
    filterEastRegion;
    filterSouthRegion;
    filterWestRegion;

    filterToThreeHours;
    filterThreeToFiveHours;
    filterFiveToSevenHours;
    filterFullDay;

    filterServicesWheelchairAccessible;
    filterServicesFamilyFriendly;
     */

    @FXML
    private Button buttonFindTour;
    @FXML
    private Button buttonSearchBookTour;
    @FXML
    private Button buttonAdministrator;

    @FXML
    private Button bookTourButton;
    @FXML
    private TextField bookingNameTextField;
    @FXML
    private TextField bookingSSNTextField;
    @FXML
    private TextField bookingEmailTextField;
    @FXML
    private ChoiceBox bookingSpotsTaken;
    @FXML
    private Text showNameOnTour;
    @FXML
    private Button backToMainPageButton;
    @FXML
    private TextField cancelBookingID;
    @FXML
    private Button buttonCancel;


    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<Tour> tours = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tours = tourdataFactory.getTours();
        tourListView.setItems(tours);
    }
    public void addButtonOnActivityBookTour(ActionEvent actionEventBookTour) {
        System.out.println("Bóka ferð");
    }
    public void addButtonOnActivity(ActionEvent actionEvent) {
        System.out.println("halló");
    }
}
