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
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;

public class Controller implements Initializable {
    @FXML
    private ListView<Tour> tourListView;
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
    // This will pass the selected tour to the TourBookingController
    public void passTourToTourBookingController(ActionEvent actionEventBookTour) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("bookingInformation.fxml"));
        Parent root = loader.load();
        Scene rootScene = new Scene(root);

        // Access the controller and call a method
        TourBookingController controller = loader.getController();
        controller.initData(tourListView.getSelectionModel().getSelectedItem());

    }

    // Open the TourBookingController to book selected tour.
    public void addButtonOnActivityBookTour(ActionEvent actionEventBookTour) throws IOException {
        Tour tourToBook = (Tour) tourListView.getSelectionModel().getSelectedItem();
        Parent root = load(getClass().getResource("bookingInformation.fxml"));
        Stage stage2 = new Stage();
        stage2.setTitle("Day tour");
        stage2.setScene(new Scene(root, 600, 400));
        stage2.show();
        //System.out.println("Bóka ferð");
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
