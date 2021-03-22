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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


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
    //@FXML
    //private Text showNameOnTour;
    @FXML
    private Button backToMainPageButton,bookTourButto;
    @FXML
    private TextField cancelBookingID;

    // This will pass the selected tour to the TourBookingController
    public Stage passTourToTourBookingController(Tour tour) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("bookingInformation.fxml"));

        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setScene(new Scene(loader.load()));

        TourBookingController controller = loader.getController();
        controller.initData(tourListView.getSelectionModel().getSelectedItem());

        stage.show();

        return stage;
    }




    // Open the TourBookingController to book selected tour.
    public void openBookingInformation(ActionEvent actionEventBookTour) throws IOException {

        Parent root = load(getClass().getResource("bookingInformation.fxml"));
        Stage stage2 = new Stage();
        stage2.setTitle("Day tour");
        stage2.setScene(new Scene(root, 600, 400));
        stage2.show();
        //System.out.println("Bóka ferð");
    }

    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<Tour> tours = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tours = tourdataFactory.getTours();
        tourListView.setItems(tours);
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
