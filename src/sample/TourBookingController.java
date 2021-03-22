package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class TourBookingController implements Initializable{

    private Tour selectedTour;

    @FXML
    private Text showNameOnTour;
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


    public void initData(Tour tour) {
        selectedTour = tour;
        showNameOnTour.setText(selectedTour.getTourName());
    }

    private String getRandomNum() {
        int length = 8;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";
        String str = new Random().ints(length, 0, chars.length())
                .mapToObj(i -> "" + chars.charAt(i))
                .collect(Collectors.joining());
        return str;
    }


    public void backToMainPageButtonOnAction(ActionEvent actionEvent) {
    }

    public void bookTourButtonOnAction(ActionEvent actionEvent) {
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }


}
