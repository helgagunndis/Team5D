package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;

public class SearchController implements Initializable {
    @FXML
    private ListView<Tour> tourListView;
    @FXML
    private Date dateFrom, dateTo;
    @FXML
    private Button buttonFindTour,buttonBookTour, buttonAdministrator,buttonCancel;
    @FXML
    private TextField cancelBookingID;
    @FXML
    private TextField showFilterTextField;
    @FXML
    private SplitMenuButton regionSplitMenuButton;
    @FXML
    private SplitMenuButton durationSplitMenuButton;
    @FXML
    private SplitMenuButton servicesSplitMenuButton;
    @FXML
    private CheckMenuItem filterNorthRegion;
    @FXML
    private CheckMenuItem filterSouthRegion;
    @FXML
    private CheckMenuItem filterWestRegion;
    @FXML
    private CheckMenuItem filterEastRegion;


    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<Tour> tours = FXCollections.observableArrayList();

    FilteredList<Tour> filteredTours = new FilteredList<>(tourdataFactory.getTours());



    public void openBookingInformation(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("bookingInfo.fxml"));
        Parent tourSearchParent = loader.load();

        Scene tableViewScene = new Scene(tourSearchParent);

        //access the controller and call a method
        BookingInfoController controller = loader.getController();
        controller.initData(tourListView.getSelectionModel().getSelectedItem());

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //tours = tourdataFactory.getTours();

            filterNorthRegion.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    showFilterTextField.setText("Akureyri");
                }
            });
            filterSouthRegion.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    showFilterTextField.setText("Reykjavík");
                }
            });
            filterWestRegion.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    showFilterTextField.setText("Vestfirðir");
                }
            });
            filterEastRegion.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    showFilterTextField.setText("Egilsstaðir");
                }
            });
        /*
        showFilterTextField.textProperty().addListener(obs->{
            String filter = showFilterTextField.getText();
            if(filter == null || filter.length() == 0) {
                filteredTours.setPredicate(s -> true);
            }
            else {
                filteredTours.setPredicate(s -> s.contains(filter));
            }
        });

         */


        tourListView.setItems(filteredTours);
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
