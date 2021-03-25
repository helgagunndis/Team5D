package sample;

import javafx.beans.value.ObservableValue;
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
import java.time.Instant;
import java.util.Date;
import java.util.ResourceBundle;

import static javafx.fxml.FXMLLoader.load;

public class SearchController implements Initializable {
    @FXML
    private ListView<Tour> tourListView;
    @FXML
    private TextArea infoOnTourTextArea;
    @FXML
    private Date dateFrom, dateTo;
    @FXML
    private Button buttonFindTour,buttonBookTour, buttonAdministrator,buttonCancel;
    @FXML
    private TextField cancelBookingID;
    @FXML
    private TextField showFilterTextField;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private DatePicker endDatePicker;
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
    @FXML
    private CheckMenuItem filterToThreeHours;
    @FXML
    private CheckMenuItem filterThreeToFiveHours;
    @FXML
    private CheckMenuItem filterFiveToSevenHours;
    @FXML
    private CheckMenuItem filterFullDay;
    @FXML
    private CheckMenuItem filterServicesWheelchairAccessible;
    @FXML
    private CheckMenuItem filterServicesFamilyFriendly;


    private TourDataFactory tourdataFactory = new TourDataFactory();
    private ObservableList<Tour> allTours = FXCollections.observableArrayList(tourdataFactory.getTours());
    private ObservableList<Tour> filteredTours = FXCollections.observableArrayList();



    ObservableList<Tour> tourRegionSearch(String region, ObservableList<Tour> full) {
        ObservableList<Tour> result = FXCollections.observableArrayList();
        for (Tour tour : full) {
            if (tour.getTourRegion().contains(region)) {
                result.add(tour);
            }
        }
        return result;
    }

    ObservableList<Tour> tourDurationSearch(int duration1, int duration2, ObservableList<Tour> full) {
        ObservableList<Tour> result = FXCollections.observableArrayList();
        for (Tour tour : full) {
            if (tour.getDuration() > duration1 && tour.getDuration() <= duration2 ) {
                result.add(tour);
            }
        }
        return result;
    }

    ObservableList<Tour> tourServicesSearch(String service, ObservableList<Tour> full) {
        ObservableList<Tour> result = FXCollections.observableArrayList();
        for (Tour tour : full) {
            if (tour.getServices().contains(service) ) {
                result.add(tour);
            }
        }
        return result;
    }

    ObservableList<Tour> tourDateSearch(ObservableList<Tour> full) {

        ObservableList<Tour> result = FXCollections.observableArrayList();
        for (Tour tour : full) {
            if (tour.getTourDate().toInstant().isAfter(Instant.from(startDatePicker.getValue())) &&
                    tour.getTourDate().toInstant().isBefore(Instant.from(endDatePicker.getValue()))) {
                result.add(tour);
            }
        }
        return result;
    }


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

    public void buttonFindTourOnAction(ActionEvent actionEvent) {
        filteredTours = tourDateSearch(allTours);
        tourListView.setItems(filteredTours);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
            /*
            buttonFindTour.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    filteredTours = tourDateSearch(allTours);
                    tourListView.setItems(filteredTours);
                }
            });
             */

        filterNorthRegion.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourRegionSearch("Akureyri", allTours );
                showFilterTextField.setText("Akureyri");
                tourListView.setItems(filteredTours);
            }
        });
        filterSouthRegion.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourRegionSearch("Reykjavík", allTours );
                showFilterTextField.setText("Reykjavík");
                tourListView.setItems(filteredTours);
            }
        });
        filterWestRegion.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourRegionSearch("Vestfirðir", allTours );
                showFilterTextField.setText("Vestfirðir");
                tourListView.setItems(filteredTours);
            }
        });
        filterEastRegion.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourRegionSearch("Vestfirðir", allTours );
                showFilterTextField.setText("Egilsstaðir");
                tourListView.setItems(filteredTours);
            }
        });
        filterToThreeHours.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourDurationSearch(0, 3, allTours );
                showFilterTextField.setText("1 to 3 hours");
                tourListView.setItems(filteredTours);
            }
        });
        filterThreeToFiveHours.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourDurationSearch(3, 5, allTours );
                showFilterTextField.setText("3 to 5 hours");
                tourListView.setItems(filteredTours);
            }
        });
        filterFiveToSevenHours.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourDurationSearch(5, 7, allTours );
                showFilterTextField.setText("5 to 7 hours");
                tourListView.setItems(filteredTours);
            }
        });
        filterFullDay.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourDurationSearch(7, 24, allTours );
                showFilterTextField.setText("Full day (7+ hours)");
                tourListView.setItems(filteredTours);
            }
        });
        filterServicesWheelchairAccessible.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourServicesSearch("Wheelchair accessible", allTours);
                showFilterTextField.setText("Wheelchair accessible");
                tourListView.setItems(filteredTours);
            }
        });
        filterServicesFamilyFriendly.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                filteredTours = tourServicesSearch("Family friendly", allTours);
                showFilterTextField.setText("Family friendly");
                tourListView.setItems(filteredTours);
            }
        });

        tourListView.setItems(allTours);


        tourListView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends Tour> observable, Tour oldValue, Tour newValue) -> {
            if(tourListView.isFocused()){
                String info = String.format(newValue.getTourName() + "\n" +
                        newValue.getTourInfo());
                infoOnTourTextArea.setText(info);
            }
        });
    }

    public void addButtonOnActivity(ActionEvent actionEvent) {
        System.out.println("halló");
    }


    public void buttonAdministratorOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("adminLogin.fxml"));
        Parent searchPanel = loader.load();
        Scene tableViewScene = new Scene(searchPanel);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    public void buttonCancelOnAction(ActionEvent actionEvent) {
    }

    public void buttonSearchOnAction(ActionEvent actionEvent) {
    }
}