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

    /**
     * When this method is called, it will pass the selected Person object to
     * a the detailed view
     */

    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<Tour> tours = FXCollections.observableArrayList();

    public void openBookingInformation(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("bookingInformation.fxml"));
        Parent tourSearchParent = loader.load();

        Scene tableViewScene = new Scene(tourSearchParent);

        //access the controller and call a method
        TourBookingController controller = loader.getController();
        controller.initData(tourListView.getSelectionModel().getSelectedItem());

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

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
