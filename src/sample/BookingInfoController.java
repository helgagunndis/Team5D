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
    private TextField bookingNameTextField;
    @FXML
    private TextField bookingSSNTextField;
    @FXML
    private TextField bookingEmailTextField;
    @FXML
    private ChoiceBox bookingSpotsTaken;
    @FXML
    private Button bookTourButton;
    @FXML
    private Button backToMainPageButton;

    private Tour selectedTour;
    private TourDataFactory tourDataFactory = new TourDataFactory();

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
        TourUserController userController= new TourUserController();
        TourBookingController bookingController= new TourBookingController();
        String SSN= bookingSSNTextField.getText();
        String name= bookingNameTextField.getText();
        String email= bookingEmailTextField.getText();
        User user1 = new User(SSN,name,email);
        userController.addNewUser(user1);
        tourDataFactory.insert("ferð2", 23456);
        System.out.println("Gagnagrunnur");

        //String s=bookingSpotsTaken.getValue().toString();
        //int pax= Integer.parseInt(s);
        //Booking booking= new Booking(user1,selectedTour,pax);
        //bookingController.addBooking(booking);
        //int bookingID=booking.getBookingID();
        //System.out.print(bookingID);
        //bookingConfirmed.setText("Your booking number is : "+ bookingID);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bookingSpotsTaken.setItems(bookingSpotsList);
        bookingSpotsTaken.getSelectionModel().select("1");
    }
}
