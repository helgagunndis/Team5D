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
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookingInfoController implements Initializable {
    ObservableList<String> bookingSpotsList = FXCollections.observableArrayList("1","2","3","4","5","6","7","8","9","10");

    @FXML
    private Text showNameOnTour, bookingConfirmed;
    @FXML
    private TextField bookingNameTextField, bookingSSNTextField, bookingEmailTextField;
    @FXML
    private ChoiceBox bookingSpotsTaken;


    private Tour selectedTour;
    TourUserController userController= new TourUserController();
    TourBookingController bookingController= new TourBookingController();

    public void initData(Tour tour) {
        selectedTour = tour;
        showNameOnTour.setText(selectedTour.getTourName());
    }

    public void backToMainPageButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("search.fxml"));
        Parent searchPanel = loader.load();
        Scene tableViewScene = new Scene(searchPanel);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    public void bookTourButtonOnAction(ActionEvent actionEvent) {
        String SSN= bookingSSNTextField.getText();
        String name= bookingNameTextField.getText();
        String email= bookingEmailTextField.getText();
        User user = new User(SSN,name,email);
        userController.addNewUser(user);

        int spots= Integer.parseInt(bookingSpotsTaken.getValue().toString());
        Booking booking= new Booking(user, selectedTour,spots);
        bookingController.addBooking(booking);

        //bookingConfirmed.setText("Your booking number is : "+ booking.getBookingID());
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookingSpotsTaken.setItems(bookingSpotsList);
        bookingSpotsTaken.getSelectionModel().select("1");
    }
}
