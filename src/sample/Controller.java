package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


import java.net.URL;
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
    private Date dateFrom, dateTo;
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
    private Button buttonFindTour,buttonSearchBookTour,buttonAdministrator,buttonCancel;
    @FXML
    private TextField bookingNameTextField, bookingSSNTextField,bookingEmailTextField;
    @FXML
    private ChoiceBox bookingSpotsTaken;
    @FXML
    private Text showNameOnTour;
    @FXML
    private Button backToMainPageButton,bookTourButto;
    @FXML
    private TextField cancelBookingID;



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

    public void buttonFindTourOnAction(ActionEvent actionEvent) {
    }

    public void buttonAdministratorOnAction(ActionEvent actionEvent) {
    }

    public void buttonCancelOnAction(ActionEvent actionEvent) {
    }

    public void buttonSearchOnAction(ActionEvent actionEvent) {
    }
}
